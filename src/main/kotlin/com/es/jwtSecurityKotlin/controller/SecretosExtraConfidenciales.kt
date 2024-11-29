package com.es.jwtSecurityKotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/secretos_extra_confidenciales")
class SecretosExtraConfidenciales {
    @GetMapping("/ficha1")
    fun getRecursoPublicoUno () : String {
        return "SUPER SECRETO BRO"
    }
    @GetMapping("/ficha2")
    fun getRecursoPublicoDos () : String {
        return "SUPER PUBLICO BRO"
    }
}