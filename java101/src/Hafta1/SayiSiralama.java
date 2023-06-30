package Hafta1;

import java.util.Scanner;

public class SayiSiralama {

    int a,b,c;
    Scanner scanner = new Scanner(System.in);

    public void SayiSiralama() {

        System.out.println("1. sayi: ");
        a = scanner.nextInt();

        System.out.println("2. sayi: ");
        b = scanner.nextInt();

        System.out.println("3. sayi: ");
        c = scanner.nextInt();


        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("c < b < a");
            } else {
                System.out.println("b < c < a");
            }
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println("c < a < b");
            } else {
                System.out.println("a < c < b");
            }
        } else {
            if(a > b){
                System.out.println("b < a < c");
            }
            else{
                System.out.println("a < b < c");
            }
        }
    }



}
