package com.pruebas.marvel_aplication

class Greeting {
    private val platform: Platform = getPlatform()

    fun greeting(): String {
        return "Hello, ${platform.name}!"
    }
}