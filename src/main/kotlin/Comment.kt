import attachments.Attachment
import postComponents.Donut

class Comment(
    val id: Int,
    val fromId: Int,
    val date: Int,
    val text: String,
    val donut: Donut,
    val replyToUser: Int,
    val attachment: Attachment
    ) {
}