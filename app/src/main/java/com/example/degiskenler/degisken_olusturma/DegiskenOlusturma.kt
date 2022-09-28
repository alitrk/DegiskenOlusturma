package com.example.degiskenler.degisken_olusturma

fun main() {
    val ogrAd = "Ali"
    val ogrSoyad = "Türk"
    val ogrNo = 832
    val cinsiyet = "M"
    val dTarih = "08.06.2000"
    val islemNo = 10027
    val sinif = "12/B"
    val kitapNo = 17
    val isbnNo = "978-975-6856-00-9"
    val kitapAdi = "Sefiller"
    val yazarNo = 213
    val sayfaSayisi = 400
    val puan = 8.6
    val turno = 4
    val tur = "Dram"
    val yazarAd = "Victor"
    val yazarSoyad = "Hugo"
    val aTarih = "17.08.2022"
    val vTarih = "24.08.2022"

    println("\nÖğrenci bilgileri:")
    println("Öğrenci numarası: $ogrNo, Öğrenci adı: $ogrAd, Öğrenci soyadı: $ogrSoyad, Öğrenci cinsiyet: $cinsiyet, Öğrenci doğum tarihi: $dTarih Sınıf: $sinif\n")
    println("İşlem bilgileri:")
    println("İşlem no: $islemNo, Öğrenci numarası: $ogrNo, Kitap no: $kitapNo, Alış tarihi: $aTarih, Veriş tarihi: $vTarih\n")
    println("Kitap bilgileri:")
    println("Kitap no: $kitapNo, ISBN no: $isbnNo, Kitap adı: $kitapAdi, Yazar no: $yazarNo, Tür no:$turno, Kitap sayfa sayısı: $sayfaSayisi, Kitap puanı: $puan\n")
    println("Yazar bilgileri:")
    println("Yazar no: $yazarNo, Yazar isim: $yazarAd, Yazar soyisim: $yazarSoyad\n")
    println("Tür: $tur")
}