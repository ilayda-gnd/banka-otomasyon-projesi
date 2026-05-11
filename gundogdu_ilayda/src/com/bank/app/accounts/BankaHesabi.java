package com.bank.app.accounts;

public class BankaHesabi {

    // Hesap numarası (IBAN)
    protected String iban;

    // Hesap bakiyesi
    protected double bakiye;

    // Constructor
    public BankaHesabi(String iban, double bakiye) {
        this.iban = iban;
        this.bakiye = bakiye;
    }

    // Para yatırma işlemi
    public void paraYatir(double miktar) {
        bakiye += miktar; // bakiye artırılır
    }

    // Para çekme işlemi
    public void paraCek(double miktar) {
        if (miktar <= bakiye) {
            bakiye -= miktar;
        } else {
            System.out.println("Yetersiz bakiye!");
        }
    }

    // Getter - Setter
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    // Hesap bilgisi
    @Override
    public String toString() {
        return "IBAN: " + iban + ", Bakiye: " + bakiye;
    }
}