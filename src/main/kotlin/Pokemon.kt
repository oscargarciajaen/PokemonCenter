package org.example

data class Pokemon(val nombre: String, val tipo1: Tipo, val tipo2: Tipo) {

    override fun toString(): String {
        return "Nombre: $nombre | Tipo1: $tipo1 |Tipo2: $tipo2"
    }
}