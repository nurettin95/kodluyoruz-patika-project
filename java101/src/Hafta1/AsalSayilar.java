package Hafta1;

public class AsalSayilar {

    public AsalSayilar() {
    }

    public void asalSayilar(){
        System.out.println("1 - 100 arasindaki asal sayilar:");
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
