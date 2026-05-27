package org.example

fun main() {
    val consola = Consola
    val nombre = consola.solicitarNombrePokemon()
    val tipos = consola.obtenerTipos()
    val pokemon: Pokemon = Pokemon(nombre, tipos.first, tipos.second)
    println(pokemon)
}