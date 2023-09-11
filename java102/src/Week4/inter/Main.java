package Week4.inter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Tutar giriniz: ");
        double price = input.nextDouble();

        System.out.println("Kart No giriniz: ");
        String cardNumber = input.next();

        System.out.println("Son Kullanım Tarihi giriniz: ");
        String date = input.next();

        System.out.println("Güvenlik Kodu giriniz: ");
        String cvc = input.next();

        System.out.println("1. A Bankası");
        System.out.println("2. B Bankası");
        System.out.println("3. C Bankası");
        System.out.println("Banka seçiniz : ");
        int selectBank = input.nextInt();

        switch (selectBank){
            case 1:
                ABankasi aPos = new ABankasi("A Bankası", "123123123","123123123");
                aPos.connect("127.1.1.1");
                aPos.payment(price,cardNumber,date,cvc);
                break;
            case 2:
                BBankasi bPos = new BBankasi("A Bankası", "123123123","123123123");
                bPos.connect("asdas");
                bPos.payment(price,cardNumber,date,cvc);
                break;
            default:
                System.out.println("Geçerli banka giriniz !");
        }

    }
}
