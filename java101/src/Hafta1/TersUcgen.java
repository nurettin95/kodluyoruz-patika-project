package Hafta1;

import java.util.Scanner;

public class TersUcgen {
    Scanner input = new Scanner(System.in);
    public TersUcgen() {
    }

    public void tersUcgen(){
        System.out.print("Basamak sayısını giriniz: ");
        int basamak = input.nextInt();

        for (int i = basamak; i >= 1; i--) {
            for (int j = 1; j <= basamak - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
