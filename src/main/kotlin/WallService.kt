import attachments.*
import postExceptions.CommentNotFoundException
import postExceptions.PostNotFoundException

object WallService {
    private var posts = emptyArray<Post>()
    private var attachments = emptyArray<Attachment>()
    private var comments = emptyArray<Comment>()
    private var reports = emptyArray<Comment>()

    fun add(post: Post): Post {
        val postWithId = if (posts.isEmpty()) post.copy(id = 1) else post.copy(id = posts.last().id?.plus(1))
        posts += postWithId
        return posts.last()
    }

    fun update(incomingPost: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (incomingPost.id == post.id) {
                posts[index] = post.copy(
                    ownerId = 111,
                    fromId = 222,
                    createdBy = 333,
                    text = "new text",
                    replyOwnerId = 555,
                    replyPostId = 666,
                    friendsOnly = 777
                )
                return true
            }
        }
        return false
    }

    fun addAttachment(attachment: Attachment): Attachment {
        attachments += attachment
        return attachments.last()
    }

    fun createComment(comment: Comment) {
        for (post: Post in posts) {
            if(post.id != comment.fromId) {
                continue
            } else {
                comments += comment
                return
            }
        }
        throw PostNotFoundException("Пост не найден, комментарий не добавлен")
    }

    fun reportComment(incomingComment: Comment, reason: Int) {
        for (comment in comments) {
            if (comment.id != incomingComment.id) {
                continue
            } else {
                if (reason < 0 || reason > 7) {
                    return
                }
               val reportedComment = when(reason) {
                   0 -> incomingComment.copy(reportReason = "спам")
                   1 -> incomingComment.copy(reportReason = "детская порнография")
                   2 -> incomingComment.copy(reportReason = "экстремизм")
                   3 -> incomingComment.copy(reportReason = "насилие")
                   4 -> incomingComment.copy(reportReason = "пропаганда наркотиков")
                   5 -> incomingComment.copy(reportReason = "материал для взрослых")
                   6 -> incomingComment.copy(reportReason = "оскорбление")
                   7 -> incomingComment.copy(reportReason = "призыв к суициду")
                   else -> incomingComment.copy(reportReason = null)
               }
                reports += reportedComment
                return
            }
        }
        throw CommentNotFoundException("Комменатрий с заданным Id не найден")
    }
}