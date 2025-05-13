package com.alejandrocid.introkotlin903.temasKotlin

fun clasificarSentimiento(frase: String): String {
    val palabrasPositivas = listOf("bueno", "genial", "excelente", "feliz", "increíble", "me gusta")
    val palabrasNegativas = listOf("malo", "horrible", "terrible", "triste", "pésimo", "no me gustame ")

    val palabras = frase.lowercase().split(" ")

    return when {
        palabras.any { it in palabrasPositivas } -> "Positivo 😊"
        palabras.any { it in palabrasNegativas } -> "Negativo 😞"
        else -> "Neutral 😐"
    }
}

fun main() {
    val textoPrueba = readln()
    val resultado = clasificarSentimiento(textoPrueba)
    println("Sentimiento de '$textoPrueba': $resultado")
}
