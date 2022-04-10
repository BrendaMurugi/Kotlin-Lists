//Given a list of 10 strings, write a function that returns a list of the strings at even indices

fun main() {
    var result = majina(listOf("Brenda", "Brandon", "Marques", "Lloyd", "Karll", "Ethan", "Kendi", "Marshalls", "Imela", "Amira"))

    var result2 = height(listOf(1.5, 0.7, 1.3))

    var brenda = Person("Brenda", 21, 1.5, 47.5)
    var kirigo = Person("Kirigo", 23, 1.7, 50.5)
    var cudra = Person("Cudra", 21, 1.9, 30.5)
    var salma = Person("Salma", 22, 1.0, 45.0)
    var shamim = Person("Shamim", 20, 1.3, 57.3)
    var myClassmates = listOf(brenda, kirigo, cudra, salma, shamim)
    var peeps = myClassmates.sortedByDescending { person -> person.age  }
    println(peeps)

    var shamse = Person("Shamse", 24, 1.2, 55.3)
    var bree = Person("Bree", 16, 1.0, 37.3)
    var new = mutableListOf(shamse, bree)
    println(myClassmates.plus(new))

    var a = Car("KBB 234B", 56)
    var b = Car("KDE 678F", 34)
    var cars = listOf(a, b)
    println(carDetails(cars))

}
//Create a function and it's a list. It's output is a list.
//Loop through the function.
fun majina(names:List<String>):List<String> {
    names.forEachIndexed { index, s ->
        if (index % 2 == 0) {
            println(s)
        }
    }
    return names
}
//Given a list of people's heights in metres. Write a function that returns the average height and the total height
fun height(values:List<Double>):String {
    var addition = values.sum()
    var averageHeight = values.average()
    var both = "$addition, $averageHeight"
    println(both)
    return both
}
//Given a list of Person objects,each with the attributes, name, age, height and weight. Sort the list in order of
//descending age.
data class Person(var name:String, var age:Int, var height:Double, var weight:Double)

//Given a list similar to the one above, write a function in which you will create 2 more people
//objects and add them to the list at one go

fun morePeople(more:List<Any>):List<Any> {
        return  listOf()
}
//Write a function that takes in a list of car objects each with a  registration and mileage attribute and
//returns the average mileage of all the vehicles in the list

fun carDetails(f:List<Car>):Int {
    var z = 0
    f.forEach { gari -> gari.mileage
        z += gari.mileage
    }
    var total = z/f.count()
    return total
}

data class Car(var registration:String, var mileage:Int)