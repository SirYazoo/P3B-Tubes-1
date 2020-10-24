package com.example.randomizermenumakanan.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.randomizermenumakanan.R;

public class MainFragment extends Fragment implements View.OnClickListener {

    private Button btnMain;

    public MainFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        this.btnMain = view.findViewById(R.id.btn_Main);
        this.btnMain.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
//        if (view == this.btnMain) {
//
//        }
    }
}
