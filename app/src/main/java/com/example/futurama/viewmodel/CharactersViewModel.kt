package com.example.futurama.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.futurama.model.data.CharactersDataResponse
import com.example.futurama.model.repository.ApiRepository
import kotlinx.coroutines.launch

class CharactersViewModel: ViewModel() {
    private  val repository = ApiRepository()

    private val _characters=MutableLiveData<CharactersDataResponse>()

    val characters: LiveData<CharactersDataResponse>
        get() = _characters

    fun getCharacters(){
        viewModelScope.launch {
          try {
              val char=repository.getCharacters()
              _characters.value=char

          }catch (e:Exception){
              e.printStackTrace()
          }
        }
    }

}