package com.example.randomizermenumakanan.Presenter;

import com.example.randomizermenumakanan.Model.IsiMenu;
import com.example.randomizermenumakanan.View.FragmentListener;

import java.util.LinkedList;
import java.util.List;

public class MainPresenter {
    protected List<IsiMenu> isiMenu;
    protected IMainActivity ui;
    protected FragmentListener listener;

    public MainPresenter(IMainActivity IMainActivity, FragmentListener listener) {
        this.ui = IMainActivity;
        this.isiMenu = new LinkedList<>();
        this.listener = listener;
    }

    public void deleteList(int position) {
        this.isiMenu.remove(position);
        this.ui.updateList(this.isiMenu);
    }

    public void addList(String nama, String tag, String bahan, String langkah, String restoran) {
        this.isiMenu.add(new IsiMenu(nama, tag, bahan, langkah, restoran));
        this.ui.updateList(this.isiMenu);
        this.ui.resetForm();
    }

    public void editList(int index, String nama, String tag, String bahan, String langkah, String restoran) {
        this.isiMenu.get(index).setNama(nama);
        this.isiMenu.get(index).setTag(tag);
        this.isiMenu.get(index).setBahan(bahan);
        this.isiMenu.get(index).setLangkah(langkah);
        this.isiMenu.get(index).setRestoran(restoran);
        this.ui.updateList(this.isiMenu);
        this.ui.resetForm();
    }

    public void itemDetail(IsiMenu isiMenu) {
        this.listener.getItemDetail(isiMenu);
    }

    public void changePage(int page) {
        this.listener.changePage(page);
    }
}
