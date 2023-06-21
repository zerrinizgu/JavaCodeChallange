package Challange06;

import java.util.Scanner;

public class Task09_HarfSay {
    /* Task->
     * Kullanicidan bir cumle ve bir harf alin,
     * Cumlede harfin kac kere
     * kullanildigini bulup, yazdirin
     *
     * ORNEK:
     *
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Agam hele bi şey cizikdiresen : ");

        String cumle = input.nextLine();
        System.out.print("Agam aradıgın harfi giresen  : ");

        char harf = input.next().charAt(0);
        int harfAdedi=0;

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) ==harf) {
                harfAdedi++;
            }
        }
        System.out.println(harf+" harfi Adedi = " + harfAdedi);


    }


}
