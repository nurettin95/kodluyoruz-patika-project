package Hafta2;

public class FonksiyonOdevleri {
    public FonksiyonOdevleri() {
    }

    public int power(int base, int exponent){
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    public boolean isPrime(int number, int divisor) {
        if (number <= 2)
            return (number == 2);

        if (number % divisor == 0)
            return false;

        if (divisor * divisor > number)
            return true;

        return isPrime(number, divisor + 1);
    }

    public void printPattern(int n) {
        System.out.print(n + " ");

        if (n <= 0)
            return;

        printPattern(n - 5);
        System.out.print(n + " ");
    }
}
