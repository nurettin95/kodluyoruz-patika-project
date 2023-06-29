import java.util.Scanner;

public class DigitSumCalculator {
    Scanner scanner = new Scanner(System.in);

    public DigitSumCalculator() {
    }

    public void DigitSumCalculator(){

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        int sum = 0;
        int tempNumber = number;

        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            sum += digit;
            tempNumber /= 10;
        }
        System.out.println("Basamakların toplamı: " + sum);
    }
}
