package com.alejandrocid.introkotlin903.temasKotlin

fun main(){
    var opcion = 0
    do{
        println("Ingrese un numero")
        println("Ingrese 0 para cerrar el programa")
        opcion = readln().toInt()
        if(opcion < 0 ) {
            println("No se pueden agregar datos negativos")
        } else {
            if (opcion != 0){
                var i = 1
                do {
                    var ii = 1
                    do{
                        print("*")
                        ii++
                    }while(ii <= i)
                    println()
                    i++
                } while (i <= opcion)
            }
        }
    }while(opcion != 0)
}