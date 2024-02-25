import java.util.Scanner;

public class Main {

    static boolean isPalindrom(int number) {
        int lastDigit, reverseNumber = 0, tempNumber = number;

        while (tempNumber != 0) {

            lastDigit = tempNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            tempNumber /= 10;

            }
        if (reverseNumber == number) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter a number :");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (isPalindrom(number)){
            System.out.print(number + " bir palindrom sayıdır.");
        }else {
            System.out.print(number + " bir palindrom sayı değildir.");
        }
    }
}