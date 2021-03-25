import attachments.NoteAttachment
import org.junit.Test

import org.junit.Assert.*
import postComponents.Donut
import postExceptions.CommentNotFoundException
import postExceptions.PostNotFoundException

class WallServiceTest {

    @Test
    fun add() {
        //arrange
        val post = Post()

        //act
        val expectedPost = Post(id = 6)
        val result = WallService.add(post)

        //assert
        assertEquals(result.id, expectedPost.id)
    }

    @Test
    fun update_caseTrue() {
        //arrange
        val post1 = Post(id = 1)
        val post2 = Post(id = 2)
        val post3 = Post(id = 3)


        WallService.add(post1)
        WallService.add(post2)
        WallService.add(post3)

        //act
        val update = Post(1)
        val result = WallService.update(update)

        //assert
        assertTrue(result)
    }

    @Test
    fun update_caseFalse() {
        //arrange
        val update = Post(id = 10)

        //act
        val result = WallService.update(update)

        //assert
        assertFalse(result)
    }

    @Test
    fun addAttachment() {
        //arrange
        val noteAttachment = NoteAttachment(
            4,
            4,
            "title",
            "text",
            23,
            22,
            "readComments",
            "viewYrl"
        )
        //act
        val result = WallService.addAttachment(noteAttachment)
        //assert
        assertEquals(result.type, noteAttachment.type)
    }

    @Test
    fun createComment() {
        //arrange
        val post = Post()
        WallService.add(post)
        val comment = Comment(
            1,
            1,
            22,
            "text",
            Donut(),
            12,
            NoteAttachment(
                12,
                14,
                "title",
                "text",
                22,
                22,
                "readComments",
                "viewUrl"
            )
        )
        //act
        WallService.createComment(comment)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldNotAdd() {
        //arrange
        val post = Post()
        WallService.add(post)
        val comment = Comment(
            1,
            10,
            22,
            "text",
            Donut(),
            12,
            NoteAttachment(
                12,
                14,
                "title",
                "text",
                22,
                22,
                "readComments",
                "viewUrl"
            )
        )
        //act
        WallService.createComment(comment)
    }

    @Test
    fun reportComment() {
        //arrange
        val post = Post()
        WallService.add(post)
        val comment = Comment(
            1,
            1,
            22,
            "text",
            Donut(),
            12,
            NoteAttachment(
                12,
                14,
                "title",
                "text",
                22,
                22,
                "readComments",
                "viewUrl"
            )
        )
        WallService.createComment(comment)
        //act
        WallService.reportComment(comment, 2)
    }

    @Test(expected = CommentNotFoundException::class)
    fun shouldNotAddComment() {
        //arrange
        val post = Post()
        WallService.add(post)
        val comment = Comment(
            1,
            1,
            22,
            "text",
            Donut(),
            12,
            NoteAttachment(
                12,
                14,
                "title",
                "text",
                22,
                22,
                "readComments",
                "viewUrl"
            )
        )
        WallService.createComment(comment)
        val comment1 = Comment(
            3,
            1,
            22,
            "text",
            Donut(),
            12,
            NoteAttachment(
                12,
                14,
                "title",
                "text",
                22,
                22,
                "readComments",
                "viewUrl"
            )
        )
        //act
        WallService.reportComment(comment1, 2)
    }
}


