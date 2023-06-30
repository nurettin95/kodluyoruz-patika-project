package Hafta2.OgrenciNotSistemi;

public class Teacher {

    String name;
    String mpno;
    String branch;

    public Teacher(String name, String branch, String mpno) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    public void print(){
        System.out.println("Adı :  " + this.name);
        System.out.println("Telefonu : " + this.mpno);
        System.out.println("Bölümü : " + this.branch);
    }
}
