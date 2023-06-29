import java.util.Scanner;

public class AverageCalculator {
    Scanner scanner = new Scanner(System.in);
    public AverageCalculator() {
    }

    public void AverageCalculator(){
        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }

        double average = (double) sum / count;

        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + average);
    }


}
