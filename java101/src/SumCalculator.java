import java.util.Scanner;

public class SumCalculator {
    Scanner scanner = new Scanner(System.in);

    int sum = 0;

    public SumCalculator() {
    }

    public void SumCalculator(){
        while (true) {
            System.out.print("Bir sayı giriniz (Programı sonlandırmak için -1 giriniz): ");
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            if (number % 2 == 0 && number % 4 == 0) {
                sum += number;
            }
        }

        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı: " + sum);
    }
}
