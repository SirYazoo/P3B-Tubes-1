package com.example.randomizermenumakanan.Presenter;

import com.example.randomizermenumakanan.Model.IsiMenu;

import java.util.List;

public interface IMainActivity {
    void updateList(List<IsiMenu> isiMenu);
    void resetForm();
}
