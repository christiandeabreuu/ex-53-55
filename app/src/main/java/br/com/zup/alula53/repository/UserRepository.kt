package br.com.zup.alula53.repository

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.provider.Contacts.SettingsColumns.KEY


class UserRepository(application: Application) {

    private val pref: SharedPreferences = application.getSharedPreferences(KEY, Context.MODE_PRIVATE)
    private val prefEditor = pref.edit()

    fun saveUser(login: String, password: Int){
        prefEditor.putString("LOGIN", login)
        prefEditor.putInt("PASSWORD", password)
        prefEditor.apply()
    }

    fun getUserLogin() = pref.getString("LOGIN", "")

    fun getUserPassword() = pref.getInt("PASSWORD", 0)

}