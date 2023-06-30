package Hafta1;

public class ManavKasaProgram {

    double armut = 2.14;
    double elma = 3.67;
    double domates = 1.11;
    double muz = 0.95;
    double patlican = 5.00;

    public ManavKasaProgram() {
    }

    public double ToplamHesapla(int armutKilo, int elmaKilo, int domatesKilo, int muzKilo, int patlicanKilo){

        return (armut * armutKilo) + (elma * elmaKilo) + (domates * domatesKilo) + (muz * muzKilo) + (patlican * patlicanKilo);
    }
}
