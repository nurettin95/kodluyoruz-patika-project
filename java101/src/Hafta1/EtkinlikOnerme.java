package Hafta1;

import java.util.Scanner;

public class EtkinlikOnerme {

    int heat;
    Scanner scanner = new Scanner(System.in);

    public EtkinlikOnerme() {

    }

    public void EtlinlikOnerme(){
        System.out.println("Sıcaklık giriniz: ");
        heat = scanner.nextInt();

        if(heat < 5){
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if(heat >=5 && heat <= 25){
            if(heat <= 15){
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if (heat >=10){
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        }
        else {
            System.out.println("Yüzmeye de gidebilrisiniz.");

        }
    }

}
