import postComponents.*

object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        val postWithId = if (posts.isEmpty()) post.copy(id = 1) else post.copy(id = posts.last().id + 1)
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
}