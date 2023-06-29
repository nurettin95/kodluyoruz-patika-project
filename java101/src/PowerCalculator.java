import java.util.Scanner;

public class PowerCalculator {
    Scanner scanner = new Scanner(System.in);
    public PowerCalculator() {
    }
    public void PowerCalculator(){
        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int powerOf4 = (int) Math.pow(4, i);
            int powerOf5 = (int) Math.pow(5, i);

            System.out.println("4^" + i + " = " + powerOf4);
            System.out.println("5^" + i + " = " + powerOf5);
        }
    }
}
