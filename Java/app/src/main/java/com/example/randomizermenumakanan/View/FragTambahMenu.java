package com.example.randomizermenumakanan.View;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.randomizermenumakanan.PenyimpanNilai;
import com.example.randomizermenumakanan.databinding.FragmentFragTambahMenuBinding;

public class FragTambahMenu extends Fragment implements View.OnClickListener {
    private FragmentListener listener;
    private Button add;
    private FragmentFragTambahMenuBinding binding;
    private PenyimpanNilai penyimpanNilai;

    public FragTambahMenu() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.binding = FragmentFragTambahMenuBinding.inflate(inflater, container, false);
        this.binding.tambahAdd.setOnClickListener(this);
        return this.binding.getRoot();
    }

    @Override
    public void onClick(View v) {
        if (v == this.binding.tambahAdd) {
            this.listener.changePage(2);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentListener) {
            this.listener = (FragmentListener) context;
        } else {
            throw new ClassCastException(context.toString() + " must implement FragmentListener");
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        this.penyimpanNilai.saveTambahNama(this.binding.tambahNama.getText().toString());
        this.penyimpanNilai.saveTambahTag(this.binding.tambahTag.getText().toString());
        this.penyimpanNilai.saveTambahBahan(this.binding.tambahBahan.getText().toString());
        this.penyimpanNilai.saveTambahLangkah(this.binding.tambahLangkah.getText().toString());
        this.penyimpanNilai.saveTambahRestoran(this.binding.tambahResto.getText().toString());
    }

    @Override
    public void onResume() {
        super.onResume();
        this.binding.tambahNama.setText(this.penyimpanNilai.getTambahNama());
        this.binding.tambahTag.setText(this.penyimpanNilai.getTambahTag());
        this.binding.tambahBahan.setText(this.penyimpanNilai.getTambahBahan());
        this.binding.tambahLangkah.setText(this.penyimpanNilai.getTambahLangkah());
        this.binding.tambahResto.setText(this.penyimpanNilai.getTambahRestoran());
    }
}
