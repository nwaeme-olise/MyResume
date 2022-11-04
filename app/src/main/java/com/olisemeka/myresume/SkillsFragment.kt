package com.olisemeka.myresume

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.olisemeka.myresume.databinding.FragmentSkillsBinding


class SkillsFragment : Fragment() {
    private var _binding: FragmentSkillsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSkillsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val context = requireContext()
        val myAdapter = SkillsListAdapter(Datasource.loadData())
        binding.rvSkills.apply{
            adapter = myAdapter
            layoutManager = GridLayoutManager(context, 2)
        }
    }
}