package Hafta1;

import java.util.Scanner;

public class UsluSayilar {
    Scanner scanner = new Scanner(System.in);

    public UsluSayilar() {
    }

    public void usluSayilar(){
        System.out.print("Taban sayıyı giriniz: ");
        int base = scanner.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int exponent = scanner.nextInt();

        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println(base + "^" + exponent + " = " + result);
    }
}
