package Ex10

class FishRetailer : Retailer<Fish> { override fun sell(): Fish {
        println("Sell Fish")
        return Fish("")
    }
}