package Hafta1;

import java.util.Scanner;

public class HarmonicSeries {
    Scanner scanner = new Scanner(System.in);
    public HarmonicSeries() {
    }
    public void HarmonicSeries(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        double harmonicSum = 0;

        for (int i = 1; i <= number; i++) {
            harmonicSum += (1.0 / i);
        }

        System.out.println("Harmonik Seri: " + harmonicSum);
    }
}
