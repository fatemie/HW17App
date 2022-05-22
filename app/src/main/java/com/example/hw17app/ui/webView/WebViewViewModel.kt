package com.example.hw17app.ui.webView

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hw17app.domain.Container
import com.example.hw17app.model.MovieDetailApiResult
import com.example.hw17app.model.Video
import kotlinx.coroutines.launch

class WebViewViewModel : ViewModel() {

    val videoYoutubeLink = MutableLiveData<String>()


    fun getYoutubeLink(id: Long) {
        viewModelScope.launch {
            val thisLink = Container.movieRepository.getYoutubeLink(id)
            videoYoutubeLink.value = thisLink
        }
    }
}
