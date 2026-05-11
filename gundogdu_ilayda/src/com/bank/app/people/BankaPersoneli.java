package com.bank.app.people;

public class BankaPersoneli extends Kisi {

    // Personel ID
    private String personelID;

    // Constructor (MAIN ile birebir uyumlu)
    public BankaPersoneli(String ad,
                          String soyad,
                          String email,
                          long telefonNumarasi,
                          String personelID) {

        super(ad, soyad, email, telefonNumarasi);
        this.personelID = personelID;
    }

    // Personel ID döndürür
    public String getPersonelID() {
        return personelID;
    }

    // Personel ID günceller
    public void setPersonelID(String personelID) {
        this.personelID = personelID;
    }

    @Override
    public String toString() {
        return "Personel ID: " + personelID +
                ", Ad: " + ad +
                ", Soyad: " + soyad +
                ", Telefon: " + telefonNumarasi;
    }
}