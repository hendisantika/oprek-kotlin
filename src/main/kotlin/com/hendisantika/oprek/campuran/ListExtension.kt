package com.hendisantika.oprek.campuran

import java.util.concurrent.ThreadLocalRandom

/**
 * Created by hendisantika on 7/3/17.
 */
class ListExtension {
    fun <T> List<T>.random(): T? {
        if (this.isEmpty()) return null
        return get(ThreadLocalRandom.current().nextInt(count()))
    }

    fun <T> getRandomElementOfList(list: List<T>): T? {
        return list.random()
    }
}
