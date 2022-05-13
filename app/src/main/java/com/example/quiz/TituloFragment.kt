package com.example.quiz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.quiz.databinding.TituloFragmentBinding

class TituloFragment : Fragment(R.layout.titulo_fragment) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<TituloFragmentBinding>(inflater, R.layout.titulo_fragment, container, false)

        binding.button.setOnClickListener{ view : View ->
            view.findNavController().navigate(R.id.action_tituloFragment_to_perguntaFragment)
        }

        return binding.root
    }
}