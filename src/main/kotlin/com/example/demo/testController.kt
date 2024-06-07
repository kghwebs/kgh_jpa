package com.example.demo


import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.server.ResponseStatusException

@Controller
class testController(private val repository: listRepository) {

    @GetMapping("/")
    fun index(model:Model): ResponseEntity<List> {
        val users = repository.findBylistIdx(1)

        return ResponseEntity.ok(users)
    }

}

