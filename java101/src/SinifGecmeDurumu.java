import java.util.Scanner;

public class SinifGecmeDurumu {

    int mat,fizik,turkce,kimya,muzik;
    Scanner scanner = new Scanner(System.in);

    public SinifGecmeDurumu() {
    }

    public void SinifGecmeDurumu(){

        System.out.println("Matematik Notunuz : ");
        mat = scanner.nextInt();

        System.out.println("Türkçe notunuz : ");
        turkce = scanner.nextInt();

        System.out.println("Fizik notunuz : ");
        fizik = scanner.nextInt();

        System.out.println("Kimya notunuz : ");
        kimya = scanner.nextInt();

        System.out.println("Müzik notunuz : ");
        muzik = scanner.nextInt();

        int gecerliNotSayisi = 0;
        double avarage = 0.0;

        if (mat >= 0 && mat <= 100) {
            avarage += mat;
            gecerliNotSayisi++;
        }

        if (turkce >= 0 && turkce <= 100) {
            avarage += turkce;
            gecerliNotSayisi++;
        }

        if (fizik >= 0 && fizik <= 100) {
            avarage += fizik;
            gecerliNotSayisi++;
        }

        if (kimya >= 0 && kimya <= 100) {
            avarage += kimya;
            gecerliNotSayisi++;
        }

        if (muzik >= 0 && muzik <= 100) {
            avarage += muzik;
            gecerliNotSayisi++;
        }

        if (gecerliNotSayisi > 0) {
            avarage /= gecerliNotSayisi;
            if (avarage <= 55){
                System.out.println("Sınıfta kaldınız.");
            }
            else{
                System.out.println("Tebrikler, sınıfı geçtiniz !");
            }
            System.out.println("Ortalamanız : " + avarage);
        }
        else {
            System.out.println("Hiç geçerli not girilmedi.");
        }
    }

}
