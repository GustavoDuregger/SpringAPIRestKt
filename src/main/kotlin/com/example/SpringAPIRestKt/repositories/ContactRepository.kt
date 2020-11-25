package com.example.SpringAPIRestKt.repositories

import com.example.SpringAPIRestKt.entities.Contact
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ContactRepository: JpaRepository<Contact,Long>{
}