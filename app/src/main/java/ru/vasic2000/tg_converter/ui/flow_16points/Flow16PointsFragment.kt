package ru.vasic2000.tg_converter.ui.flow_16points

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.vasic2000.tg_converter.databinding.FragmentFlow16PointsBinding

class Flow16PointsFragment : Fragment() {

    private var _binding: FragmentFlow16PointsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFlow16PointsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}