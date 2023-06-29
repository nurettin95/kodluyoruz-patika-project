import java.util.Scanner;

public class ArtikYil {
    Scanner scanner = new Scanner(System.in);
    public ArtikYil() {
    }

    public void ArtikYil() {
        System.out.print("Yıl Giriniz: ");
        int yil = scanner.nextInt();

        boolean artikYil = false;

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    artikYil = true;
                }
            } else {
                artikYil = true;
            }
        }

        if (artikYil) {
            System.out.println(yil + " bir artık yıldır !");
        } else {
            System.out.println(yil + " bir artık yıl değildir !");
        }
    }
}
