package data


class Car(paramBrand: String, paramYear: Int) {
    init{
        println("Initializer Block")
    }
    var brand: String = paramBrand
    var year : Int = paramYear
}