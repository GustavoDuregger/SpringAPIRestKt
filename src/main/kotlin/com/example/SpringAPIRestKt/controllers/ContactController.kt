package com.example.SpringAPIRestKt.controllers

import ContactRepository
import com.example.SpringAPIRestKt.entities.Contact
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import javax.persistence.EntityNotFoundException
import javax.swing.text.html.parser.Entity


@RestController
@RequestMapping("/contact")
class ContactController {
    @Autowired
    lateinit var repository: ContactRepository

    @GetMapping
    fun index(): List<Contact>{
        return repository.findAll()
    }

    @PostMapping
    fun create(@RequestBody contact: Contact): Contact{
        return repository.save(contact)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable("id") id: Long){
        val contact = repository.findById(id).orElseThrow{EntityNotFoundException()}

    }
}