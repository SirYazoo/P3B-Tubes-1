package com.example.randomizermenumakanan.View;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.randomizermenumakanan.Model.IsiMenu;
import com.example.randomizermenumakanan.Presenter.MainPresenter;
import com.example.randomizermenumakanan.databinding.FragmentFragItemDetailBinding;

public class FragItemDetail extends Fragment implements View.OnClickListener {
    private FragmentListener listener;
    private FragmentFragItemDetailBinding binding;
    private MainPresenter mainPresenter;
    private IsiMenu isiMenu;

    public FragItemDetail(MainPresenter mainPresenter) {
        this.mainPresenter = mainPresenter;
    }

    public void setMenu(IsiMenu isiMenu) {
        this.isiMenu = isiMenu;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.binding = FragmentFragItemDetailBinding.inflate(inflater, container, false);
        this.binding.tvNama.setText(this.isiMenu.getNama());
        this.binding.tvTag.setText(this.isiMenu.getTag());
        this.binding.tvBahan.setText(this.isiMenu.getBahan());
        this.binding.tvLangkah.setText(this.isiMenu.getLangkah());
        this.binding.tvRestoran.setText(this.isiMenu.getRestoran());
        this.binding.detailEdit.setOnClickListener(this);
        return this.binding.getRoot();
    }

    @Override
    public void onClick(View v) {
        if (v == this.binding.detailEdit) {
            this.listener.changePage(5);
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
}
