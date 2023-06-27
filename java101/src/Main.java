import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        String a = "Sınıfı geçti";
        String b = "Sınıfta Kaldı";
        String bas;
        bas = (sonuc > 60) ? a : b;

        System.out.println(bas);

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


    }
}
