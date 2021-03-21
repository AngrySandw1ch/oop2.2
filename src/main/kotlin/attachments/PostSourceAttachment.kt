package attachments

import attachments.Attachment
import attachments.PostSource

class PostSourceAttachment(
    ttype: String,
    platform: String,
    data: String,
    url: String,
    override val type: String = "attachments.PostSource",
    override val objectType: PostSource = PostSource(
        ttype,
        platform,
        data,
        url)
): Attachment {
}