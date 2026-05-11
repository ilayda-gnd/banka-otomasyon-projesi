package com.bank.app.accounts;

import com.bank.app.cards.KrediKarti;

public class VadesizHesap extends BankaHesabi {

    // Constructor
    public VadesizHesap(String iban, double bakiye) {
        super(iban, bakiye);
    }

    // Para transferi
    public void paraTransferi(BankaHesabi alici, double miktar) {

        if (bakiye >= miktar) {
            this.bakiye -= miktar;     // gönderen
            alici.bakiye += miktar;    // alıcı

            System.out.println("Transfer başarılı.");
        } else {
            System.out.println("Yetersiz bakiye.");
        }
    }

    // Kredi kartı borç ödeme
    public void krediKartiBorcOdeme(KrediKarti kart, double miktar) {

        if (bakiye >= miktar) {

            bakiye -= miktar; // hesaptan düş

            kart.setGuncelBorc(
                    kart.getGuncelBorc() - miktar
            );

            System.out.println("Kredi kartı borcu ödendi.");
        } else {
            System.out.println("Yetersiz bakiye.");
        }
    }
}