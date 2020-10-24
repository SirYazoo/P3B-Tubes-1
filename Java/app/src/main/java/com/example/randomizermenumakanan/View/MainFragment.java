package com.example.randomizermenumakanan.View;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.example.randomizermenumakanan.Model.IsiMenu;
import com.example.randomizermenumakanan.R;

import java.util.List;

public class MainFragment extends Fragment implements View.OnClickListener {
    private EditText etMain;
    private Button btnCari;
    private List<IsiMenu> itemList;
    private FragmentListener listener;

    public MainFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        this.btnCari = view.findViewById(R.id.btnCari);
        this.btnCari.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (v == this.btnCari) {
            this.listener.changePage(4);
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
