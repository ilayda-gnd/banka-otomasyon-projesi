package com.bank.app.main;

import com.bank.app.accounts.VadesizHesap;
import com.bank.app.cards.KrediKarti;
import com.bank.app.people.BankaPersoneli;
import com.bank.app.people.Musteri;
import com.bank.app.service.BankaService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankaService service = new BankaService();

        System.out.println("===== BANKA SISTEMI BASLADI =====");

        // ---------------- PERSONEL ----------------
        System.out.println("\n--- PERSONEL GIRISI ---");

        System.out.print("Personel adi: ");
        String pAd = scanner.nextLine();

        System.out.print("Personel soyadi: ");
        String pSoyad = scanner.nextLine();

        BankaPersoneli personel = new BankaPersoneli(
                pAd,
                pSoyad,
                "personel@banka.com",
                5559998877L,
                service.personelIdUret()
        );

        System.out.println("\nPersonel sisteme giris yapti: " + personel.getPersonelID());

        // ---------------- MÜŞTERİ ----------------
        System.out.println("\n--- MUSTERI OLUSTURMA ---");

        System.out.print("Musteri adi: ");
        String ad = scanner.nextLine();

        System.out.print("Musteri soyadi: ");
        String soyad = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Telefon: ");
        long telefon = scanner.nextLong();

        Musteri musteri = new Musteri(
                ad,
                soyad,
                email,
                telefon,
                service.musteriNoUret()
        );

        System.out.println("\nMusteri olusturuldu:");
        System.out.println(musteri);

        // ---------------- HESAP ----------------
        System.out.println("\n--- HESAP OLUSTURMA ---");

        VadesizHesap hesap = service.vadesizHesapOlustur(1000);
        musteri.hesapEkle(hesap);

        System.out.println("Hesap olusturuldu: " + hesap);

        System.out.print("\nPara yatirma miktari: ");
        double yatir = scanner.nextDouble();

        hesap.paraYatir(yatir);

        System.out.println("Guncel hesap: " + hesap);

        // ---------------- TRANSFER ----------------
        System.out.println("\n--- PARA TRANSFERI ---");

        VadesizHesap digerHesap = service.vadesizHesapOlustur(500);

        System.out.print("Transfer miktari: ");
        double transfer = scanner.nextDouble();

        hesap.paraTransferi(digerHesap, transfer);

        System.out.println("Gonderen: " + hesap);
        System.out.println("Alan: " + digerHesap);

        // ---------------- KREDİ KARTI ----------------
        System.out.println("\n--- KREDI KARTI ---");

        System.out.print("Kart limiti: ");
        double limit = scanner.nextDouble();

        KrediKarti kart = service.krediKartiOlustur(limit);
        musteri.krediKartiEkle(kart);

        System.out.println("Kart olusturuldu:");
        System.out.println(kart);

        System.out.print("\nKart harcama miktari: ");
        double harcama = scanner.nextDouble();

        kart.borcEkle(harcama);

        System.out.println("Kart guncel:");
        System.out.println(kart);

        // ---------------- BORÇ ÖDEME ----------------
        System.out.print("\nOdeme miktari: ");
        double odeme = scanner.nextDouble();

        hesap.krediKartiBorcOdeme(kart, odeme);

        System.out.println("Odeme sonrasi kart:");
        System.out.println(kart);

        // ---------------- SİSTEM ÖZET ----------------
        System.out.println("\n===== SISTEM OZET =====");
        System.out.println(personel);
        System.out.println(musteri);
        System.out.println(hesap);
        System.out.println(digerHesap);

        scanner.close();
    }
}