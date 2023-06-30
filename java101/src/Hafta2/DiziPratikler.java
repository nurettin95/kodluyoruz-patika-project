package Hafta2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DiziPratikler {

    public void pratik1(){
        int[] arr = {2, 4, 6, 8, 10};

        double harmonicMean = calculateHarmonicMean(arr);
        System.out.println("Dizinin harmonik ortalaması: " + harmonicMean);
    }

    public static double calculateHarmonicMean(int[] arr) {
        int n = arr.length;
        double sum = 0;

        // Elemanların harmonik serisini hesapla
        for (int num : arr) {
            sum += 1.0 / num;
        }

        // Harmonik ortamayı hesapla
        double harmonicMean = n / sum;

        return harmonicMean;
    }

    public void pratik2(){
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        int target = 5;

        Arrays.sort(arr); // Diziyi küçükten büyüğe sırala

        int closestSmaller = 0;
        int closestGreater = 0;

        for (int num : arr) {
            if (num < target) {
                closestSmaller = num;
            } else if (num > target) {
                closestGreater = num;
                break; // İlk olarak girilen sayıdan büyük olanı bulduktan sonra döngüyü sonlandır
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + closestSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + closestGreater);
    }

    public void pratik3(){
        char[][] letterB = {
                {'*', '*', ' ', ' '},
                {'*', ' ', '*', ' '},
                {'*', ' ', '*', ' '},
                {'*', '*', ' ', ' '},
                {'*', ' ', '*', ' '},
                {'*', ' ', '*', ' '},
                {'*', '*', ' ', ' '}
        };

        // Harfi ekrana yazdır
        for (int i = 0; i < letterB.length; i++) {
            for (int j = 0; j < letterB[i].length; j++) {
                System.out.print(letterB[i][j]);
            }
            System.out.println();
        }
    }

    public void pratik4(){

        int[] numbers = {2, 3, 4, 5, 6, 4, 3, 7, 8, 6, 2, 9, 10, 8, 5};

        // Tekrar eden çift sayıları depolamak için bir Set kullanıyoruz
        Set<Integer> duplicates = new HashSet<>();
        // Çift sayıları depolamak için bir Set kullanıyoruz
        Set<Integer> evenNumbers = new HashSet<>();

        for (int number : numbers) {
            // Sadece çift sayıları kontrol ediyoruz
            if (number % 2 == 0) {
                // Eğer çift sayı zaten çift sayılar setinde varsa, tekrar eden çift sayıdır
                if (evenNumbers.contains(number)) {
                    duplicates.add(number);
                } else {
                    // Eğer çift sayı çift sayılar setinde yoksa, sete ekliyoruz
                    evenNumbers.add(number);
                }
            }
        }
        // Tekrar eden çift sayıları ekrana yazdır
        System.out.println("Tekrar eden çift sayılar:");
        for (int duplicate : duplicates) {
            System.out.println(duplicate);
        }
    }
}
