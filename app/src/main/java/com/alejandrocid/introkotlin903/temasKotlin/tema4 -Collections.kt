package com.alejandrocid.introkotlin903.temasKotlin

fun main(){
    /*
    * = val
    Mutable* = var
    List
    Mutablelist
    Set
    MutableSet
    Map
    MutableMap
     */

    var lista = listOf<String>("Lunes","Martes","Miercoles")

    println(lista)
    println(lista.size)
    println(lista.count())
    println(lista.get(0))
    println(lista[1])
    println(lista.indexOf("Miercoles"))
    println(lista.first())
    println(lista.last())

    var listaMutable = mutableListOf<String>("Lunes", "Martes", "Miercoles")

    println(listaMutable)
    listaMutable.add("Jueves")
    println(listaMutable)
    listaMutable
    println(listaMutable)
    println(listaMutable)
    println(listaMutable)
    println(listaMutable)
}