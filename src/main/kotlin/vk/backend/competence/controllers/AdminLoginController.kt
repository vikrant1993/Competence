package vk.backend.competence.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AdminLoginController {

    @GetMapping("/demo")
    fun demo():String{
        return "Hello Vikrant"
    }

}