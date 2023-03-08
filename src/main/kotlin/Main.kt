fun main() {

val car = Car("Ferrari","E300","Red",2)
car.carry(2)
    car.carry(5)
    car.identity()
    car.calculateParkingFees(2)
val result =car.calculateParkingFees(2)
    println(result)
val bus =Bus("Mercedes Benz","E200","White",60)
    bus.carry(60)
    bus.identity()
    val fee =bus.calculateParkingFees(4)
    println(fee)
   val total= bus.maxTripFare(1500.80)
    println(total)
}
open class Car(var make:String,var model:String,var color:String,var capacity:Int) {
    fun carry(people: Int) {
        if (people<=capacity) {
            println("Carrying $people passengers")
        }
        else{
           val x = people-capacity
           println("Over capacity by $x people")
        }

    }
    fun identity(){
        println("I am a $color $make $model")
    }
  open  fun calculateParkingFees(hours:Int):Int{
        return hours *20
    }
}
class Bus(make: String, model: String, color: String,capacity: Int):Car(make, model, color, capacity) {
    fun maxTripFare(fare: Double): Double {
        return capacity*fare
    }

    override fun calculateParkingFees(hours: Int): Int {
        return hours*capacity
    }

}
