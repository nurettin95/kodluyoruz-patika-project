package Hafta1;
import java.util.Scanner;

public class Fibonacci {
    Scanner input = new Scanner(System.in);
    public Fibonacci() {
    }

    public void Fibonacci(){
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int n = input.nextInt();

        int first = 0;
        int second = 1;
        int sum;

        System.out.print("Fibonacci Serisi: " + first + " " + second);

        for (int i = 2; i < n; i++) {
            sum = first + second;
            System.out.print(" " + sum);
            first = second;
            second = sum;
        }
    }
}
