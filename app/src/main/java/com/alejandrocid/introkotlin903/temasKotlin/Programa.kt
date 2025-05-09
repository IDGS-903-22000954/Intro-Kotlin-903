package com.alejandrocid.introkotlin903.temasKotlin

fun main(){
    var opcion = 0
    var persona = mutableListOf<Any>()
    do{
        println("1. Ver")
        println("2. Agregar")
        println("3. Editar")
        println("4. Eliminar")
        println("5. Salir")
        var opcion = readln().toInt()

        if(opcion == 1){
            if (persona.isEmpty()){
                println("No hay objetos en lista")
            }else{
                var i=0
                persona.forEach{ p ->
                    println("$i, $p")
                    i++
                }
                println("___________")
            }
        }else if(opcion ==2){
            println("Ingrese el nombre")
            var p = readln()
            persona.add(p)
            println("___________")
        }else if(opcion ==3){
            var i=0
            persona.forEach{ p ->
                println("$i, $p")
                i++
            }
            println("¿Cuál quieres editar?")
            var n = readln().toInt()
            println("¿Qué nombre quieres poner")
            var p = readln()
            persona[n] = p
            println("___________")
        }else if(opcion == 4){
            var i=0
            persona.forEach{ p ->
                println("$i, $p")
                i++
            }
            println("¿Cuál quieres eliminar?")
            var n = readln().toInt()
            persona.removeAt(n)
            println("___________")
        }

    }while(opcion != 5)
}