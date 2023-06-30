import Hafta2.PalindromSayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        //Değişkenleri oluştur
        int mat,fizik,kimya,turkce,tarih,muzik;
        double tutar;

        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.println("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.println("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.println("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.println("Turkce notunuz: ");
        turkce = inp.nextInt();

        System.out.println("Tarih notunuz: ");
        tarih = inp.nextInt();

        System.out.println("Muzik notunuz: ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız : " + sonuc);

        System.out.println(sonuc > 60 ? "Sınıfı geçti : b" : "Sınıfta Kaldı");

        System.out.println("Para değerini giriniz");
        Scanner money = new Scanner(System.in);
        tutar = money.nextDouble();

        Hafta1.Kdv kdv = new Hafta1.Kdv();
        System.out.println("Kdvsiz tutar : " + tutar);
        System.out.println("Hafta1.Kdv değeri : " + kdv.KdvDegeri(tutar));
        System.out.println("Kdvli toplam tutar : " + kdv.KdvliTutar(tutar));

        Hafta1.UcgenHipotenus ucgenHipotenus = new Hafta1.UcgenHipotenus();
        int aKenari, bKenari;
        double c;
        Scanner ucgen = new Scanner(System.in);
        System.out.println("1. kenarı giriniz: ");
        aKenari = ucgen.nextInt();
        System.out.println("2. kenarı giriniz: ");
        bKenari = ucgen.nextInt();
        System.out.println("Üçgenin hipotenüsü: " + ucgenHipotenus.hipotenus(aKenari,bKenari));



        int km;
        Scanner kmInput = new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden giriniz: ");
        km = kmInput.nextInt();

        Hafta1.Taksimetre taksimetre = new Hafta1.Taksimetre();
        System.out.println("Toplam tutar: " + taksimetre.kmHesapla(km));

        Scanner yaricapInput = new Scanner(System.in);
        System.out.println("Yarıçapı giriniz: ");
        int yaricap = yaricapInput.nextInt();

        Hafta1.DaireAlanVeCevre daireAlanVeCevre = new Hafta1.DaireAlanVeCevre();
        System.out.println("Dairenin alanı: " + daireAlanVeCevre.DaireAlanHesapla(yaricap));
        System.out.println("Dairen çevresi: " + daireAlanVeCevre.DaireCevreHesapla(yaricap));


        System.out.println("Kilonu (kg) giriniz: ");
        int kilo = input.nextInt();
        System.out.println("Boyunuzu giriniz: ");
        double boy = input.nextDouble();

        Hafta1.VucutKitleEndeksi vucutKitleEndeksi = new Hafta1.VucutKitleEndeksi();
        System.out.println("Vücut Kitle Endesiniz: " + vucutKitleEndeksi.kitleEndeksiHesapla(kilo,boy));

        System.out.println("Armut kaç kilo: " );
        int armutKilo = input.nextInt();
        System.out.println("Elma kaç kilo: " );
        int elmaKilo = input.nextInt();
        System.out.println("Domates kaç kilo: " );
        int domatesKilo = input.nextInt();
        System.out.println("Muz kaç kilo: " );
        int muzKilo = input.nextInt();
        System.out.println("Patlıcan kaç kilo: " );
        int patlicanKilo = input.nextInt();

        Hafta1.ManavKasaProgram manavKasaProgram = new Hafta1.ManavKasaProgram();
        System.out.println("Toplam tutar: " + manavKasaProgram.ToplamHesapla(armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo));


        int n1, n2, select;

        System.out.println("İlk sayıyı giriniz : ");
        n1 = input.nextInt();

        System.out.println("İkinci sayıyı giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz : ");
        select = input.nextInt();

        Hafta1.HesapMakinesi hesapMakinesi = new Hafta1.HesapMakinesi();
        System.out.println("Sonuç : " + hesapMakinesi.Hesapla(n1, n2, select));

        String userName, password;

        System.out.println("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.println("Şifreniz: ");
        password = input.nextLine();

        Hafta1.KullaniciGirisi kullaniciGirisi = new Hafta1.KullaniciGirisi();
        kullaniciGirisi.SifreKontrol(userName,password);

        Hafta1.SinifGecmeDurumu sinifGecmeDurumu = new Hafta1.SinifGecmeDurumu();
        sinifGecmeDurumu.Hafta1.SinifGecmeDurumu();

        Hafta1.EtkinlikOnerme etkinlikOnerme = new Hafta1.EtkinlikOnerme();
        etkinlikOnerme.EtlinlikOnerme();

        Hafta1.SayiSiralama sayiSiralama = new Hafta1.SayiSiralama();
        sayiSiralama.Hafta1.SayiSiralama();

        Hafta1.BurcBulma burcBulma = new Hafta1.BurcBulma();
        burcBulma.Hafta1.BurcBulma();

        Hafta1.UcakBiletiFiyatHesaplama ucakBiletiFiyatHesaplama = new Hafta1.UcakBiletiFiyatHesaplama();
        ucakBiletiFiyatHesaplama.ucakBiletiFiyatHesaplama();

        Hafta1.CinZodyagi cinZodyagi = new Hafta1.CinZodyagi();
        cinZodyagi.Hafta1.CinZodyagi();

        Hafta1.ArtikYil artikYil = new Hafta1.ArtikYil();
        artikYil.Hafta1.ArtikYil();

        Hafta1.AverageCalculator averageCalculator = new Hafta1.AverageCalculator();
        averageCalculator.Hafta1.AverageCalculator();

        Hafta1.SumCalculator sumCalculator = new Hafta1.SumCalculator();
        sumCalculator.Hafta1.SumCalculator();

        Hafta1.PowerCalculator powerCalculator = new Hafta1.PowerCalculator();
        powerCalculator.Hafta1.PowerCalculator();

        Hafta1.CombinationCalculator combinationCalculator = new Hafta1.CombinationCalculator();
        combinationCalculator.Hafta1.CombinationCalculator();

        Hafta1.UsluSayilar usluSayilar = new Hafta1.UsluSayilar();
        usluSayilar.usluSayilar();

        Hafta1.DigitSumCalculator digitSumCalculator = new Hafta1.DigitSumCalculator();
        digitSumCalculator.Hafta1.DigitSumCalculator();

        Hafta1.HarmonicSeries harmonicSeries = new Hafta1.HarmonicSeries();
        harmonicSeries.Hafta1.HarmonicSeries();

        Hafta1.DiamondPattern diamondPattern = new Hafta1.DiamondPattern();
        diamondPattern.Hafta1.DiamondPattern();

        Hafta1.EbobEkok ebobEkok = new Hafta1.EbobEkok();
        ebobEkok.ebobEkok();

        Hafta1.EnBuyukEnKucukSayiBulma enBuyukEnKucukSayiBulma = new Hafta1.EnBuyukEnKucukSayiBulma();
        enBuyukEnKucukSayiBulma.Hafta1.EnBuyukEnKucukSayiBulma();

        Hafta1.MukemmelSayi mukemmelSayi = new Hafta1.MukemmelSayi();
        mukemmelSayi.Hafta1.MukemmelSayi();

        Hafta1.TersUcgen tersUcgen = new Hafta1.TersUcgen();
        tersUcgen.tersUcgen();

        Fibonacci fibonacci = new Fibonacci();
        fibonacci.Fibonacci();
         */
        PalindromSayi palindromSayi = new PalindromSayi();
        palindromSayi.isPalindrom(101);

    }
}
