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

        Kdv kdv = new Kdv();
        System.out.println("Kdvsiz tutar : " + tutar);
        System.out.println("Kdv değeri : " + kdv.KdvDegeri(tutar));
        System.out.println("Kdvli toplam tutar : " + kdv.KdvliTutar(tutar));

        UcgenHipotenus ucgenHipotenus = new UcgenHipotenus();
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

        Taksimetre taksimetre = new Taksimetre();
        System.out.println("Toplam tutar: " + taksimetre.kmHesapla(km));

        Scanner yaricapInput = new Scanner(System.in);
        System.out.println("Yarıçapı giriniz: ");
        int yaricap = yaricapInput.nextInt();

        DaireAlanVeCevre daireAlanVeCevre = new DaireAlanVeCevre();
        System.out.println("Dairenin alanı: " + daireAlanVeCevre.DaireAlanHesapla(yaricap));
        System.out.println("Dairen çevresi: " + daireAlanVeCevre.DaireCevreHesapla(yaricap));


        System.out.println("Kilonu (kg) giriniz: ");
        int kilo = input.nextInt();
        System.out.println("Boyunuzu giriniz: ");
        double boy = input.nextDouble();

        VucutKitleEndeksi vucutKitleEndeksi = new VucutKitleEndeksi();
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

        ManavKasaProgram manavKasaProgram = new ManavKasaProgram();
        System.out.println("Toplam tutar: " + manavKasaProgram.ToplamHesapla(armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo));


        int n1, n2, select;

        System.out.println("İlk sayıyı giriniz : ");
        n1 = input.nextInt();

        System.out.println("İkinci sayıyı giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz : ");
        select = input.nextInt();

        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        System.out.println("Sonuç : " + hesapMakinesi.Hesapla(n1, n2, select));

        String userName, password;

        System.out.println("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.println("Şifreniz: ");
        password = input.nextLine();

        KullaniciGirisi kullaniciGirisi = new KullaniciGirisi();
        kullaniciGirisi.SifreKontrol(userName,password);

        SinifGecmeDurumu sinifGecmeDurumu = new SinifGecmeDurumu();
        sinifGecmeDurumu.SinifGecmeDurumu();

        EtkinlikOnerme etkinlikOnerme = new EtkinlikOnerme();
        etkinlikOnerme.EtlinlikOnerme();

        SayiSiralama sayiSiralama = new SayiSiralama();
        sayiSiralama.SayiSiralama();

        BurcBulma burcBulma = new BurcBulma();
        burcBulma.BurcBulma();

        UcakBiletiFiyatHesaplama ucakBiletiFiyatHesaplama = new UcakBiletiFiyatHesaplama();
        ucakBiletiFiyatHesaplama.ucakBiletiFiyatHesaplama();

        CinZodyagi cinZodyagi = new CinZodyagi();
        cinZodyagi.CinZodyagi();

        ArtikYil artikYil = new ArtikYil();
        artikYil.ArtikYil();

        AverageCalculator averageCalculator = new AverageCalculator();
        averageCalculator.AverageCalculator();

        SumCalculator sumCalculator = new SumCalculator();
        sumCalculator.SumCalculator();

        PowerCalculator powerCalculator = new PowerCalculator();
        powerCalculator.PowerCalculator();

        CombinationCalculator combinationCalculator = new CombinationCalculator();
        combinationCalculator.CombinationCalculator();

        UsluSayilar usluSayilar = new UsluSayilar();
        usluSayilar.usluSayilar();

        DigitSumCalculator digitSumCalculator = new DigitSumCalculator();
        digitSumCalculator.DigitSumCalculator();

        HarmonicSeries harmonicSeries = new HarmonicSeries();
        harmonicSeries.HarmonicSeries();

        DiamondPattern diamondPattern = new DiamondPattern();
        diamondPattern.DiamondPattern();

        EbobEkok ebobEkok = new EbobEkok();
        ebobEkok.ebobEkok();

        EnBuyukEnKucukSayiBulma enBuyukEnKucukSayiBulma = new EnBuyukEnKucukSayiBulma();
        enBuyukEnKucukSayiBulma.EnBuyukEnKucukSayiBulma();

        MukemmelSayi mukemmelSayi = new MukemmelSayi();
        mukemmelSayi.MukemmelSayi();

        TersUcgen tersUcgen = new TersUcgen();
        tersUcgen.tersUcgen();

         */
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.Fibonacci();
    }
}
