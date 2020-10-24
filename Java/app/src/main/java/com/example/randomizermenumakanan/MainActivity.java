package com.example.randomizermenumakanan;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.ListView;

import com.example.randomizermenumakanan.View.FragEdit;
import com.example.randomizermenumakanan.View.FragItemDetail;
import com.example.randomizermenumakanan.View.FragMenu;
import com.example.randomizermenumakanan.View.FragTambahMenu;
import com.example.randomizermenumakanan.View.FragmentListener;
import com.example.randomizermenumakanan.View.MainFragment;

public class MainActivity extends AppCompatActivity implements FragmentListener {

    private MainFragment fragMain;
    private FragmentManager fragmentManager;
    private Toolbar toolbar;
    private DrawerLayout drawer;
    private FragMenu fragMenu;
    private FragTambahMenu fragTambah;
    private FragItemDetail fragDetail;
    private FragEdit fragEdit;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.toolbar = findViewById(R.id.toolbar);
        this.setSupportActionBar(toolbar);
        this.drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle abdt = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.openDrawer, R.string.closeDrawer);
        drawer.addDrawerListener(abdt);
        abdt.syncState();
        this.fragTambah = new FragTambahMenu();
        this.fragMain = new MainFragment();
        this.fragMenu = new FragMenu();
        this.fragDetail = new FragItemDetail();
        this.fragEdit = new FragEdit();
        this.fragmentManager = this.getSupportFragmentManager();
        FragmentTransaction ft = this.fragmentManager.beginTransaction();
        ft.add(R.id.fragment_container, this.fragMain).addToBackStack(null).commit();
    }

    public void changePage(int page) {
        FragmentTransaction ft = this.fragmentManager.beginTransaction();
        if (page == 1) {
            if (this.fragMain.isAdded()) {
                ft.show(this.fragMain);
            } else {
                ft.add(R.id.fragment_container, this.fragMain);
            }
            if (this.fragMenu.isAdded()) {
                ft.hide(this.fragMenu);
            }
            if (this.fragTambah.isAdded()) {
                ft.hide(this.fragTambah);
            }
            if (this.fragDetail.isAdded()) {
                ft.hide(this.fragDetail);
            }
            if (this.fragEdit.isAdded()) {
                ft.hide(this.fragEdit);
            }
        } else if (page == 2) {
            if (this.fragMenu.isAdded()) {
                ft.show(this.fragMenu);
            } else {
                ft.add(R.id.fragment_container, this.fragMenu).addToBackStack(null);
            }
            if (this.fragMain.isAdded()) {
                ft.hide(this.fragMain);
            }
            if (this.fragTambah.isAdded()) {
                ft.hide(this.fragTambah);
            }
            if (this.fragDetail.isAdded()) {
                ft.hide(this.fragDetail);
            }
            if (this.fragEdit.isAdded()) {
                ft.hide(this.fragEdit);
            }
        } else if (page == 3) {
            if (this.fragTambah.isAdded()) {
                ft.show(this.fragTambah);
            } else {
                ft.add(R.id.fragment_container, this.fragTambah).addToBackStack(null);
            }
            if (this.fragMenu.isAdded()) {
                ft.hide(this.fragMenu);
            }
            if (this.fragMain.isAdded()) {
                ft.hide(this.fragMain);
            }
            if (this.fragDetail.isAdded()) {
                ft.hide(this.fragDetail);
            }
            if (this.fragEdit.isAdded()) {
                ft.hide(this.fragEdit);
            }
        } else if (page == 4) {
            if (this.fragDetail.isAdded()) {
                ft.show(this.fragDetail);
            } else {
                ft.add(R.id.fragment_container, this.fragDetail).addToBackStack(null);
            }
            if (this.fragMenu.isAdded()) {
                ft.hide(this.fragMenu);
            }
            if (this.fragMain.isAdded()) {
                ft.hide(this.fragMain);
            }
            if (this.fragTambah.isAdded()) {
                ft.hide(this.fragTambah);
            }
            if (this.fragEdit.isAdded()) {
                ft.hide(this.fragEdit);
            }
        } else if (page == 5) {
            if (this.fragEdit.isAdded()) {
                ft.show(this.fragEdit);
            } else {
                ft.add(R.id.fragment_container, this.fragEdit).addToBackStack(null);
            }
            if (this.fragMenu.isAdded()) {
                ft.hide(this.fragMenu);
            }
            if (this.fragMain.isAdded()) {
                ft.hide(this.fragMain);
            }
            if (this.fragDetail.isAdded()) {
                ft.hide(this.fragDetail);
            }
            if (this.fragTambah.isAdded()) {
                ft.hide(this.fragTambah);
            }
        }
        ft.commit();
        this.drawer.closeDrawers();
    }

    public void closeApplication() {
        this.moveTaskToBack(true);
        this.finish();
    }
}