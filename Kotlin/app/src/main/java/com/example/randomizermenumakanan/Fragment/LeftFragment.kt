package com.example.randomizermenumakanan.Fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.randomizermenumakanan.R

class LeftFragment : Fragment(), View.OnClickListener {
    private lateinit var btnHome: Button
    private lateinit var btnmenu: Button
    private lateinit var btnExit: Button
    private lateinit var listener: FragmentListener

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_left, container, false)
        this.btnHome = view.findViewById(R.id.btn_home)
        this.btnmenu = view.findViewById(R.id.btn_menu)
        this.btnExit = view.findViewById(R.id.btn_exit)
        this.btnHome.setOnClickListener(this)
        this.btnmenu.setOnClickListener(this)
        this.btnExit.setOnClickListener(this)
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

    override fun onClick(view: View) {
        if (view === btnHome) {
            listener!!.changePage(1)
        } else if (view === btnmenu) {
            listener!!.changePage(2)
        } else if (view === btnExit) {
            listener!!.closeApplication()
        }
    }
}