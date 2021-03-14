import postComponents.*

object WallService {
    private var posts = emptyArray<Post>()
    var uniqueId = 0

    fun add(post: Post): Post {
        val postWithId = post.copy(id = post.id + uniqueId)
        posts += postWithId
        uniqueId++
        return postWithId
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