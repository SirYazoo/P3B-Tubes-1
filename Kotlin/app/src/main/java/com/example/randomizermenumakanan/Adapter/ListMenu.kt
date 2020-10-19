package com.example.randomizermenumakanan.Adapter

import android.R
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.TextView


class ListMakanan(context: Context, private val listGroup: List<String>, Item: HashMap<String, List<Makanan>>) : BaseExpandableListAdapter() {
    private val listItem: HashMap<String, List<Makanan>>
    private val context: Context
    override fun getGroupCount(): Int {
        return listGroup.size
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return listItem[getGroup(groupPosition)]!!.size()
    }

    override fun getGroup(groupPosition: Int): Any {
        return listGroup[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        return listItem[getGroup(groupPosition)]!![childPosition]
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(groupPosition: Int, isExpanded: Boolean, convertView: View?, parent: ViewGroup?): View? {
        var convertView: View? = convertView
        if (convertView == null) {
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.list_item_group, null)
        }
        val namaMakanan = convertView.findViewById(R.id.namaMenu) as TextView
        namaMakanan.text = getGroup(groupPosition) as String
        return convertView
    }

    override fun getChildView(groupPosition: Int, childPosition: Int, isLastChild: Boolean, convertView: View?, parent: ViewGroup?): View? {
        var convertView: View? = convertView
        if (convertView == null) {
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.list_item, null)
        }
        val tag = convertView.findViewById(R.id.tag_hasil) as TextView
        val bahan = convertView.findViewById(R.id.bahan_hasil) as TextView
        val langkah = convertView.findViewById(R.id.langkah_hasil) as TextView
        val resto = convertView.findViewById(R.id.resto_hasil) as TextView
        val makanan: Makanan = getChild(groupPosition, childPosition) as Makanan
        tag.setText(makanan.getTag())
        bahan.setText(makanan.getBahan())
        langkah.setText(makanan.getLangkahMemasak())
        resto.setText(makanan.getResto())
        return convertView
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }

    init {
        this.context = context
        listItem = Item
    }
}