package com.hendisantika.oprek.campuran.mockito

/**
 * Created by hendisantika on 7/3/17.
 */
interface BookService {
    fun inStock(bookId: Int): Boolean
    fun lend(bookId: Int, memberId: Int)
}