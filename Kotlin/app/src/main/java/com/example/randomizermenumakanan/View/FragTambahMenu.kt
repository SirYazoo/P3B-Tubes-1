package com.example.randomizermenumakanan.View

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.randomizermenumakanan.PenyimpanNilai
import com.example.randomizermenumakanan.R
import com.example.randomizermenumakanan.View.FragmentListener
import com.example.randomizermenumakanan.databinding.FragmentFragTambahMenuBinding


class FragTambahMenu : Fragment(), View.OnClickListener {
    private lateinit var listener: FragmentListener
    private lateinit var add: Button
    private lateinit var binding: FragmentFragTambahMenuBinding
    private lateinit var penyimpanNilai: PenyimpanNilai

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        this.binding = FragmentFragTambahMenuBinding.inflate(inflater, container, false)

        this.binding.tambahAdd.setOnClickListener(this)

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

    override fun onClick(v: View?) {
        if(v == this.binding.tambahAdd){
            listener.changePage(2)
        }
    }

    override fun onPause(){
        super.onPause()
        this.penyimpanNilai.saveTambahNama(this.binding.tambahNama.getText().toString())
        this.penyimpanNilai.saveTambahTag(this.binding.tambahTag.getText().toString())
        this.penyimpanNilai.saveTambahBahan(this.binding.tambahBahan.getText().toString())
        this.penyimpanNilai.saveTambahLangkah(this.binding.tambahLangkah.getText().toString())
        this.penyimpanNilai.saveTambahRestoran(this.binding.tambahResto.getText().toString())
    }

    override fun onResume(){
        super.onResume()
        this.binding.tambahNama.setText(this.penyimpanNilai.getTambahNama())
        this.binding.tambahTag.setText(this.penyimpanNilai.getTambahTag())
        this.binding.tambahBahan.setText(this.penyimpanNilai.getTambahBahan())
        this.binding.tambahLangkah.setText(this.penyimpanNilai.getTambahLangkah())
        this.binding.tambahResto.setText(this.penyimpanNilai.getTambahRestoran())
    }



}