package Hafta1;

import java.util.Scanner;

public class EnBuyukEnKucukSayiBulma {
    Scanner input = new Scanner(System.in);
    public EnBuyukEnKucukSayiBulma() {
    }

    public void EnBuyukEnKucukSayiBulma(){

        System.out.print("Kaç adet sayı gireceksiniz? N = ");
        int N = input.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            int sayi = input.nextInt();

            if (sayi > max) {
                max = sayi;
            }

            if (sayi < min) {
                min = sayi;
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
