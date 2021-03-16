import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun update_caseTrue() {
        //arrange
        val service = WallService()

        val post1 = Post(id = 1)
        val post2 = Post(id = 2)
        val post3 = Post(id = 3)

        service.add(post1)
        service.add(post2)
        service.add(post3)

        //act
        val update = Post()
        val result = service.update(update)

        //assert
        assertTrue(result)

    }

    @Test
    fun update_caseFalse() {
        //arrange
        val service = WallService()

        val post1 = Post(id = 1)
        val post2 = Post(id = 2)
        val post3 = Post(id = 3)

        service.add(post1)
        service.add(post2)
        service.add(post3)

        //act
        val update = Post(id = 4)
        val result = service.update(update)

        //assert
        assertFalse(result)

    }
}