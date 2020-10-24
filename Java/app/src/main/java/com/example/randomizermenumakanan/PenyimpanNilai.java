package com.example.randomizermenumakanan;

import android.content.Context;
import android.content.SharedPreferences;

public class PenyimpanNilai {
    protected SharedPreferences sharedPref;
    protected final static String NAMA_SHARED_PREF = "Nilai_display";
    protected final static String KEY_TAMBAH_NAMA = "NAMA";
    protected final static String KEY_TAMBAH_TAG = "TAG";
    protected final static String KEY_TAMBAH_BAHAN = "BAHAM";
    protected final static String KEY_TAMBAH_LANGKAH = "LANGKAH";
    protected final static String KEY_TAMBAH_RESTORAN = "RESTORAN";
    protected final static String KEY_EDIT_NAMA = "NAMA";
    protected final static String KEY_EDIT_TAG = "TAG";
    protected final static String KEY_EDIT_BAHAN = "BAHAN";
    protected final static String KEY_EDIT_LANGKAH = "LANGKAH";
    protected final static String KEY_EDIT_RESTORAN = "RESTORAN";

    public PenyimpanNilai(Context context){
        this.sharedPref = context.getSharedPreferences(NAMA_SHARED_PREF, 0);
    }

    public void saveTambahNama(String nama){
        SharedPreferences.Editor editor = this.sharedPref.edit();
        editor.putString(KEY_TAMBAH_NAMA, nama);
        editor.commit();
    }

    public void saveTambahTag(String tag){
        SharedPreferences.Editor editor = this.sharedPref.edit();
        editor.putString(KEY_TAMBAH_TAG, tag);
        editor.commit();
    }

    public void saveTambahBahan(String bahan){
        SharedPreferences.Editor editor = this.sharedPref.edit();
        editor.putString(KEY_TAMBAH_BAHAN, bahan);
        editor.commit();
    }

    public void saveTambahLangkah(String langkah){
        SharedPreferences.Editor editor = this.sharedPref.edit();
        editor.putString(KEY_TAMBAH_LANGKAH, langkah);
        editor.commit();
    }

    public void saveTambahRestoran(String restoran){
        SharedPreferences.Editor editor = this.sharedPref.edit();
        editor.putString(KEY_TAMBAH_RESTORAN, restoran);
        editor.commit();
    }

    public void saveEditNama(String nama){
        SharedPreferences.Editor editor = this.sharedPref.edit();
        editor.putString(KEY_EDIT_NAMA, nama);
        editor.commit();
    }

    public void saveEditTag(String tag){
        SharedPreferences.Editor editor = this.sharedPref.edit();
        editor.putString(KEY_EDIT_TAG, tag);
        editor.commit();
    }

    public void saveEditBahan(String bahan){
        SharedPreferences.Editor editor = this.sharedPref.edit();
        editor.putString(KEY_EDIT_BAHAN, bahan);
        editor.commit();
    }

    public void saveEditLangkah(String langkah){
        SharedPreferences.Editor editor = this.sharedPref.edit();
        editor.putString(KEY_EDIT_LANGKAH, langkah);
        editor.commit();
    }

    public void saveEditRestoran(String restoran){
        SharedPreferences.Editor editor = this.sharedPref.edit();
        editor.putString(KEY_EDIT_RESTORAN, restoran);
        editor.commit();
    }

    public String getTambahNama(){
        return this.sharedPref.getString(KEY_TAMBAH_NAMA, "");
    }

    public String getTambahTag(){
        return this.sharedPref.getString(KEY_TAMBAH_TAG, "");
    }

    public String getTambahBahan(){
        return this.sharedPref.getString(KEY_TAMBAH_BAHAN, "");
    }

    public String getTambahLangkah(){
        return this.sharedPref.getString(KEY_TAMBAH_LANGKAH, "");
    }

    public String getTambahRestoran(){
        return this.sharedPref.getString(KEY_TAMBAH_RESTORAN, "");
    }

    public String getEditNama(){
        return this.sharedPref.getString(KEY_EDIT_NAMA, "");
    }

    public String getEditTag(){
        return this.sharedPref.getString(KEY_EDIT_TAG, "");
    }

    public String getEditBahan(){
        return this.sharedPref.getString(KEY_EDIT_BAHAN, "");
    }

    public String getEditLangkah(){
        return this.sharedPref.getString(KEY_EDIT_LANGKAH, "");
    }

    public String getEditRestoran(){
        return this.sharedPref.getString(KEY_EDIT_RESTORAN, "");
    }
}
