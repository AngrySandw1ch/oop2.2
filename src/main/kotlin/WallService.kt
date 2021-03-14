object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post) {
        posts += post
    }
}