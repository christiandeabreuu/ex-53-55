package br.com.zup.alula53.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import br.com.zup.alula53.repository.UserRepository

class UserViewModel(application: Application): AndroidViewModel(application) {
    private val repository = UserRepository(application)

    fun saveInformation(login: String, password: Int) {
        repository.saveUser(login, password)
    }

    fun getLogin() = repository.getUserLogin()
    fun getPassoword() = repository.getUserPassword()
}