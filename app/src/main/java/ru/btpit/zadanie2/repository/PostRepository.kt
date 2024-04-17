package ru.btpit.zadanie2.repository

import androidx.lifecycle.LiveData

import ru.btpit.zadanie2.dto.Post


interface PostRepository {
    fun get(): LiveData<Post>
    fun like()
    fun share()
}