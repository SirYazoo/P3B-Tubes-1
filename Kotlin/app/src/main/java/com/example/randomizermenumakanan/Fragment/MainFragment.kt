package com.example.randomizermenumakanan.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.randomizermenumakanan.R

class MainFragment : Fragment(), View.OnClickListener {
    private lateinit var etMain: EditText
    private lateinit var btnMain: Button
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        this.btnMain = view.findViewById(R.id.btn_Main)
        this.btnMain.setOnClickListener(this)
        return view
    }

    override fun onClick(view: View) {

    }
}