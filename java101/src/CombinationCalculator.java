import java.util.Scanner;

public class CombinationCalculator {
    Scanner scanner = new Scanner(System.in);
    public CombinationCalculator() {
    }
    public void CombinationCalculator(){
        System.out.print("N sayısını giriniz: ");
        int n = scanner.nextInt();

        System.out.print("R sayısını giriniz: ");
        int r = scanner.nextInt();

        int nFactorial = factorial(n);
        int rFactorial = factorial(r);
        int nMinusRFactorial = factorial(n - r);

        int combination = nFactorial / (rFactorial * nMinusRFactorial);

        System.out.println("C(" + n + ", " + r + ") = " + combination);
    }
    private static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
