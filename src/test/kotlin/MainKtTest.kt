import org.junit.Assert.*
import org.junit.Test

class MainKtTest {
    @Test
    fun add_postId_Not_0() {
        //arrange
        val postTest = Post(24,
            5,
            1,
            12,
            1,
            "1",
            1,
            1,
            1,
            2,
            1,
            5,
            1,
            2,
            "1",
            1,
            true,
            true,
            true,
            1,
            true,
            true,
            1,
            1
        )

        //act
        val postTestTemp = WallService.add(postTest)
        val result = postTestTemp.id

        //assert
        assertNotEquals(0, result)
    }

    @Test
    fun update_return_true() {
        //arrange
        val postTest = Post(24,
            5,
            1,
            12,
            1,
            "1",
            1,
            1,
            1,
            2,
            1,
            5,
            1,
            2,
            "1",
            1,
            true,
            true,
            true,
            1,
            true,
            true,
            1,
            1
        )

        //act
        val result = WallService.update(1)

        //assert
        assertTrue(result)
    }

    @Test
    fun update_return_false() {
        //arrange
        val postTest = Post(24,
            5,
            1,
            12,
            1,
            "1",
            1,
            1,
            1,
            2,
            1,
            5,
            1,
            2,
            "1",
            1,
            true,
            true,
            true,
            1,
            true,
            true,
            1,
            1
        )

        //act
        val result = WallService.update(2)

        //assert
        assertFalse(result)
    }
}