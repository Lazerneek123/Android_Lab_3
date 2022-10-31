package com.example.lab3.ui.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lab3.ui.InterfaceAdapter
import com.example.lab3.ui.model.Image
import com.example.lab3.ui.model.User

class MainActivityViewModel : ViewModel() {
    private val _users = MutableLiveData<ArrayList<InterfaceAdapter>>()
    val users: LiveData<ArrayList<InterfaceAdapter>> = _users

    fun loadUserList() {
        val list = ArrayList<InterfaceAdapter>()
        list.add(User(0, "Roman", 14, "Like a football", "roman@mail.com", true))
        list.add(Image(1, "Roman", "10:10"))
        list.add(User(2, "Pavel", 17, "Like a bicycler", "pavel@mail.com", false))
        list.add(Image(3, "Pavel", "11:05"))
        _users.value = list
    }
}