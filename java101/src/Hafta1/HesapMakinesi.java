package Hafta1;

public class HesapMakinesi {

    public HesapMakinesi() {
    }

    public Double Hesapla(int a, int b, int secim) {
        double sonuc = 0.0;

        switch (secim) {
            case 1:
                sonuc = a + b;
                break;
            case 2:
                sonuc = a - b;
                break;
            case 3:
                sonuc = a * b;
                break;
            case 4:
                if (b != 0) {
                    sonuc = a / b;
                } else {
                    System.out.println("Bir sayı 0'a bölünmez !");
                    return null;
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.");
                return null;
        }
        return sonuc;
    }

}
