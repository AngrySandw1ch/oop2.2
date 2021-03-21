package attachments

import attachments.Attachment
import attachments.Photo

class PhotoAttachment(
    id: Int,
    albumId: Int,
    ownerId: Int,
    userId: Int,
    text: String,
    date: Int,
    size: Array<Int> = emptyArray(),
    width: Int,
    height: Int,
    override val type: String = "attachments.Photo",
    override val objectType: Any = Photo(
        id,
        albumId,
        ownerId,
        userId,
        text,
        date,
        size,
        width,
        height
    )
): Attachment {
}