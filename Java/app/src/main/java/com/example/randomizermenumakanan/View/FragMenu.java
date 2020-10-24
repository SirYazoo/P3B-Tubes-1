package com.example.randomizermenumakanan.View;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.randomizermenumakanan.Presenter.MainPresenter;
import com.example.randomizermenumakanan.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FragMenu extends Fragment implements View.OnClickListener {
    private FloatingActionButton btnTambah;
    private FragmentListener listener;
    private ListView listMenu;
    private Adapter adapter;
    private MainPresenter presenter;

    public FragMenu() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_frag_menu, container, false);
        this.btnTambah = view.findViewById(R.id.btnTambah);
        this.listMenu = view.findViewById(R.id.lvMenu);
        this.adapter = new Adapter(this, this.presenter);
        this.btnTambah.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (v == this.btnTambah) {
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
}
