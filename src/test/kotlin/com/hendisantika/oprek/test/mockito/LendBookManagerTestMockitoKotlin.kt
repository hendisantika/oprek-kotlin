package com.hendisantika.oprek.test.mockito

import com.hendisantika.oprek.campuran.mockito.BookService
import com.hendisantika.oprek.campuran.mockito.LendBookManager
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import com.nhaarman.mockito_kotlin.whenever
import org.junit.Test

/**
 * Created by hendisantika on 7/3/17.
 */
class LibraryManagementTestMockitoKotlin {
    @Test(expected = IllegalStateException::class)
    fun whenBookIsNotAvailable_thenAnExceptionIsThrown() {
        val mockBookService = mock<BookService>()

        whenever(mockBookService.inStock(100)).thenReturn(false)

        val manager = LendBookManager(mockBookService)

        manager.checkout(100, 1)
    }

    @Test
    fun whenBookIsAvailable_thenLendMethodIsCalled() {
        val mockBookService : BookService = mock()

        whenever(mockBookService.inStock(100)).thenReturn(true)

        val manager = LendBookManager(mockBookService)

        manager.checkout(100, 1)

        verify(mockBookService).lend(100, 1)
    }
}