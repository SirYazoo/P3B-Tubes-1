package com.example.randomizermenumakanan.View;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.randomizermenumakanan.PenyimpanNilai;
import com.example.randomizermenumakanan.Presenter.MainPresenter;
import com.example.randomizermenumakanan.databinding.FragmentFragEditBinding;

public class FragEdit extends Fragment implements View.OnClickListener {
    private FragmentListener listener;
    private FragmentFragEditBinding binding;
    private PenyimpanNilai penyimpanNilai;
    private MainPresenter mainPresenter;

    public FragEdit(MainPresenter mainPresenter) {
        this.mainPresenter = mainPresenter;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.binding = FragmentFragEditBinding.inflate(inflater, container, false);
        this.penyimpanNilai = new PenyimpanNilai(this.getActivity());
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
    public void onClick(View v) {
        if (v == this.binding.editAdd) {
            if (!this.binding.editNama.getText().toString().equals("") &&
                    !this.binding.editTag.getText().toString().equals("") &&
                    !this.binding.editBahan.getText().toString().equals("") &&
                    !this.binding.editLangkah.getText().toString().equals("") &&
                    !this.binding.editResto.getText().toString().equals("")) {
                this.mainPresenter.editList(0, this.binding.editNama.getText().toString(),
                        this.binding.editTag.getText().toString(),
                        this.binding.editBahan.getText().toString(),
                        this.binding.editLangkah.getText().toString(),
                        this.binding.editResto.getText().toString());
                this.listener.changePage(2);
            }
            this.binding.editNama.setText("");
            this.binding.editTag.setText("");
            this.binding.editBahan.setText("");
            this.binding.editLangkah.setText("");
            this.binding.editResto.setText("");

        }
    }
}
