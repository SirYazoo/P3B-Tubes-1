package com.example.randomizermenumakanan.Model

class IsiMenu {
    private lateinit var nama: String
    private lateinit var tag: String
    private lateinit var bahan: String
    private lateinit var langkah: String
    private lateinit var restoran: String

    constructor(nama: String, tag: String, bahan: String, langkah: String, restoran: String){
        this.nama = nama
        this.tag = tag
        this.bahan = bahan
        this.langkah = langkah
        this.restoran = restoran
    }
    fun setNama(nama: String){
        this.nama = nama
    }
    fun setTag(tag: String){
        this.tag = tag
    }
    fun setBahan(bahan: String){
        this.bahan = bahan
    }
    fun setLangkah(langkah: String){
        this.langkah = langkah
    }
    fun setRestoran(restoran: String){
        this.restoran = restoran
    }

    fun getNama(): String{
        return this.nama
    }

    fun getTag(): String{
        return this.tag
    }

    fun getBahan(): String{
        return this.bahan
    }
    fun getLangkah(): String{
        return this.langkah
    }
    fun getRestoran(): String{
        return this.restoran
    }
}