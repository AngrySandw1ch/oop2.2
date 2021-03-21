package attachments

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
    override val type: String = "attachments.Audio",
    override val objectType: Audio = Audio(
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
): Attachment {

}