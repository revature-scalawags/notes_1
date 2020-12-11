package week1

import java.io.FileNotFoundException
import java.io.IOException
import scala.util.Random

object week0_notes extends App {
    /*
        REPL
        Introduction to functional programming
            Tuples
            functions
            pure and impure functions
            higher order functions
        Syntax
            Variables and values
            Conditionas and Loops
            Classes and Objects
            Structure of classes
            expression vs statements
            Exception Handling
            Error handling with try
            Pattern Matching
            Method notation
            Inheritance
        Scala Collections
            List/Set/Map
            Filtering & transformation
            FlatMap
        Concurrency
            Futures
            Handling failures
    */
    
    //Repl
    //Read Evaluate Print Loop
    //command-line ide

    println("Tuples")
    //Tuples - values that contain a fixed amount of elements that have their own type
    // always val - because it is immutable - cannot be changed
    val tuple_a = (10, "Tuple")
    val tuple_b = (10: Int, "": String, 1: Int)

    // Tuples are indexed by starting at 1.
    println(tuple_a)
    println(tuple_a._1)
    println(tuple_a._2)

    println(tuple_b)

    var tuple_c = Tuple3(1,"hello", 20)
    val tuple_d = Tuple22
    println(tuple_c)

    
    //Functions
    println(add_mulp(4,2))
    val anonymousFunction = (x: Int, y: Int) => (x+y)*(x+y)
    println(anonymousFunction)
    def add_mulp(x:Int, y:Int) = (x+y)*(x+y)

    println("Pure and Impure functions")
    //pure and impure functions
        //pure functions - same input will always have same output
            //def add_mulp(x:Int, y:Int) = (x+y)*(x+y) 
        
        //impure functions - same input can have different output
    var global_var = 10
    def test_global() = global_var

    println(test_global())
    global_var = 11
    println(test_global())

    
    println("List")
    val myList = List(1,2,3,4,5)
    println(myList(0))
    println(myList.map(_ * 2))

    val myList2 = List("AIHBvbe","hveev","BHVCUHDEBWE","DBHBWUHEB","as")
    println(myList2.map(_.toLowerCase))
    

    //higher order functions - takes or returns a function 
    //var s = Array[String]("ABc", "ASKHBFIWQB")
    //println(s.map(_.toLowerCase))
    // Takes println as a function in the parameter
    myList2.map(println) 

    // val vs var
    // val - immutable (unchangeable)
    // var - mutable (changeable)


    //Conditionas and Loops
    //for and while
    println("Conditionas and Loops")
    // for ( i <- myList;){
    //     if(i%2 == 1){
    //         println("Odd")
    //     }else if ( i%2 == 0){
    //         println("Even")
    //     }
    // }

    val test1 = List(1,2,3,4,5)
    val test2 = List(1,2,3)

    // Iterates all the way through j then will increment i by 1 then iterate j all over again
    for (i <- test1; j <- test2) {
        println(s"$i, $j")
    }


    var increment = 0
    while(increment < myList.size){
        increment += 1
    }

    // Classes and Objects - object is a singleton, a class that only has one instance
        //Class
            // an instance that defines methods and variables
        //2 different versions of objects
            //object is a instances of a class - can implement methods of that class 
            //static class that is an singleton

    // How do methods executing on the stack interact with objects on the heap?
        // The stack points to objects on the heap


    //expression vs statements
        //expression - 2+2    // returns something
        //Statement = anything that equals

    
    //Exception Handling
    //Error handling with try

    try{
        var text = io.Source.fromFile("filename")
    }catch{
        case e: FileNotFoundException => println("Caught this")
        case _: IOException => println("Caught this e")
    }finally{
        println("This will always execute")
    }

    //Option
    def toInt(s: String): Option[Int] = {
        try {
            Some(s.toInt)
        } catch {
            case e: Exception => None
        }
    }

    println(toInt("s"))
    println(toInt("20").get)
    //println(toInt("20")) // will give back Some(20)
    var qpq = toInt("20").get:Int
    println(qpq)


    //Pattern Matching
    val x: Int = Random.nextInt(10)

    println(x match {
        case 0 => x + ": zero"
        case 1 => x + ": one"
        case 2 => x + ": two"
        case _ => x + ": other"
    })


    // Method Notation
    def abc(a:String) = a
    
    var string_banana = "bAnAnA"
    println(string_banana contains 'a')


    // Inheritence
    // Only has extends
        // if you are extending a trait then you can extend more than one
            // use 'with' keyword to extend 2 or 3 trait
            // extends Trait1 with Trait2

    
    //Filtering & transformation
    val lol = List(List(1,2), List(3,4))
    println(lol)
    println(lol.flatten)

    val listx = List(List(List(1,2,3), List(3,4,5), List(5,6,7)))
    val y = listx.flatten.flatten
    println(y)
    println(listx.flatten)


    //Works just like Option Some None
        //But with 2 features:
            // Try makes it very simple to catch exceptions
            // Failure contains the exception
    //Try/Success/Failure
    // Try makes it very simple to catch exceptions
    // Failure contains the exception


}
