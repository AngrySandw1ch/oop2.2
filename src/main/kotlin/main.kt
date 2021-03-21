import attachments.*
import postComponents.*

fun main() {
    val post1 = Post()
    val post2 = Post()
    val post3 = Post()


    val resultOne = WallService.add(post1)
    println("ID первого поста: ${resultOne.id}")
    val resultTwo = WallService.add(post2)
    println("ID второго поста: ${resultTwo.id}")
    val resultThree = WallService.add(post3)
    println("ID третьего поста: ${resultThree.id}")

    val postOneIsChange = WallService.update(resultOne)
    println("Пост изменен: $postOneIsChange")
    val postTwoIsChange = WallService.update(resultTwo)
    println("Пост изменен: $postTwoIsChange")
    val postThreeIsChange = WallService.update(resultThree)
    println("Пост изменен: $postThreeIsChange")

    val noteAttachment = NoteAttachment(
        12,
        13,
        "title",
        "text",
        28,
        50,
        "readComments",
        "viewUrl"
    )
    val pageAttachment = PageAttachment(
        33,
        12,
        33,
        "title",
        true,
        true,
        12,
        14,
        22,
        22,
        228,
        "parent",
        "parent2",
        "source",
        "html",
        "viewUrl"
    )
    val photoAttachment = PhotoAttachment(
        4,
        6,
        12,
        14,
        "text",
        23,
        emptyArray(),
        14,
        16
    )
    val postSourceAttachment = PostSourceAttachment(
        "type",
        "platform",
        "data",
        "url"
    )
    val audioAttachment = AudioAttachment(
        23,
        443,
        "artist",
        "title",
        223,
        "url",
        213,
        23,
        2256,
        13,
        true,
        true
    )

    val pageAdded = WallService.addAttachment(pageAttachment)
    println("Added object ${pageAdded.type}")
    val noteAdded = WallService.addAttachment(noteAttachment)
    println("Added object ${noteAdded.type}")
    val photoAdded = WallService.addAttachment(photoAttachment)
    println("Added object ${photoAdded.type}")
    val postSourceAdded = WallService.addAttachment(postSourceAttachment)
    println("Added object ${postSourceAdded.type}")
    val audioAdded = WallService.addAttachment(audioAttachment)
    println("Added object ${audioAdded.type}")
}