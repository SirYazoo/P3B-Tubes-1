package com.example.randomizermenumakanan.View

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.randomizermenumakanan.PenyimpanNilai
import com.example.randomizermenumakanan.R
import com.example.randomizermenumakanan.databinding.FragmentFragEditBinding

class FragEdit : Fragment() {
    private lateinit var binding: FragmentFragEditBinding
    private lateinit var penyimpanNilai: PenyimpanNilai

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
       this.binding = FragmentFragEditBinding.inflate(inflater, container, false)


        return this.binding.root
    }

    override fun onPause(){
        super.onPause()
        this.penyimpanNilai.saveTambahNama(this.binding.editNama.getText().toString())
        this.penyimpanNilai.saveTambahTag(this.binding.editTag.getText().toString())
        this.penyimpanNilai.saveTambahBahan(this.binding.editBahan.getText().toString())
        this.penyimpanNilai.saveTambahLangkah(this.binding.editLangkah.getText().toString())
        this.penyimpanNilai.saveTambahRestoran(this.binding.editResto.getText().toString())
    }

    override fun onResume(){
        super.onResume()
        this.binding.editNama.setText(this.penyimpanNilai.getTambahNama())
        this.binding.editTag.setText(this.penyimpanNilai.getTambahTag())
        this.binding.editBahan.setText(this.penyimpanNilai.getTambahBahan())
        this.binding.editLangkah.setText(this.penyimpanNilai.getTambahLangkah())
        this.binding.editResto.setText(this.penyimpanNilai.getTambahRestoran())
    }
}