import kotlin.system.exitProcess

fun main() {
    println("Name That Color Material")
    println("To exit type 0")
    while (true) {
        println("What's your color name?")
        val inputText = readLine()
        if (inputText == "0") exitProcess(0)
        try {
            val colorName = ColorNameFinder.findMaterialColor(HexColor(inputText ?: ""))
            println("ColorName is: ${colorName.second.name}")
        } catch (e: Exception) {
            println("Try again")
        }
    }
}
