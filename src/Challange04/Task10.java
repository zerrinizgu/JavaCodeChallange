package Challange04;

public class Task10 {


    // Task-> "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde print eden code create ediniz.

    public static void main(String[] args) {
        String s = "   Java ogrenmek123 Cok guzel@      ";

        s = s.replaceAll("\\d", "") //"   Java ogrenmek Cok guzel@      "
                .replace("@", "")  //"   Java ogrenmek Cok guzel      "
                .replace("C", "c") //"   Java ogrenmek cok guzel      "
                .trim();                          //"Java ogrenmek cok guzel"


        System.out.println(s);
    }

}
