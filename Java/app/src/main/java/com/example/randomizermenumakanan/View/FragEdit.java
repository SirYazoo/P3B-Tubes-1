package com.example.randomizermenumakanan.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.randomizermenumakanan.PenyimpanNilai;
import com.example.randomizermenumakanan.databinding.FragmentFragEditBinding;

public class FragEdit extends Fragment {
    private FragmentFragEditBinding binding;
    private PenyimpanNilai penyimpanNilai;

    public FragEdit() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.binding = FragmentFragEditBinding.inflate(inflater, container, false);
        return this.binding.getRoot();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.penyimpanNilai.saveEditNama(this.binding.editNama.getText().toString());
        this.penyimpanNilai.saveEditTag(this.binding.editTag.getText().toString());
        this.penyimpanNilai.saveEditBahan(this.binding.editBahan.getText().toString());
        this.penyimpanNilai.saveEditLangkah(this.binding.editLangkah.getText().toString());
        this.penyimpanNilai.saveEditRestoran(this.binding.editResto.getText().toString());
    }

    @Override
    public void onResume() {
        super.onResume();
        this.binding.editNama.setText(this.penyimpanNilai.getEditNama());
        this.binding.editTag.setText(this.penyimpanNilai.getEditTag());
        this.binding.editBahan.setText(this.penyimpanNilai.getEditBahan());
        this.binding.editLangkah.setText(this.penyimpanNilai.getEditLangkah());
        this.binding.editResto.setText(this.penyimpanNilai.getEditRestoran());
    }
}
