import attachments.Attachment
import postComponents.Donut

data class Comment(
    val id: Int,
    val fromId: Int,
    val date: Int,
    val text: String,
    val donut: Donut,
    val replyToUser: Int,
    val attachment: Attachment,
    val reportReason: String? = null
    ) {
}