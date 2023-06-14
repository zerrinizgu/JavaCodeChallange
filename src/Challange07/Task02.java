package Challange07;
import java.util.Scanner;

public class Task02 {

		/* Write a method named isEven that accepts an integer argument.
		 The method should return true if the argument is even, or false otherwise.*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz :");
        int sayi = scan.nextInt();
        System.out.println(isEven(sayi));

    }

    public static boolean isEven(int sayi) {
        return  sayi%2 == 0 ? true :false;
    }

}




