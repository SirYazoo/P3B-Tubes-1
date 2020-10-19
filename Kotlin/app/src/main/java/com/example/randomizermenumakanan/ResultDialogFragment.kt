package com.example.randomizermenumakanan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.DialogFragment

class ResultDialogFragment : DialogFragment() {
    private lateinit var tvResult: TextView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_result_dialog, container, false)
        this.tvResult = view.findViewById(R.id.tvResult)
        this.tvResult.setText(tag)
        return view
    }
}