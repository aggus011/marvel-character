package com.pruebas.marvel_aplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform