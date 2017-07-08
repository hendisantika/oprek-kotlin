package com.hendisantika.oprek.test

import com.hendisantika.java.StringUtils
import org.junit.Test
import kotlin.test.assertEquals

/**
 * Created by hendisantika on 7/9/17.
 */
class KotlinJavaInteroperabilityTest {
    @Test
    fun givenLowercaseString_whenExecuteMethodFromJavaStringUtils_shouldReturnStringUppercase() {
        //given
        val name = "hendisantika"

        //whene
        val res = StringUtils.toUpperCase(name)

        //then
        assertEquals(res, "HENDISANTIKA")
    }
}