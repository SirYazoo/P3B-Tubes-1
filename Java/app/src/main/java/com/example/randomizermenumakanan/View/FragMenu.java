package com.example.randomizermenumakanan.View;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.randomizermenumakanan.Presenter.IMainActivity;
import com.example.randomizermenumakanan.Model.IsiMenu;
import com.example.randomizermenumakanan.Presenter.MainPresenter;
import com.example.randomizermenumakanan.databinding.FragmentFragMenuBinding;

import java.util.List;

public class FragMenu extends Fragment implements View.OnClickListener, IMainActivity {
    private FragmentListener listener;
    private Adapter adapter;
    private MainPresenter mainPresenter;
    private FragmentFragMenuBinding binding;

    public FragMenu(MainPresenter mainPresenter) {
        this.mainPresenter = mainPresenter;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.binding = FragmentFragMenuBinding.inflate(inflater, container, false);
        this.mainPresenter = new MainPresenter(this, this.listener);
        this.adapter = new Adapter(this.getActivity(), this.mainPresenter);
        this.binding.lvMenu.setAdapter(this.adapter);
        this.binding.btnTambah.setOnClickListener(this);
        return this.binding.getRoot();
    }

    @Override
    public void onClick(View v) {
        if (v == this.binding.btnTambah) {
            this.listener.changePage(3);
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
    public void updateList(List<IsiMenu> isiMenu) {
        this.adapter.update(isiMenu);
    }

    @Override
    public void resetForm() {

    }
}
