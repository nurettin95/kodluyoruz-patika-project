package Hafta1;

import java.util.Scanner;

public class EbobEkok {
    Scanner input = new Scanner(System.in);
    public EbobEkok() {
    }
    public void ebobEkok(){
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        int ebob = 1;
        int ekok = sayi1 * sayi2;

        int kucuk = Math.min(sayi1, sayi2);
        int buyuk = Math.max(sayi1, sayi2);

        while (kucuk > 0) {
            int kalan = buyuk % kucuk;
            buyuk = kucuk;
            kucuk = kalan;
        }

        ebob = buyuk;
        ekok /= ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
