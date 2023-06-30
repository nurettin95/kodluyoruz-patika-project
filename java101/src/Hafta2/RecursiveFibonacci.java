package Hafta2;

public class RecursiveFibonacci {
    public RecursiveFibonacci() {
    }

    public int fib(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
}
