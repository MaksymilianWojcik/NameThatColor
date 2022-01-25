data class Rgb(val r: Int, val g: Int, val b: Int) {
    fun percent(): Triple<Double, Double, Double> = Triple(r / 255.0, g / 255.0, b / 255.0)
}

data class Hsl(val h: Int, val s: Int, val l: Int)

data class Color(val hexCode: String, val name: String, val rgb: Rgb, val hsl: Hsl)