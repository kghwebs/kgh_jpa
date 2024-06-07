package com.example.demo

import org.springframework.data.repository.CrudRepository

interface listRepository: CrudRepository<List, Long>{
    fun findBylistTitle(listTitle: String): List?

    fun findBylistIdx(listIdx: Int): List?
}
