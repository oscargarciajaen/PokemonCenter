package org.example

object Consola {

    fun solicitarNombrePokemon(): String {

        var nombre: String? = null
        do {
            println("Introduce el nombre del pokemon que quieres registrar: ")
            val entrada = readLine()?.trim()
            if (!entrada.isNullOrBlank()) {
                nombre = entrada
            }
        } while (nombre == null)
        return nombre
    }
}