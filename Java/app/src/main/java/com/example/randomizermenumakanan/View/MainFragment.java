package com.example.randomizermenumakanan.View;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.randomizermenumakanan.Presenter.MainPresenter;
import com.example.randomizermenumakanan.databinding.FragmentMainBinding;


public class MainFragment extends Fragment implements View.OnClickListener {
    private FragmentListener listener;
    private FragmentMainBinding binding;
    private MainPresenter mainPresenter;

    public MainFragment(MainPresenter mainPresenter) {
        this.mainPresenter = mainPresenter;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.binding = FragmentMainBinding.inflate(inflater, container, false);
        this.binding.btnCari.setOnClickListener(this);
        return this.binding.getRoot();
    }

    @Override
    public void onClick(View v) {
        if (v == this.binding.btnCari) {
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
}
