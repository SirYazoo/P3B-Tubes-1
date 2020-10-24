package com.example.randomizermenumakanan.View;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.randomizermenumakanan.R;

public class LeftFragment extends Fragment implements View.OnClickListener {

    private Button btnHome;
    private Button btnMenu;
    private Button btnExit;
    private FragmentListener listener;

    public LeftFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_left, container, false);
        this.btnHome = view.findViewById(R.id.btn_home);
        this.btnMenu = view.findViewById(R.id.btn_menu);
        this.btnExit = view.findViewById(R.id.btn_exit);
        this.btnHome.setOnClickListener(this);
        this.btnMenu.setOnClickListener(this);
        this.btnExit.setOnClickListener(this);
        return view;
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
    public void onClick(View view) {
        if (view == this.btnHome) {
            this.listener.changePage(1);
        } else if (view == this.btnMenu) {
            this.listener.changePage(2);
        } else if (view == this.btnExit) {
            this.listener.closeApplication();
        }
    }
}
