package com.bank.app.accounts;

public class YatirimHesabi extends BankaHesabi {

    public YatirimHesabi(String iban, double bakiye) {
        super(iban, bakiye);
    }

    // Para ekleme
    public void paraEkle(double miktar) {
        bakiye += miktar;
    }

    // Para çekme
    public void paraCek(double miktar) {

        if (miktar <= bakiye) {
            bakiye -= miktar;
        } else {
            System.out.println("Yetersiz yatırım bakiyesi!");
        }
    }
}