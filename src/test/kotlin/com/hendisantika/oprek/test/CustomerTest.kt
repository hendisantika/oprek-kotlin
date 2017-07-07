package com.hendisantika.oprek.test

import com.hendisantika.java.Customer
import org.junit.Test
import kotlin.test.assertEquals

/**
 * Created by hendisantika on 7/6/17.
 */
class CustomerTest {
    @Test
    fun givenCustomer_whenNameAndLastNameAreAssigned_thenComplete() {
        val customer = Customer()

        // Setter method is being called
        customer.firstName = "Frodo"
        customer.lastName = "Baggins"

        // Getter method is being called
        assertEquals(customer.firstName, "Frodo")
        assertEquals(customer.lastName, "Baggins")
    }
}