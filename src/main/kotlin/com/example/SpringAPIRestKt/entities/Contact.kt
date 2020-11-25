package com.example.SpringAPIRestKt.entities

import javax.persistence.*
import javax.validation.constraints.Email
import javax.validation.constraints.NotNull

@Entity
@Table(name = "contacts")
class Contact (
        @field:Id
        @field:GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @field:NotNull
        @field:GeneratedValue(strategy = GenerationType.IDENTITY)
        var name: String,

        @field:NotNull
        @field:Email
        var email: String

)