package com.example.randomizermenumakanan.View;

import com.example.randomizermenumakanan.Model.IsiMenu;

public interface FragmentListener {
    void changePage(int page);
    void closeApplication();
    void getItemDetail(IsiMenu isiMenu, int position);
}
