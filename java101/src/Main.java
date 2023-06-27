import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //Değişkenleri oluştur
        int mat,fizik,kimya,turkce,tarih,muzik;

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

        String a="Sınıfı geçti";
        String b = "Sınıfta Kaldı";
        String bas;
        bas = (sonuc > 60) ? a : b;

        System.out.println(bas);

    }
}
