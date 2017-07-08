package com.hendisantika.oprek.test

import org.junit.Test
import kotlin.test.assertEquals

/**
 * Created by hendisantika on 7/9/17.
 */
class LambdaTest {
    @Test
    fun givenListOfNumber_whenDoingOperationsUsingLambda_shouldReturnProperResult() {
        //given
        val listOfNumbers = listOf(1, 2, 3)

        //when
        val sum = listOfNumbers.reduce { a, b -> a + b }

        //then
        assertEquals(6, sum)
    }
}