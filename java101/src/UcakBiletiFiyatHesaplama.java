import java.util.Scanner;

public class UcakBiletiFiyatHesaplama {

    int km, age, yolculukTipi;
    double normalTutar;
    double yasIndirimi;
    double indirimliTutar;
    double toplamTutar;
    double gidisDonusIndirim;

    Scanner scanner = new Scanner(System.in);

    public UcakBiletiFiyatHesaplama() {
    }

    public void ucakBiletiFiyatHesaplama(){
        System.out.println("Mesafeyi km türünden giriniz : ");
        km = scanner.nextInt();
        System.out.println("Yaşınızı giriniz : ");
        age = scanner.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş ): ");
        yolculukTipi = scanner.nextInt();

        if(km > 0 && age > 0 && yolculukTipi == 1 || yolculukTipi == 2){
            if(age < 12 && yolculukTipi == 1){
                normalTutar = km * 0.10;
                yasIndirimi = normalTutar * 0.50;
                indirimliTutar = normalTutar - yasIndirimi;
                toplamTutar = indirimliTutar * 1;
                System.out.println("Toplam Tutar = " + toplamTutar);
            }
            else if(age < 12 && yolculukTipi == 2){
                normalTutar = km * 0.10;
                yasIndirimi = normalTutar * 0.50;
                indirimliTutar = normalTutar - yasIndirimi;
                gidisDonusIndirim = indirimliTutar * 0.20;
                toplamTutar = (indirimliTutar - gidisDonusIndirim) * 2;
                System.out.println("Toplam Tutar = " + toplamTutar);
            }
            else if(age > 12 && age < 24 && yolculukTipi == 1){
                normalTutar = km * 0.10;
                yasIndirimi = normalTutar * 0.10;
                indirimliTutar = normalTutar - yasIndirimi;
                toplamTutar = indirimliTutar * 1;
                System.out.println("Toplam Tutar = " + toplamTutar);
            }
            else if(age > 12 && age < 24 && yolculukTipi == 2){
                normalTutar = km * 0.10;
                yasIndirimi = normalTutar * 0.10;
                indirimliTutar = normalTutar - yasIndirimi;
                gidisDonusIndirim = indirimliTutar * 0.20;
                toplamTutar = (indirimliTutar - gidisDonusIndirim) * 2;
                System.out.println("Toplam Tutar = " + toplamTutar);
            }
            else if(age > 24 && age < 65 && yolculukTipi == 1){
                normalTutar = km * 0.10;
                toplamTutar = normalTutar;
                System.out.println("Toplam Tutar = " + toplamTutar);
            }
            else if(age > 24 && age < 65 && yolculukTipi == 2){
                normalTutar = km * 0.10;
                gidisDonusIndirim = normalTutar * 0.20;
                toplamTutar = (normalTutar - gidisDonusIndirim) * 2;
                System.out.println("Toplam Tutar = " + toplamTutar);
            }
            else if(age > 65 && yolculukTipi == 1){
                normalTutar = km * 0.10;
                yasIndirimi = normalTutar * 0.30;
                indirimliTutar = normalTutar - yasIndirimi;
                toplamTutar = indirimliTutar * 1;
                System.out.println("Toplam Tutar = " + toplamTutar);
            }
            else if(age > 65 && yolculukTipi == 2){
                normalTutar = km * 0.10;
                yasIndirimi = normalTutar * 0.30;
                indirimliTutar = normalTutar - yasIndirimi;
                gidisDonusIndirim = indirimliTutar * 0.20;
                toplamTutar = (indirimliTutar - gidisDonusIndirim) * 2;
                System.out.println("Toplam Tutar = " + toplamTutar);
            }
        }
        else
            System.out.println("Hatalı Veri Girdiniz !");

    }
}
