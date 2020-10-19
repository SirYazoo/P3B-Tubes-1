package com.example.randomizermenumakanan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.DialogFragment;

public class ResultDialogFragment extends DialogFragment {

    private TextView tvResult;

    public ResultDialogFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_result_dialog, container, false);
        this.tvResult = view.findViewById(R.id.tvResult);
        this.tvResult.setText(getTag());
        return view;
    }
}