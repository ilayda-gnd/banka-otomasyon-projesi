package com.bank.app.cards;

import java.util.Random;

public class KrediKarti {

    // Kart numarası (otomatik üretilecek)
    private String kartNumarasi;

    // Kart limiti
    private double limit;

    // Güncel borç
    private double guncelBorc;

    // Kullanılabilir limit
    private double kullanilabilirLimit;

    // Constructor
    public KrediKarti(double limit) {

        this.limit = limit;
        this.guncelBorc = 0;

        // başlangıçta kullanılabilir limit = toplam limit
        this.kullanilabilirLimit = limit;

        // kart numarası üret
        this.kartNumarasi = kartNoUret();
    }

    // Kart numarası üretici
    private String kartNoUret() {

        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 16; i++) {
            sb.append(random.nextInt(10)); // 0-9 arası rakam
        }

        return sb.toString();
    }

    // Borç güncelleme (harcama vs)
    public void borcEkle(double miktar) {

        if (miktar <= kullanilabilirLimit) {

            guncelBorc += miktar;
            kullanilabilirLimit -= miktar;

        } else {
            System.out.println("Limit yetersiz!");
        }
    }

    // Getter - Setter
    public String getKartNumarasi() {
        return kartNumarasi;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getGuncelBorc() {
        return guncelBorc;
    }

    public void setGuncelBorc(double guncelBorc) {
        this.guncelBorc = guncelBorc;

        // borç azaldıkça limit geri gelir
        this.kullanilabilirLimit = limit - guncelBorc;
    }

    public double getKullanilabilirLimit() {
        return kullanilabilirLimit;
    }

    // Kart bilgisi
    @Override
    public String toString() {
        return "Kart No: " + kartNumarasi +
                ", Limit: " + limit +
                ", Borç: " + guncelBorc +
                ", Kullanılabilir: " + kullanilabilirLimit;
    }
}