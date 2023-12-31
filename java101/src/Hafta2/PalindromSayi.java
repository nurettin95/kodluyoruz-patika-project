package Hafta2;

public class PalindromSayi {

    public PalindromSayi() {
    }

    public boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (number == reverseNumber)
            return true;
        else
            return false;
    }
}
