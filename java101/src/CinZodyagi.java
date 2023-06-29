import java.util.Scanner;

public class CinZodyagi {
    Scanner scanner = new Scanner(System.in);

    public CinZodyagi() {
    }

    public void CinZodyagi(){
        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumYili = scanner.nextInt();

        int indeks = dogumYili % 12;

        String zodyakBurcu = "";

        if (indeks == 0) {
            zodyakBurcu = "Maymun";
        } else if (indeks == 1) {
            zodyakBurcu = "Horoz";
        } else if (indeks == 2) {
            zodyakBurcu = "Köpek";
        } else if (indeks == 3) {
            zodyakBurcu = "Domuz";
        } else if (indeks == 4) {
            zodyakBurcu = "Fare";
        } else if (indeks == 5) {
            zodyakBurcu = "Öküz";
        } else if (indeks == 6) {
            zodyakBurcu = "Kaplan";
        } else if (indeks == 7) {
            zodyakBurcu = "Tavşan";
        } else if (indeks == 8) {
            zodyakBurcu = "Ejderha";
        } else if (indeks == 9) {
            zodyakBurcu = "Yılan";
        } else if (indeks == 10) {
            zodyakBurcu = "At";
        } else if (indeks == 11) {
            zodyakBurcu = "Koyun";
        }

        System.out.println("Çin Zodyağı Burcunuz: " + zodyakBurcu);
    }
}
