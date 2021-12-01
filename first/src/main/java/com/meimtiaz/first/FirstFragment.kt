package com.meimtiaz.first

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.meimtiaz.first.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)


        binding.backTV.setOnClickListener {
            requireActivity().finish()
        }
        binding.nextTV.setOnClickListener {
            findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment())
        }

        return binding.root
    }

}
