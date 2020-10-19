package com.example.randomizermenumakanan

import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentManager
import com.example.randomizermenumakanan.Fragment.FragmentListener
import com.example.randomizermenumakanan.Fragment.MainFragment
import com.example.randomizermenumakanan.Fragment.FragMenu
import com.example.randomizermenumakanan.Fragment.FragTambahMenu

class MainActivity : AppCompatActivity(), FragmentListener {

    private lateinit var mainFragment: MainFragment
    private lateinit var fragMenu: FragMenu
    private lateinit var fragTambahMenu: FragTambahMenu
    private lateinit var fragmentManager: FragmentManager
    private lateinit var toolbar: Toolbar
    private lateinit var drawer: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        drawer = findViewById(R.id.drawer_layout)
        val abdt = ActionBarDrawerToggle(this, drawer, toolbar, R.string.openDrawer, R.string.closeDrawer)
        drawer.addDrawerListener(abdt)
        abdt.syncState()

        this.fragTambahMenu = FragTambahMenu()
        mainFragment = MainFragment()
        fragMenu = FragMenu()
        fragmentManager = this.supportFragmentManager
        val ft = fragmentManager!!.beginTransaction()
        ft.add(R.id.fragment_container, mainFragment!!).addToBackStack(null).commit()
    }

    override fun changePage(page: Int) {
        val ft = fragmentManager!!.beginTransaction()
        if (page == 1) {
            if (mainFragment!!.isAdded) {
                ft.show(mainFragment!!)
            } else {
                ft.add(R.id.fragment_container, mainFragment!!)
            }
            if (fragMenu!!.isAdded) {
                ft.hide(fragMenu!!)
            }
        } else if (page == 2) {
            if (fragMenu!!.isAdded) {
                ft.show(fragMenu!!)
            } else {
                ft.add(R.id.fragment_container, fragMenu!!).addToBackStack(null)
            }
            if (mainFragment!!.isAdded) {
                ft.hide(mainFragment!!)
            }
        }
        else if (page == 3) {
            if (fragTambahMenu!!.isAdded) {
                ft.show(fragTambahMenu!!)
            } else {
                ft.add(R.id.fragment_container, fragTambahMenu!!).addToBackStack(null)
            }
            if (mainFragment!!.isAdded) {
                ft.hide(mainFragment!!)
            }
        }
        ft.commit()
        drawer!!.closeDrawers()
    }

    override fun closeApplication() {
        moveTaskToBack(true)
        finish()
    }
}