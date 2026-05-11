package com.bank.app.people;

import com.bank.app.accounts.BankaHesabi;
import com.bank.app.cards.KrediKarti;

import java.util.ArrayList;

public class Musteri extends Kisi {

    // Müşteri numarası
    private String musteriNumarasi;

    // Müşterinin sahip olduğu hesaplar
    private ArrayList<BankaHesabi> hesaplar;

    // Müşterinin sahip olduğu kredi kartları
    private ArrayList<KrediKarti> krediKartlari;

    // Constructor
    public Musteri(String ad,
                   String soyad,
                   String email,
                   long telefonNumarasi,
                   String musteriNumarasi) {

        super(ad, soyad, email, telefonNumarasi);

        this.musteriNumarasi = musteriNumarasi;

        // Listeler başlatılır
        this.hesaplar = new ArrayList<>();
        this.krediKartlari = new ArrayList<>();
    }

    // Hesap ekleme işlemi
    public void hesapEkle(BankaHesabi hesap) {
        hesaplar.add(hesap);

        System.out.println("Yeni hesap eklendi.");
    }

    // Kredi kartı ekleme işlemi
    public void krediKartiEkle(KrediKarti kart) {
        krediKartlari.add(kart);

        System.out.println("Yeni kredi karti eklendi.");
    }

    // Hesap silme işlemi
    public void hesapSil(BankaHesabi hesap) {

        // Hesap bakiyesi kontrol edilir
        if (hesap.getBakiye() > 0) {

            System.out.println("Lutfen once bakiyenizi baska hesaba aktariniz.");

        } else {

            hesaplar.remove(hesap);

            System.out.println("Hesap basariyla silindi.");
        }
    }

    // Kredi kartı silme işlemi
    public void krediKartiSil(KrediKarti kart) {

        // Kart borcu kontrol edilir
        if (kart.getGuncelBorc() > 0) {

            System.out.println("Lutfen once kredi karti borcunuzu odeyiniz.");

        } else {

            krediKartlari.remove(kart);

            System.out.println("Kredi karti silindi.");
        }
    }

    // Müşteri numarasını döndürür
    public String getMusteriNumarasi() {
        return musteriNumarasi;
    }

    // Müşteri numarasını günceller
    public void setMusteriNumarasi(String musteriNumarasi) {
        this.musteriNumarasi = musteriNumarasi;
    }

    // Hesap listesini döndürür
    public ArrayList<BankaHesabi> getHesaplar() {
        return hesaplar;
    }

    // Hesap listesini günceller
    public void setHesaplar(ArrayList<BankaHesabi> hesaplar) {
        this.hesaplar = hesaplar;
    }

    // Kredi kartı listesini döndürür
    public ArrayList<KrediKarti> getKrediKartlari() {
        return krediKartlari;
    }

    // Kredi kartı listesini günceller
    public void setKrediKartlari(ArrayList<KrediKarti> krediKartlari) {
        this.krediKartlari = krediKartlari;
    }

    // Müşteri bilgilerini yazdırır
    @Override
    public String toString() {
        return "Musteri No: " + musteriNumarasi +
                ", Ad: " + ad +
                ", Soyad: " + soyad +
                ", Telefon: " + telefonNumarasi +
                ", Hesap Sayisi: " + hesaplar.size() +
                ", Kart Sayisi: " + krediKartlari.size();
    }
}