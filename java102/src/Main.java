import Week4.Calculate;
import Week4.Course;
import Week4.User;

public class Main {
    public static void main(String[] args) {
        /*

        Week4.first.Player p1 = new Week4.first.Player("Nurettin",1);
        p1.login();

        Week4.first.Player p2 = new Week4.first.Player("Kodluyoruz",2);
        p2.login();

        Week4.first.Player p3 = new Week4.first.Player("Patika.dev", 3);
        p3.login();

        System.out.println(Week4.first.Player.count);

        Week4.first.Player p1 = new Week4.first.Player("Nurettin Görsoy", 1);
        p1.showName();

        Course mat = new Course("Matematik","MAT-101", 70);
        Course fizik = new Course("Fizik","FZK-101", 20);
        Course kimya = new Course("Kimya","KMY-101", 100);

        //int[] notlar = {mat.note, fizik.note, kimya.note};
        Course[] dersler = {mat, fizik, kimya};

        Calculate.calcAvarage(dersler);

         */

        System.out.println("1. Program başladı.");

        User u1 = new User("Nurettin Görsoy");
        User u2 = new User("Patika Dev");
        User u3 = new User("Kodluyoruz");

        System.out.println("Counter Son Değer : " + User.counter);
        System.out.println("Program Bitti");

    }
}