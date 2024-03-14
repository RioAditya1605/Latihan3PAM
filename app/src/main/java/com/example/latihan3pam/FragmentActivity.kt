package com.example.latihan3pam

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.latihan3pam.databinding.FragmentActivityBinding

private val Any.root: View?
    get() {
        TODO("Not yet implemented")
    }

class FragmentAja : Fragment() {

    private lateinit var binding: FragmentActivityBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentActivityBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Access views using binding object
        binding.textAja.text = "Hello from Fragment"
    }
}