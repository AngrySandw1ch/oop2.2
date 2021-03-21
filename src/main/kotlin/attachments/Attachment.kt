package attachments

sealed class Attachment {
    abstract val type: String

}
class AudioAttachment(
    id: Int,
    ownerId: Int,
    artist: String,
    title: String,
    duration: Int,
    url: String,
    lyricsId: Int,
    albumId: Int,
    genreId: Int,
    date: Int,
    noSearch: Boolean,
    isHq: Boolean,
    override val type: String = "Audio",
    val audio: Audio = Audio(
        id,
        ownerId,
        artist,
        title,
        duration,
        url,
        lyricsId,
        albumId,
        genreId,
        date,
        noSearch,
        isHq
    )
): Attachment() {
}

class NoteAttachment(
    id: Int,
    ownerId:Int,
    title: String,
    text: String,
    date: Int,
    comments: Int,
    readComments: String,
    viewUrl: String,
    override val type: String = "Note",
    val note: Note = Note(
        id,
        ownerId,
        title,
        text,
        date,
        comments,
        readComments,
        viewUrl
    )
): Attachment() {
}

class PageAttachment(
    id: Int,
    groupId: Int,
    creatorId: Int,
    title: String,
    currentUserCanEdit: Boolean,
    currentUserCanEditAccess: Boolean,
    whoCanView: Int,
    edited: Int,
    created: Int,
    editorId: Int,
    views: Int,
    parent: String,
    parent2: String,
    source: String,
    html: String,
    viewUrl: String,
    override val type: String = "Page",
    val page: Page = Page(
        id,
        groupId,
        creatorId,
        title,
        currentUserCanEdit,
        currentUserCanEditAccess,
        whoCanView,
        edited,
        created,
        editorId,
        views,
        parent,
        parent2,
        source,
        html,
        viewUrl
    )
) : Attachment() {
}

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
    override val type: String = "Photo",
    val photo: Photo = Photo(
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
): Attachment() {
}

class PostSourceAttachment(
    ttype: String,
    platform: String,
    data: String,
    url: String,
    override val type: String = "PostSource",
    val postSource: PostSource = PostSource(
        ttype,
        platform,
        data,
        url)
): Attachment() {
}