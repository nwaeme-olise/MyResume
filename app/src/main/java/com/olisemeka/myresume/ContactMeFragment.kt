package com.olisemeka.myresume

import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.olisemeka.myresume.databinding.FragmentContactMeBinding


class ContactMeFragment : Fragment() {
   private var _binding: FragmentContactMeBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentContactMeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupHyperlinks()
    }

    private fun setupHyperlinks() {
        binding.tvGithub.movementMethod = LinkMovementMethod.getInstance()
        binding.tvLinkedIn.movementMethod = LinkMovementMethod.getInstance()
    }
}