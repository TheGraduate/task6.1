import org.junit.Assert.*
import org.junit.Test
import java.lang.Exception

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
            PostSource("2","2","4","4"),
            PhotoAttachment(),
            Geo("1","2","3"),
            1,
            null,
            true,
            true,
            true,
            1,
            true,
            true,
            Donut(true,2,true,true,"5"),
            1
        )

        //act
        val postTestTemp = WallService.add(postTest)
        val expected = postTest.copy(id=2)

        //assert
        assertEquals(expected, postTestTemp)
    }

    @Test
    fun update_return_true() {
        //arrange
        val postTest = Post(1,
            1,
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
            PostSource("2","2","4","4"),
            PhotoAttachment(),
            Geo("1","2","3"),
            1,
            null,
            true,
            true,
            true,
            1,
            true,
            true,
            Donut(true,2,true,true,"5"),
            1
        )

        //act
        val result = WallService.update(postTest)


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
            PostSource("2","2","4","4"),
            PhotoAttachment(),
            Geo("1","2","3"),
            1,
            null,
            false,
            false,
            false,
            1,
            false,
            true,
            Donut(false,2,false,true,"5"),
            1
        )

        //act
        val result = WallService.update(postTest)

        //assert
        assertFalse(result)
    }

    @Test
    //(expected = Exception::class)
   fun test_Exception() {
        //arrange
        val posttestt =  Post(4,
            2,
            3,
            12,
            1,
            "1",
            3,
            3,
            5,
            2,
            1,
            5,
            1,
            2,
            "post",
            postSource = PostSource("2","2","1","1"),
            attachments = PhotoAttachment(),
            geo = Geo("2","2","1"),
            1,
            null,
            true,
            true,
            true,
            1,
            true,
            true,
            donut = Donut(true,2,true,true,"5"),
            4
        )
        //act
        WallService.add(posttestt)
        //assert
        val commentTest = Comment(1,1,3,"4",5,6,1)
        val testCreateComment  = WallService.createComment(commentTest)
        assertEquals(Unit, testCreateComment)
    }

    @Test (expected = PostNotFoundException::class)
    fun should_throw_createComment() {
        val commentTest = Comment(1,5,3,"4",5,6,7)
        WallService.createComment(commentTest)
    }
}

