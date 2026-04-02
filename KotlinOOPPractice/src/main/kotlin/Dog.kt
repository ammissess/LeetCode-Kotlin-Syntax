import org.kotlin.main

class Dog (name: String) : Animal(name) {
    override fun makeSound() {
        println("$name says: Woof!")
    }
}