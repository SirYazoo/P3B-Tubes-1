package com.example.randomizermenumakanan;

import com.example.randomizermenumakanan.Model.IsiMenu;

import java.util.List;

public interface IFragment {
    void updateList(List<IsiMenu> isiMenu);
    void resetForm();
}
