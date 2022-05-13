package com.example.quiz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.quiz.databinding.PerguntaFragmentBinding

class PerguntaFragment : Fragment(R.layout.pergunta_fragment) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<PerguntaFragmentBinding>(
            inflater,
            R.layout.pergunta_fragment,
            container,
            false
        )

        binding.submitButton.setOnClickListener { view: View ->
            val checkedId = binding.questionRadioGroup.checkedRadioButtonId
            if (-1 != checkedId) {
                var answerIndex = 0
                when (checkedId) {
                    R.id.aRadioButton -> answerIndex = 1
                    R.id.bRadioButton -> answerIndex = 2
                    R.id.cRadioButton -> answerIndex = 3
                }
                if (answerIndex == 2) {
                    view.findNavController()
                        .navigate(R.id.action_perguntaFragment_to_sucessoFragment)
                } else {
                    view.findNavController().navigate(R.id.action_perguntaFragment_to_falhaFragment)
                }
            }
        }
    return binding.root}
}