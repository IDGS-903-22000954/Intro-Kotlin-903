package com.alejandrocid.introkotlin903.temasKotlin

import kotlin.math.sqrt

fun main(){
    while (true) {
        println("Ingrese valor de a")
        var n1 = readln().toDouble()
        println("Ingrese valor de b")
        var n2 = readln().toDouble()
        println("Ingrese valor de c")
        var n3 = readln().toDouble()

        if (n1 == 0.0) {
            println("El coeficiente 'a' no puede ser 0")
            continue
        }

        val d = n2 * n2 - 4 * n1 * n3

        if (d < 0) {
            println("Error: La ecuación no tiene soluciones reales. Reiniciando...")
            continue
        }

        val x1 = (-n2 + sqrt(d)) / (2 * n1)
        val x2 = (-n2 - sqrt(d)) / (2 * n1)

        println("Las soluciones son: x1 = $x1, x2 = $x2")
    }

}

