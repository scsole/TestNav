package com.example.testnav.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testnav.Utils.Companion.square

/**
 * Home view model comment.
 */
class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }

    /**
     * Live data comment.
     */
    val text: LiveData<String> = _text
}