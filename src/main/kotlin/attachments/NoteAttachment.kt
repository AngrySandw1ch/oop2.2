package attachments

import attachments.Attachment
import attachments.Note

class NoteAttachment(
    id: Int,
    ownerId:Int,
    title: String,
    text: String,
    date: Int,
    comments: Int,
    readComments: String,
    viewUrl: String,
    override val type: String = "attachments.Note",
    override val objectType: Note = Note(
        id,
        ownerId,
        title,
        text,
        date,
        comments,
        readComments,
        viewUrl
    )
): Attachment {
}