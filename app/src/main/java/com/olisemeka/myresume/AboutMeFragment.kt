package com.olisemeka.myresume

import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.BulletSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.olisemeka.myresume.databinding.FragmentAboutMeBinding


class AboutMeFragment : Fragment() {
    private var _binding: FragmentAboutMeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAboutMeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val likes = SpannableString("\tFamily & Friends\n\n\tFootball\n\n\tFood")
        val hobbies = SpannableString("\tWatching and analysing football games\n\n\tWatching and analysing Arsenal games\n\n\tPlaying and analysing Football Manager games")

        likes.apply{
            setSpan(BulletSpan(), 0, 16, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            setSpan(BulletSpan(), 19, 27, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            setSpan(BulletSpan(), 30, 34, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }

        hobbies.apply {
            setSpan(BulletSpan(), 0, 37, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            setSpan(BulletSpan(), 40, 76, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            setSpan(BulletSpan(), 79, 122, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }

        binding.tvLikes.text = likes
        binding.tvHobbies.text = hobbies

    }
}