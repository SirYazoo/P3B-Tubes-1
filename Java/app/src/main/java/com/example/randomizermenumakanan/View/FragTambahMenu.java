package com.example.randomizermenumakanan.View;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.randomizermenumakanan.PenyimpanNilai;
import com.example.randomizermenumakanan.Presenter.MainPresenter;
import com.example.randomizermenumakanan.databinding.FragmentFragTambahMenuBinding;

public class FragTambahMenu extends Fragment implements View.OnClickListener {
    private FragmentListener listener;
    private FragmentFragTambahMenuBinding binding;
    private PenyimpanNilai penyimpanNilai;
    private MainPresenter mainPresenter;

    public FragTambahMenu(MainPresenter mainPresenter) {
        this.mainPresenter = mainPresenter;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.binding = FragmentFragTambahMenuBinding.inflate(inflater, container, false);
        this.penyimpanNilai = new PenyimpanNilai(this.getActivity());
        this.binding.tambahAdd.setOnClickListener(this);
        return this.binding.getRoot();
    }

    @Override
    public void onClick(View v) {
        if (v == this.binding.tambahAdd) {
            if (!this.binding.tambahNama.getText().toString().equals("") &&
                    !this.binding.tambahTag.getText().toString().equals("") &&
                    !this.binding.tambahBahan.getText().toString().equals("") &&
                    !this.binding.tambahLangkah.getText().toString().equals("") &&
                    !this.binding.tambahResto.getText().toString().equals("")) {
                this.mainPresenter.addList(this.binding.tambahNama.getText().toString(),
                        this.binding.tambahTag.getText().toString(),
                        this.binding.tambahBahan.getText().toString(),
                        this.binding.tambahLangkah.getText().toString(),
                        this.binding.tambahResto.getText().toString());
                this.listener.changePage(2);
            }
            this.binding.tambahNama.setText("");
            this.binding.tambahTag.setText("");
            this.binding.tambahBahan.setText("");
            this.binding.tambahLangkah.setText("");
            this.binding.tambahResto.setText("");
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
