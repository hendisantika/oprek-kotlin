package com.hendisantika.oprek.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hendisantika on 7/2/17.
 */
public class JavaCallToKotlinUnitTest {
    @Test
    public void givenKotlinClass_whenCallFromJava_shouldProduceResults() {
        //when
        int res = new MathematicsOperations().addTwoNumbers(2, 4);

        //then
        assertEquals(6, res);

    }
}
