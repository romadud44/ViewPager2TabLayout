package com.example.viewpager2tablayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpager2tablayout.databinding.FragmentViewPagerBinding


@Suppress("DEPRECATION")
class ViewPagerFragment : Fragment() {
    private var _binding: FragmentViewPagerBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentViewPagerBinding.inflate(inflater, container, false)
                return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewPagerItem = arguments?.getParcelable<Page>("page")
        binding.fragmentWebViewWV.loadUrl(viewPagerItem?.url.toString())
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}