import java.util.Scanner;

public class MukemmelSayi {
    Scanner input = new Scanner(System.in);
    public MukemmelSayi() {
    }

    public void MukemmelSayi(){
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        int toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        if (toplam == sayi) {
            System.out.println(sayi + " mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " mükemmel sayı değildir.");
        }
    }
}
