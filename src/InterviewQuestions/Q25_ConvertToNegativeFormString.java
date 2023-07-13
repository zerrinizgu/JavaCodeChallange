package InterviewQuestions;

import java.util.Arrays;

public class Q25_ConvertToNegativeFormString {
    /*  Task->
      Convert the given Array to negative form sentence into a String.

      Input:
      String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};

      Output:
      String output ="JavaIsNOTDifficult";
       */

    public static void main(String[] args) {
        String[] arr = {"J", "a", "v", "a", "I", "s", "D", "i", "f", "f", "i", "c", "u", "l", "t"};
        String str = "";

        System.out.println("   *** for i   ***   ");
         for (int i = 0; i < arr.length; i++) {// arr elamanları tekara alındı
             str += arr[i];// tekrardaki her bir arr elwmanı str'e eklendi

         }

      // System.out.println("   *** foreach   ***   ");
      // Arrays.sort(arr);
      // for (String avuc : arr) {
      //     str += avuc;
      // }
        System.out.println(str);
        System.out.println(str.replace("Is", "IsNOT"));// JavaIsNOTDifficult
    }

}
