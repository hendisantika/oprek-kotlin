package com.hendisantika.oprek.campuran

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * Created by hendisantika on 7/1/17.
 */
open class PropertyChangeAware {

    protected val propertyChangeSupport = PropertyChangeSupport(this)

    fun addPropertyChangeListener(listener: PropertyChangeListener) {
        propertyChangeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeListener(listener: PropertyChangeListener)
    {
        propertyChangeSupport.removePropertyChangeListener(listener)
    }
}


class Person(val name: String, age: Int, message: String) : PropertyChangeAware() {

    private val observer = {
        property: KProperty<*>,
        oldValue: Any,
        newValue: Any -> propertyChangeSupport.firePropertyChange(property.name, oldValue, newValue)
    }

    var age: Int by Delegates.observable(age, observer)
    var message: String by Delegates.observable(message, observer)
}


fun main(args: Array<String>) {

    val person = Person("Andrien", 27, "Kotlination.com is good!")

    person.addPropertyChangeListener(
            PropertyChangeListener { event ->
                println("Property [${event.propertyName}] changed " + "from [${event.oldValue}] to [${event.newValue}]")
            }
    )

    person.age = 28
    person.message = "Be a Kotlineer."
}