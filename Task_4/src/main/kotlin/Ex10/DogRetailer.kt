package Ex10

class DogRetailer : Retailer<Dog> { override fun sell(): Dog {
        println("Sell Dog")
        return Dog("")
    }
}