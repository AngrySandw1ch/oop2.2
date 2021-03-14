import postComponents.*

data class Post(
    val id: Int = 1,
    val ownerId: Int = 2,
    val fromId: Int = 3,
    val createdBy: Int = 4,
    val date: Int = 5,
    val text: String = "some text",
    val replyOwnerId: Int = 6,
    val replyPostId: Int = 7,
    val friendsOnly: Int = 8,
    val comments: Comments = Comments(),
    val copyright: Copyright = Copyright(),
    val likes: Likes = Likes(),
    val reposts: Reposts = Reposts(),
    val views: Views = Views(),
    val postType: String = "some post",
    val signerId: Int = 9,
    val canPin: Boolean = false,
    val isPined: Boolean = false,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = false,
    val donut: Donut = Donut(),
    val postponedId: Int = 10
) {
}