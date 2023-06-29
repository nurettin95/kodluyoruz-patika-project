import java.util.Scanner;

public class DiamondPattern {
    Scanner scanner = new Scanner(System.in);
    public DiamondPattern() {
    }

    public void DiamondPattern(){
        System.out.print("Elmas deseni için bir sayı giriniz (tek sayı): ");
        int n = scanner.nextInt();

        // Üst yarım elmas
        for (int i = 1; i <= n; i += 2) {
            for (int j = 1; j <= (n - i) / 2; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Alt yarım elmas
        for (int i = n - 2; i >= 1; i -= 2) {
            for (int j = 1; j <= (n - i) / 2; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
