package Week4.Inheritance;

public class Patika {
    public static void main(String[] args) {
        //Calisan c1 = new Calisan("Nurettin Görsoy","0532212121221","info@patika.dev");

        //Akademisyen a1 = new Akademisyen("Patika Dev","051233211221","bilgi@patika.dev","CENG","DOCENT");
        //Memur m1 = new Memur("Ali Veli", "01331632","a@patika.dev","Bilgi İşlem","09:00-18:00");

        OgretimGorevlisi o1 = new OgretimGorevlisi("Mahmut Çetindağ","0","mahmut@patika.dev","CENG","DOCENT","110");
        o1.derseGir("10:00");


        //LabAsistani l1 = new LabAsistani("İbo", "123654","ibo@patika.dev","FZT","Fizyoterapist","13:00-18:00");
        //l1.lablaraGir();

        //method overriding (methodlarda geçersiz kılma)
        //Polimorfizm (Çok Biçimlilik)
        //o1.giris();
        //a1.giris();
        //c1.giris();
        //m1.giris();
        //Calisan a2 = new Akademisyen("Kodluyoruz","051233211221","bilgi@patika.dev","CENG","DOCENT");
        //a2.giris();

        //int[] loginUser = new int[5];
        //Calisan[] loginUser = {c1,a1,m1,o1};
        //Calisan.girisYapanlar(loginUser);

        // Abstraction (Soyutlama)

    }
}
