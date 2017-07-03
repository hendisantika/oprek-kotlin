package com.hendisantika.oprek.campuran

/**
 * Created by hendisantika on 7/3/17.
 */
open class Item(val id: String, val name: String = "unknown_name") {
    open fun getIdOfItem(): String {
        return id
    }
}

class ItemWithCategory(id: String, name: String, val categoryId: String) : Item(id, name) {
    override fun getIdOfItem(): String {
        return id + name
    }
}