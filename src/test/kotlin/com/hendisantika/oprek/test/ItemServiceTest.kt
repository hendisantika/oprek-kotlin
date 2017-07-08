package com.hendisantika.oprek.test

import com.hendisantika.oprek.campuran.ItemService
import org.junit.Test
import kotlin.test.assertNotNull

/**
 * Created by hendisantika on 7/9/17.
 */
class ItemServiceTest {
    @Test
    fun givenItemId_whenGetForOptionalItem_shouldMakeActionOnNonNullValue() {
        //given
        val id = "item_id"
        val itemService = ItemService()

        //when
        val result = itemService.findItemNameForId(id)

        //then
        assertNotNull(result?.let { it -> it.id })
        assertNotNull(result!!.id)
    }
}