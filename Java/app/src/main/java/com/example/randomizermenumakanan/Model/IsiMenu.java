package com.example.randomizermenumakanan.Model;

public class IsiMenu {
    private String nama;
    private String tag;
    private String bahan;
    private String langkah;
    private String restoran;

    public IsiMenu(String nama, String tag, String bahan, String langkah, String restoran){
        this.nama = nama;
        this.tag = tag;
        this.bahan = bahan;
        this.langkah = langkah;
        this.restoran = restoran;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setTag(String tag){
        this.tag = tag;
    }

    public void setBahan(String bahan){
        this.bahan = bahan;
    }

    public void setLangkah(String langkah){
        this.langkah = langkah;
    }

    public void setRestoran(String restoran){
        this.restoran = restoran;
    }

    public String getNama(){
        return this.nama;
    }

    public String getTag(){
        return this.tag;
    }

    public String getBahan(){
        return this.bahan;
    }

    public String getLangkah(){
        return this.langkah;
    }

    public String getRestoran(){
        return this.restoran;
    }
}
