package com.example.lesson1m5.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.koin.androidx.viewmodel.ext.android.viewModel
import com.example.lesson1m5.databinding.FragmentBlankBinding
import com.example.lesson1m5.presentation.view_model.HomeViewModel


class HomeFragment : Fragment() {

    private val viewModel: HomeViewModel by viewModel()

    private var _binding: FragmentBlankBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBlankBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //viewModel.getCounter()
        viewModel.counter.observe(viewLifecycleOwner) {
            binding.tvResult.text = it.count.toString()
        }

        binding.btnInc.setOnClickListener {
            viewModel.increment()
        }
        binding.btnDec.setOnClickListener {
            viewModel.decrement()
        }
    }
}
