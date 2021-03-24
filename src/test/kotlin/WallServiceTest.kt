import attachments.Attachment
import attachments.NoteAttachment
import org.junit.Test

import org.junit.Assert.*
import org.junit.jupiter.api.assertThrows
import postComponents.Donut
import postExceptions.PostNotFoundException

class WallServiceTest {

    @Test
    fun add() {
        //arrange
        val post = Post()

        //act
        val expectedPost = Post(id = 4)
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
        val update = Post(id = 5)

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
}


