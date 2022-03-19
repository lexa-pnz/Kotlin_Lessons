package Ex5

class Ex5Main {

    fun ex5MainStr() {
        val myDog = Dog("Fido", 70, "Mixed", 1)
        myDog.bark()
        myDog.weight = 75
        println("Weight in Kgs is ${myDog.weightInKgs}")
        myDog.weight = -2
        println("Weight is ${myDog.weight}")
        myDog.activities = arrayOf("Walks", "Fetching balls", "Frisbee")

        for (item in myDog.activities) {
            println("My dog enjoys $item")
        }

        val dogs = arrayOf(Dog("Kelpie", 20, "Westie", 2), Dog("Ripper", 10, "Poodle",3))
        dogs[1].bark()
        dogs[1].weight = 15
        println("Weight for ${dogs[1].name} is ${dogs[1].weight}")

    }
}
