package Ex1

import MyWolf
import Wolf
import getAlphaWolf

private val Nothing.hunger: Unit
    get() {}

class WolfStart {
    fun WolfStr(){
        var w: Wolf? = Wolf()
        if (w != null) {
            w.eat()
        }
        var x = w?.hunger
        println("The value of x is $x")
        var y = w?.hunger ?: -1
        println("The value of y is $y")
        var myWolf = MyWolf()
        myWolf?.wolf?.hunger = 8
        println("The value of myWolf?.wolf?.hunger is ${myWolf?.wolf?.hunger}")
        var myArray = arrayOf("Hi", "Hello", null)
        for (item in myArray) {
            item?.let { println(it) }
        }
        getAlphaWolf()?.let { it.eat() }
        w = null
        var z = w!!.hunger
    }
}