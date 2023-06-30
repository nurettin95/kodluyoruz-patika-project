package Hafta1;

public class Taksimetre {
    public Taksimetre() {
    }

    public double kmHesapla(int km){
        double total;
        total = km * 2.20;
        total += 10;

        total = (total < 20) ? 20 : total;

        return total;
    }
}
