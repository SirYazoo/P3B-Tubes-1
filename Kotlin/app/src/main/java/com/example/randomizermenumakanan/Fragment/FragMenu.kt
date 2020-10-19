package com.example.randomizermenumakanan.Fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.randomizermenumakanan.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FragMenu : Fragment(), View.OnClickListener {
    private lateinit var btnTambah : FloatingActionButton
    private lateinit var listener: FragmentListener

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view : View = inflater.inflate(R.layout.fragment_frag_menu, container, false)
        this.btnTambah = view.findViewById(R.id.btnTambah)
        this.btnTambah.setOnClickListener(this)
        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is FragmentListener) {
            listener = context
        } else {
            throw ClassCastException("$context must implement FragmentListener")
        }
    }

    override fun onClick(v: View?) {
        if(v == this.btnTambah){
            listener!!.changePage(3)
        }
    }
}