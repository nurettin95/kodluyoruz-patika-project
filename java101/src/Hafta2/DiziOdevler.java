package Hafta2;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class DiziOdevler {

    public void odev1(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutu n: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Dizinin elemanlarını giriniz:");

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.print("Sıralama: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public void odev2(){
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Elemanların frekanslarını hesapla
        for (int num : array) {
            if (frequencyMap.containsKey(num)) {
                int count = frequencyMap.get(num);
                frequencyMap.put(num, count + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        // Frekansları ekrana yazdır
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();
            System.out.println(number + " sayısı " + frequency + " kere tekrar edildi.");
        }
    }

    public void odev3(){
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        // Matrisin transpozunu hesapla
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Transpozu ekrana yazdır
        System.out.println("Matris:");
        printMatrix(matrix);

        System.out.println("Transpoz:");
        printMatrix(transpose);
    }

    // Matrisi ekrana yazdıran yardımcı metot
    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
