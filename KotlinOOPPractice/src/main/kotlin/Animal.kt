import org.kotlin.main

open class Animal(val name: String) {
    fun eat() {
        println("$name is eating")
    }

    // Phải có 'open' thì lớp con mới ghi đè (override) được hàm này
    open fun makeSound() {
        println("$name makes a sound")
    }
}