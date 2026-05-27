package org.example

fun main() {
    val consola = Consola
    val opcion = consola.solicitarOpcion()
    if (opcion == "1") {
        val nombre = consola.solicitarNombrePokemon()
        val tipos = consola.obtenerTipos()
        val pokemon: Pokemon = Pokemon(nombre, tipos.first, tipos.second)
        println(pokemon)
    } else
        println("coming soon")
}