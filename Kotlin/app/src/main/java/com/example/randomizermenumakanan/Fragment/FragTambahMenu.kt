package com.example.randomizermenumakanan.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.randomizermenumakanan.R


class FragTambahMenu : Fragment() {
    private lateinit var listener: FragmentListener


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_frag_tambah_menu, container, false)


        return view
    }

}