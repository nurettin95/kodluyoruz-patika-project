package Hafta1;

import java.util.Scanner;
public class KullaniciGirisi {
    Scanner scanner = new Scanner(System.in);
    String  Dpassword = "java123";
    public KullaniciGirisi() {
    }

    public void SifreKontrol(String userName, String password){


        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız !");
        }
        else if(!userName.equals("patika") || !password.equals(Dpassword)) {
            System.out.println("Bilgileriniz Yanlış !");

            System.out.println("Şifreyi sıfırlamak ister misiniz");
            String cevap = scanner.nextLine();

            if(cevap.equalsIgnoreCase("E")){
                System.out.println("Yeni şifrenizi giriniz: ");
                String newPassword = scanner.nextLine();

                if(!newPassword.equals(Dpassword)){
                    System.out.println("Şifre oluşturuldu.");
                }
                else{
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
            }
            else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        }
    }
}
