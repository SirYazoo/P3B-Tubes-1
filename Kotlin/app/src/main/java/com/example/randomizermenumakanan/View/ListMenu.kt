package com.example.randomizermenumakanan.View

import android.R
import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseExpandableListAdapter
import android.widget.TextView
import com.example.randomizermenumakanan.Model.IsiMenu



class ListMakanan(context: Context, private val listGroup: List<String>, item: List<IsiMenu>) : ArrayAdapter<IsiMenu>(
        context,
        0,
        item

) {
    private var itemList: List<IsiMenu> = item
    private var ctx: Context = context

    override  fun getCount(): Int{
        return itemList.size
    }

    override fun getItem(pos: Int): IsiMenu{
        return itemList[pos]
    }

//    override fun getView(pos: Int, convertView: View?, parent: ViewGroup): View{
//        val itemView: View
//        if(convertView == null){
//            convertView = LayoutInflater.from(this.activity).inflate(R.layout.list_
//        }
//    }
}