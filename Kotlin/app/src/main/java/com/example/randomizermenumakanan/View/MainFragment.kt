package com.example.randomizermenumakanan.View

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.randomizermenumakanan.Model.IsiMenu
import com.example.randomizermenumakanan.R
import java.util.Random

class MainFragment : Fragment(), View.OnClickListener {
    private lateinit var etMain: EditText
    private lateinit var btnCari: Button
    private lateinit var itemList: List<IsiMenu>
    private lateinit var listener: FragmentListener

    private var rand: Random = Random()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        this.btnCari = view.findViewById(R.id.btnCari)
        this.btnCari.setOnClickListener(this)
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

    override fun onClick(v: View) {
        if(v == this.btnCari) {
//            val choice = this.rand.nextInt(itemList.size)
//            Log.d("random", choice.toString())
            listener.changePage(4)


        }
    }
}