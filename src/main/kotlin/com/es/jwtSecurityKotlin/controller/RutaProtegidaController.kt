package com.es.jwtSecurityKotlin.controller

import com.es.jwtSecurityKotlin.model.Usuario
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/rutas_protegidas")
class RutaProtegidaController {


    @GetMapping("/recurso1")
    fun getRecursoProtegidoUno () : String {
        return "Este recurso sólo puede ser accedido por usuarios registrados en la BDD \uD83E\uDD75"
    }

    @PostMapping("/recurso2/{id}")
    fun getRecursoProtegidoDos(
        @PathVariable id:String
    ) : String {
        return "ALGO MAS PROTEGIDO BRO recurso de id es $id"
    }

    @DeleteMapping("/recurso2/{id}")
    fun getRecursoProtegidoDelete(
        @PathVariable id:String
    ) : String {
        return "ALGO MAS PROTEGIDO BRO recurso de id es $id"
    }

}