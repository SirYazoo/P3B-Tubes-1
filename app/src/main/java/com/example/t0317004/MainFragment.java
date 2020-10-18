package com.example.t0317004;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainFragment extends Fragment implements View.OnClickListener {

    private EditText etMain;
    private Button btnMain;

    public MainFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        this.etMain = view.findViewById(R.id.et_Main);
        this.btnMain = view.findViewById(R.id.btn_Main);
        this.btnMain.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        if (view == this.btnMain) {
            ResultDialogFragment rdf = new ResultDialogFragment();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            rdf.show(ft, "Your input : " + this.etMain.getText());
            this.etMain.setText("");
        }
    }
}
