fun main(args: Array<String>) {
    val index = arrayOf(1, 3, 4, 2)
    val fruit = arrayOf("Apple", "Banana", "Cherry", "Blueberry", "Pomegranate")

    var y: Int
    for (x in 0 until 4) {
        y = index[x]
        println("Fruit = ${fruit[y]}")
    }

}