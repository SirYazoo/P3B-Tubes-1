package com.example.randomizermenumakanan;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentListener {

    private MainFragment mainFragment;
    private SecondFragment secondFragment;
    private FragmentManager fragmentManager;
    private Toolbar toolbar;
    private DrawerLayout drawer;

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
        this.mainFragment = new MainFragment();
        this.secondFragment = new SecondFragment();
        this.fragmentManager = this.getSupportFragmentManager();
        FragmentTransaction ft = this.fragmentManager.beginTransaction();
        ft.add(R.id.fragment_container, this.mainFragment).addToBackStack(null).commit();
    }

    public void changePage(int page) {
        FragmentTransaction ft = this.fragmentManager.beginTransaction();
        if (page == 1) {
            if (this.mainFragment.isAdded()) {
                ft.show(this.mainFragment);
            } else {
                ft.add(R.id.fragment_container, this.mainFragment);
            }
            if (this.secondFragment.isAdded()) {
                ft.hide(this.secondFragment);
            }
        } else if (page == 2) {
            if (this.secondFragment.isAdded()) {
                ft.show(this.secondFragment);
            } else {
                ft.add(R.id.fragment_container, this.secondFragment).addToBackStack(null);
            }
            if (this.mainFragment.isAdded()) {
                ft.hide(this.mainFragment);
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