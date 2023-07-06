package InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q09_ArmstrongNumber_4Digits {
   /*
    Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407, 1634)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
        1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634

        5 basamakli : 54748
         soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bizim ooolannn bişeyleee girceng mi : ");

        String sayi = input.next();//1634
       // System.out.println(amstrongControl(sayi));

        // Task02->
        girilenSayiyaKadarAmstrongControl(sayi);

        // String[] rakam = sayi.split("");//str girlen sayının her bitr rakamı rakam araya eleman olarak atandı[1,6,3,4]
        // // System.out.println("Arrays.toString(rakam) = " + Arrays.toString(rakam));

        // for (int i = 0; i < rakam.length; i++) {
        //     rakamKupToplam += Math.pow(Double.parseDouble(rakam[i]), rakam.length);
        // }
        // System.out.println(
        //         rakamKupToplam == Integer.parseInt(sayi) ?
        //                 ("bizim oolann sayi " + sayi + " AMSTRONG :) ") :
        //                 "bizim oolann sayi " + sayi + " AMSTRONG değil :( "
        // );


    }//main sonu

    private static void  girilenSayiyaKadarAmstrongControl(String sayi) {

        for (int i = 1; i <=Integer.parseInt(sayi) ; i++) {
            System.out.println(amstrongControl(String.valueOf(i)));
        }
    }

    private static String  amstrongControl(String sayi) {
        int rakamKupToplam = 0;
        String[] rakam = sayi.split("");//str girlen sayının her bitr rakamı rakam araya eleman olarak atandı[1,6,3,4]
        // System.out.println("Arrays.toString(rakam) = " + Arrays.toString(rakam));

        for (int i = 0; i < rakam.length; i++) {
            rakamKupToplam += Math.pow(Double.parseDouble(rakam[i]), rakam.length);
        }

        return
                rakamKupToplam == Integer.parseInt(sayi) ?
                        "bizim oolann sayi " + sayi + " AMSTRONG :) " :
                        "bizim oolann sayi " + sayi + " AMSTRONG değil :( ";

    }

}