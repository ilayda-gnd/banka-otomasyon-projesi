package com.bank.app.people;

public class Kisi {

    // Temel kimlik bilgileri
    protected String ad;
    protected String soyad;
    protected String email;

    // Telefon numarası long tutuldu
    // Çünkü int veri tipi büyük telefon numaraları için yetersiz kalabilir
    protected long telefonNumarasi;

    // Constructor
    public Kisi(String ad, String soyad, String email, long telefonNumarasi) {
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.telefonNumarasi = telefonNumarasi;
    }

    // Ad bilgisini döndürür
    public String getAd() {
        return ad;
    }

    // Ad bilgisini günceller
    public void setAd(String ad) {
        this.ad = ad;
    }

    // Soyad bilgisini döndürür
    public String getSoyad() {
        return soyad;
    }

    // Soyad bilgisini günceller
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    // Email bilgisini döndürür
    public String getEmail() {
        return email;
    }

    // Email bilgisini günceller
    public void setEmail(String email) {
        this.email = email;
    }

    // Telefon numarasını döndürür
    public long getTelefonNumarasi() {
        return telefonNumarasi;
    }

    // Telefon numarasını günceller
    public void setTelefonNumarasi(long telefonNumarasi) {
        this.telefonNumarasi = telefonNumarasi;
    }

    // Nesne bilgilerini yazdırır
    @Override
    public String toString() {
        return "Ad: " + ad +
                ", Soyad: " + soyad +
                ", Email: " + email +
                ", Telefon: " + telefonNumarasi;
    }
}