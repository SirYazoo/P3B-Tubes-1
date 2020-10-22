package com.example.randomizermenumakanan.View

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.randomizermenumakanan.R
import com.example.randomizermenumakanan.databinding.FragmentFragItemDetailBinding

class FragItemDetail : Fragment() {
    private lateinit var listener: FragmentListener
    private lateinit var binding: FragmentFragItemDetailBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        this.binding = FragmentFragItemDetailBinding.inflate(inflater, container, false)

        this.binding.detailEdit.setOnClickListener{
            listener.changePage(5)
        }
        return this.binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is FragmentListener) {
            listener = context
        } else {
            throw ClassCastException("$context must implement FragmentListener")
        }
    }

}