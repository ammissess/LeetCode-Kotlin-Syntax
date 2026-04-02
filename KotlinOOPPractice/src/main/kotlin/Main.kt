package org.kotlin

import Dog
import org.example.Student


class boook (val title : String, val price: Double){
/*    init {
        //kiem tra dieu kien : price >0
        require(price > 0 );
    }*/

    constructor(title: String): this(title, 0.0){
        // constructor phu
    }


}




fun main(){
    val b1 = boook("Kotlin Apple", 3.0)
    val b2 = boook("Kotlin banena")
    println("${b1.title} is ${b1.price}")
    println("${b2.title} is ${b2.price}")

    val dog = Dog("Hussky");
    var link : String? = "https://gemini.google.com/share/f87e40bf18ab"

    dog.makeSound()

}

