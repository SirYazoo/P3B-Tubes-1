package com.example.randomizermenumakanan

import android.content.Context
import android.content.SharedPreferences

class PenyimpanNilai {
    protected lateinit var sharedPref: SharedPreferences
    protected final var NAMA_SHARED_PREF: String = "Nilai_display"
    protected final var KEY_TAMBAH_NAMA: String = "NAMA"
    protected final var KEY_TAMBAH_TAG:  String = "TAG"
    protected final var KEY_TAMBAH_BAHAN: String = "BAHAN"
    protected final var KEY_TAMBAH_LANGKAH: String = "LANGKAH"
    protected final var KEY_TAMBAH_RESTORAN: String = "RESTORAN"
    protected final var KEY_EDIT_NAMA: String = "NAMA"
    protected final var KEY_EDIT_TAG: String = "TAG"
    protected final var KEY_EDIT_BAHAN: String = "BAHAN"
    protected final var KEY_EDIT_LANGKAH: String = "LANGKAH"
    protected final var KEY_EDIT_RESTORAN: String = "RESTORAN"

    constructor(context: Context){
        this.sharedPref = context.getSharedPreferences(NAMA_SHARED_PREF,0)
    }

    fun saveTambahNama(nama: String){
        val editor: SharedPreferences.Editor = this.sharedPref.edit()
        editor.putString(KEY_TAMBAH_NAMA, nama)
        editor.commit()
    }
    fun saveTambahTag(harga: String){
        val editor: SharedPreferences.Editor = this.sharedPref.edit()
        editor.putString(KEY_TAMBAH_TAG, harga)
        editor.commit()
    }
    fun saveTambahBahan(bahan: String){
        val editor: SharedPreferences.Editor = this.sharedPref.edit()
        editor.putString(KEY_TAMBAH_BAHAN, bahan)
        editor.commit()
    }
    fun saveTambahLangkah(langkah: String){
        val editor: SharedPreferences.Editor = this.sharedPref.edit()
        editor.putString(KEY_TAMBAH_LANGKAH, langkah)
        editor.commit()
    }
    fun saveTambahRestoran(restoran: String){
        val editor: SharedPreferences.Editor = this.sharedPref.edit()
        editor.putString(KEY_TAMBAH_RESTORAN, restoran)
        editor.commit()
    }
    fun saveEditNama(nama: String){
        val editor: SharedPreferences.Editor = this.sharedPref.edit()
        editor.putString(KEY_EDIT_NAMA, nama)
        editor.commit()
    }
    fun saveEditTag(tag: String){
        val editor: SharedPreferences.Editor = this.sharedPref.edit()
        editor.putString(KEY_EDIT_TAG, tag)
        editor.commit()
    }
    fun saveEditBahan(bahan: String){
        val editor: SharedPreferences.Editor = this.sharedPref.edit()
        editor.putString(KEY_EDIT_BAHAN, bahan)
        editor.commit()
    }
    fun saveEditLangkah(langkah: String){
        val editor: SharedPreferences.Editor = this.sharedPref.edit()
        editor.putString(KEY_EDIT_LANGKAH, langkah)
        editor.commit()
    }
    fun saveEditRestoran(restoran: String){
        val editor: SharedPreferences.Editor = this.sharedPref.edit()
        editor.putString(KEY_EDIT_RESTORAN, restoran)
        editor.commit()
    }
    fun getTambahNama(): String?{
        return this.sharedPref.getString(KEY_TAMBAH_NAMA, "")
    }
    fun getTambahTag(): String?{
        return this.sharedPref.getString(KEY_TAMBAH_TAG, "")
    }
    fun getTambahBahan(): String? {
        return this.sharedPref.getString(KEY_TAMBAH_BAHAN, "")
    }
    fun getTambahLangkah(): String? {
        return this.sharedPref.getString(KEY_TAMBAH_LANGKAH, "")
    }
    fun getTambahRestoran(): String? {
        return this.sharedPref.getString(KEY_TAMBAH_RESTORAN, "")
    }
    fun getEditNama(): String? {
        return this.sharedPref.getString(KEY_EDIT_NAMA, "")
    }
    fun getEditTag(): String? {
        return this.sharedPref.getString(KEY_EDIT_TAG, "")
    }
    fun getEditBahan(): String? {
        return this.sharedPref.getString(KEY_EDIT_BAHAN, "")
    }
    fun getEditLangkah(): String? {
        return this.sharedPref.getString(KEY_EDIT_LANGKAH, "")
    }
    fun getEditRestoran(): String? {
        return this.sharedPref.getString(KEY_EDIT_RESTORAN, "")
    }
}