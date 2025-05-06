package com.alejandrocid.introkotlin903.temasKotlin

fun main(){
    var opcion = 0
    var num1 = 0.0
    var num2 = 0.0
    do{
        println("1. Suma")
        println("2. Resta")
        println("3. Multiplicación")
        println("4. Division")
        println("5. Salir")
        var opcion = readln().toInt()


        if(opcion == 1){
            println("Inserte el primer numero")
            num1 = readln().toDouble()
            println("Inserte el segundo numero")
            num2 = readln().toDouble()
            var suma = num1 + num2
            println("La suma de $num1 y $num2 es $suma")
        }else if(opcion == 2){
            println("Inserte el primer numero")
            num1 = readln().toDouble()
            println("Inserte el segundo numero")
            num2 = readln().toDouble()
            var resta = num1 - num2
            println("La resta de $num1 y $num2 es $resta")
        }else if(opcion == 3){
            println("Inserte el primer numero")
            num1 = readln().toDouble()
            println("Inserte el segundo numero")
            num2 = readln().toDouble()
            var mult = num1 * num2
            println("La multiplicación de $num1 y $num2 es $mult")
        }else if(opcion == 4){
            println("Inserte el primer numero")
            num1 = readln().toDouble()
            println("Inserte el segundo numero")
            num2 = readln().toDouble()
            var div = num1 / num2
            println("La división de $num1 y $num2 es $div")
        }else{
            println("Esa opcion no está disponible")
        }
    }while(opcion != 5)
}