package com.hendisantika.oprek.campuran.mockito

/**
 * Created by hendisantika on 7/3/17.
 */
class LendBookManager(val bookService:BookService) {
    fun checkout(bookId: Int, memberId: Int) {
        if(bookService.inStock(bookId)) {
            bookService.lend(bookId, memberId)
        } else {
            throw IllegalStateException("Book is not available")
        }
    }
}