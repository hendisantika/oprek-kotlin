package com.hendisantika.oprek.test

import com.hendisantika.oprek.campuran.ListExtension
import org.junit.Test
import kotlin.test.assertTrue

/**
 * Created by hendisantika on 7/10/17.
 */
class ListExtensionTest {
    @Test
    fun givenList_whenExecuteExtensionFunctionOnList_shouldReturnRandomElementOfList(){
        //given
        val elements = listOf("a", "b", "c")

        //when
        val result = ListExtension().getRandomElementOfList(elements)

        //then
        assertTrue(elements.contains(result))
    }
}