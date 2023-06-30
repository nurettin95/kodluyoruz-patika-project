package Hafta1;

public class Kdv {

    public double KdvDegeri(double money) {

        double kdv = money * 0.18;
        return kdv;
    }

    public double KdvliTutar(double money) {

        money = money + (money * 0.18);

        return money;
    }
}
