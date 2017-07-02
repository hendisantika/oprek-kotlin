package com.hendisantika.oprek.test

import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking
import org.junit.Test
import java.util.concurrent.atomic.AtomicInteger
import kotlin.test.assertEquals

/**
 * Created by hendisantika on 7/2/17.
 */
@Test
fun givenHugeAmountOfCoroutines_whenStartIt_thenShouldExecuteItWithoutOutOfMemory() {
    runBlocking<Unit> {
        // given
        val counter = AtomicInteger(0)
        val numberOfCoroutines = 100_000

        // when
        val jobs = List(numberOfCoroutines) {
            launch(CommonPool) {
                delay(1000L)
                counter.incrementAndGet()
            }
        }
        jobs.forEach { it.join() }

        // then
        assertEquals(counter.get(), numberOfCoroutines)
    }
}