package com.example.hw17app.ui.webView

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.hw17app.R
import com.example.hw17app.databinding.FragmentMovieDetailBinding
import com.example.hw17app.databinding.FragmentWebViewBinding
import com.example.hw17app.ui.movieDetail.MovieDetailViewModel

class WebViewFragment : Fragment() {
    val viewModel : WebViewViewModel by viewModels()
    lateinit var binding: FragmentWebViewBinding
    var videoLink = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            //videoLink = it.getString(ARG_PARAM1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_web_view, container, false
        )
        binding.vmodel = viewModel
        binding.lifecycleOwner = this.viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}