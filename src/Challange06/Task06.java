package Challange06;

import java.util.Scanner;

public class Task06 {

    /*Task->
     Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
     ve x girildiğinde ise "Program bitti" print eden code create ediniz
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c;

        do {
            System.out.print("Agam hele bi şey cizikdiresen : ");
            c = input.next().charAt(0);
            System.out.println("Program çalışıyor");

        }
        while (c != 'x');
        System.out.println("Program bitti");


    }
}
