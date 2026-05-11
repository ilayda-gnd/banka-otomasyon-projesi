package com.bank.app.service;

import com.bank.app.accounts.BankaHesabi;
import com.bank.app.accounts.VadesizHesap;
import com.bank.app.cards.KrediKarti;
import com.bank.app.people.Musteri;

import java.util.Random;

public class BankaService {

    // random IBAN üretici
    public String ibanUret() {

        Random random = new Random();
        StringBuilder sb = new StringBuilder("TR");

        for (int i = 0; i < 24; i++) {
            sb.append(random.nextInt(10));
        }

        return sb.toString();
    }

    // müşteri numarası üretici
    public String musteriNoUret() {
        return "M" + new Random().nextInt(99999);
    }

    // personel ID üretici
    public String personelIdUret() {
        return "P" + new Random().nextInt(99999);
    }

    // kredi kartı numarası üretici
    public String kartNoUret() {

        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 16; i++) {
            sb.append(random.nextInt(10));
        }

        return sb.toString();
    }

    // örnek hesap oluşturma
    public VadesizHesap vadesizHesapOlustur(double bakiye) {
        return new VadesizHesap(ibanUret(), bakiye);
    }

    // kredi kartı oluşturma
    public KrediKarti krediKartiOlustur(double limit) {
        return new KrediKarti(limit);
    }
}