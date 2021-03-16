import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        //arrange
        val post = Post()

        //act
        val result = WallService.add(post)

        //assert
        assertNotNull(result)


    }

    @Test
    fun update() {
        //arrange
        val post1 = Post(id = 1)
        val post2 = Post(id = 2)
        val post3 = Post(id = 3)


        WallService.add(post1)
        WallService.add(post2)
        WallService.add(post3)

        //act
        val update = Post()
        val result = WallService.update(update)

        //assert
        assertTrue(result)
    }

}