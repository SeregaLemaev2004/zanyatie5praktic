package ru.btpit.zadanie2.viewmodel

import androidx.lifecycle.ViewModel
import ru.btpit.zadanie2.repository.PostRepository
import ru.btpit.zadanie2.repository.PostRepositoryInMemoryImpl

class PostViewModel : ViewModel() {

    private val repository: PostRepository = PostRepositoryInMemoryImpl()
    val data = repository.get()
    fun like() = repository.like()
    fun share() = repository.share()
}