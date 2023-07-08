package project02;

import java.util.Arrays;

public class Task05_EksikArrayEleman {
    /*
    Task-> 1 den 10 a kadar sayılardan oluşan dizide eksik olan sayıyı return eden  metod create ediniz..

     ([1, 2, 3, 5, 6, 7, 8, 10,9]) ➞ 4
    ([7, 2, 3, 10, 5, 9, 1, 4, 8]) ➞ 6
    ([7, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 10

     */

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6, 7, 8, 10, 9};
        int[] arr1 = {7, 2, 3, 10, 5, 9, 1, 4, 8};
        int[] arr2 = {7, 5, 1, 2, 4, 6, 8, 3, 9};
        int[] arr3 = {7, 5, 10, 2, 4, 6, 8, 3, 9};

        System.out.println("eksikElelmanBul(arr) = " + eksikElelmanBul(arr));// 4
        System.out.println("eksikElelmanBul(arr1) = " + eksikElelmanBul(arr1));// 6
        System.out.println("eksikElelmanBul(arr2) = " + eksikElelmanBul(arr2));// 10
        System.out.println("eksikElelmanBul(arr3) = " + eksikElelmanBul(arr3));// 1
    }//main sonu

    private static int eksikElelmanBul(int[] arr) {
        int arrToplam = 0;
        for (int i = 0; i < arr.length; i++) {
            arrToplam += arr[i];
        }
        return 55 - arrToplam;
    }
 /*
 2. yol
  public static int missingNumber(int [] arr) {
        int missingNumber = 0;
        Arrays.sort(arr);
        for (int i = arr.length-1; i > 0; i--) {
            if (arr[arr.length-1] == 9){
                missingNumber =10;
            }else if(arr[0] == 2){
                missingNumber = 1;
            } else if((arr[i] - arr[i-1]) > 1){
                missingNumber = arr[i] - 1;
            }
        }
        return missingNumber;
    }


 3.yol
    public static void main(String[] args) {

        int[] array= {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10};
        int[]input={1, 2, 3, 5, 6, 7, 8,9,10};
        int olmayanSayi=array[0];
        Arrays.sort(input);
        for (int i = 0; i < array.length-1 ; i++) {
            if(array[i]!=input[i]) {
                olmayanSayi=array[i];
                break;
            }else{
                olmayanSayi=array[array.length-1];
            }
        }
        System.out.println(olmayanSayi);
    }

  */
}//Class sonu

