package com.alejandrocid.introkotlin903.temasKotlin

fun sum (x:Int, y:Int): Int{
    return x+y
}

fun sum2(x:Int, y:Int) = x+y

fun main() {
    saludo()
    println("_________________________________________________________________________")
    println(sum(2,3))
    println(sum2(2,3))

}

fun saludo(){
    println("Hola mundo")
}