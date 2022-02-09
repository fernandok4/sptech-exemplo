package br.com.valemobi.sptechexemplo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PrimeiraController {

    @GetMapping("/hello-world")
    fun helloWorld(): String {
        return "Hello World"
    }
}