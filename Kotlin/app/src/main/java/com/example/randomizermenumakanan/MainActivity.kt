package com.example.randomizermenumakanan

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentManager
import com.example.randomizermenumakanan.View.FragmentListener
import com.example.randomizermenumakanan.View.MainFragment
import com.example.randomizermenumakanan.View.FragMenu
import com.example.randomizermenumakanan.View.FragTambahMenu
import com.example.randomizermenumakanan.View.FragEdit
import com.example.randomizermenumakanan.View.FragItemDetail

class MainActivity : AppCompatActivity(), FragmentListener {

    private lateinit var fragMain: MainFragment
    private lateinit var fragMenu: FragMenu
    private lateinit var fragTambah: FragTambahMenu
    private lateinit var fragDetail: FragItemDetail
    private lateinit var fragEdit: FragEdit
    private lateinit var fragmentManager: FragmentManager
    private lateinit var toolbar: Toolbar
    private lateinit var drawer: DrawerLayout
    private lateinit var listview: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        drawer = findViewById(R.id.drawer_layout)
        val abdt = ActionBarDrawerToggle(this, drawer, toolbar, R.string.openDrawer, R.string.closeDrawer)
        drawer.addDrawerListener(abdt)
        abdt.syncState()

        this.fragTambah = FragTambahMenu()
        fragMain = MainFragment()
        fragMenu = FragMenu()
        fragDetail = FragItemDetail()
        fragEdit = FragEdit()
        fragmentManager = this.supportFragmentManager
        val ft = fragmentManager.beginTransaction()
        ft.add(R.id.fragment_container, fragMain).addToBackStack(null).commit()
    }

    override fun changePage(page: Int) {
        val ft = fragmentManager.beginTransaction()
        if (page == 1) {
            if (fragMain.isAdded) {
                ft.show(fragMain)
            } else {
                ft.add(R.id.fragment_container, fragMain)
            }
            if (fragMenu.isAdded) {
                ft.hide(fragMenu)
            }
            if (fragTambah.isAdded) {
                ft.hide(fragTambah)
            }
            if (fragDetail.isAdded) {
                ft.hide(fragDetail)
            }
            if (fragEdit.isAdded) {
                ft.hide(fragEdit)
            }
        } else if (page == 2) {
            if (fragMenu.isAdded) {
                ft.show(fragMenu)
            } else {
                ft.add(R.id.fragment_container, fragMenu).addToBackStack(null)
            }
            if (fragTambah.isAdded) {
                ft.hide(fragTambah)
            }
            if (fragDetail.isAdded) {
                ft.hide(fragDetail)
            }
            if (fragEdit.isAdded) {
                ft.hide(fragEdit)
            }
            if (fragMain.isAdded) {
                ft.hide(fragMain)
            }
        } else if (page == 3) {
            if (fragTambah.isAdded) {
                ft.show(fragTambah)
            } else {
                ft.add(R.id.fragment_container, fragTambah).addToBackStack(null)
            }
            if (fragDetail.isAdded) {
                ft.hide(fragDetail)
            }
            if (fragEdit.isAdded) {
                ft.hide(fragEdit)
            }
            if (fragMain.isAdded) {
                ft.hide(fragMain)
            }
            if (fragMenu.isAdded) {
                ft.hide(fragMenu)
            }
        } else if (page == 4) {
            if (fragDetail.isAdded) {
                ft.show(fragDetail)
            } else {
                ft.add(R.id.fragment_container, fragDetail).addToBackStack(null)
            }
            if (fragTambah.isAdded) {
                ft.hide(fragTambah)
            }
            if (fragMain.isAdded) {
                ft.hide(fragMain)
            }
            if (fragEdit.isAdded) {
                ft.hide(fragEdit)
            }
            if (fragMenu.isAdded) {
                ft.hide(fragMenu)
            }

        } else if (page == 5) {
            if (fragEdit.isAdded) {
                ft.show(fragEdit)
            } else {
                ft.add(R.id.fragment_container, fragEdit).addToBackStack(null)
            }
            if (fragMain.isAdded) {
                ft.hide(fragMain)
            }
            if (fragMenu.isAdded) {
                ft.hide(fragMenu)
            }
            if (fragDetail.isAdded) {
                ft.hide(fragDetail)
            }
            if (fragEdit.isAdded) {
                ft.hide(fragEdit)
            }
        }

        ft.commit()
        drawer.closeDrawers()
    }

    override fun closeApplication() {
        moveTaskToBack(true)
        finish()
    }
}