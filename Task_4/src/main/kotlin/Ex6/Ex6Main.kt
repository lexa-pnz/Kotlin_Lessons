package Ex6

class Ex6Main {
    fun ex6Str(){
        val animals = arrayOf(Hippo(), Wolf())

        for (item in animals) {
            item.roam()
            item.eat()
        }

        val vet = Vet()
        val wolf = Wolf()
        val hippo = Hippo()
        vet.giveShot(wolf)
        vet.giveShot(hippo)
    }
}