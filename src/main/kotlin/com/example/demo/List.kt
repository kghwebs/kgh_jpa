package com.example.demo

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Table
import org.springframework.data.jpa.domain.AbstractPersistable_.id


@Entity
@Table(name = "list")
open class List (listTitle: String){
    @Id
    @GeneratedValue
    @Column(name = "list_idx", nullable = false)
    open var listIdx: Int? = null

    @Column(name = "list_title")
    open var listTitle: String? = null



}