package InterviewQuestions;

import java.util.Scanner;

public class Q15_HackerLanguage {

// Task->Girilen bir metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) create ediniz.
//
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.(Array ve String Manipulation)

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Agam bi şeyler giresen : ");
        String  str=input.nextLine();
        hackerDili1(str);
        hackerDili1("javaCan javvaNur javaSu javaTar javaNaz javaHan");

        hackerDili2(str);
        hackerDili2("javaCan javvaNur javaSu javaTar javaNaz javaHan");
    }//main sonu

    private static void hackerDili1(String str) {

        System.out.println(str.
                replaceAll("s", "5").
                replaceAll("a", "4").
                replaceAll("e", "3").
                replaceAll("i", "1").
                replaceAll("o", "0"));

    }
    private static void hackerDili2(String str) {
        String [] arr = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.substring(i,i+1);
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        for (int j = 0; j < str.length(); j++) {
            if(arr[j].contains("s")) {arr[j] = "5";}
            if(arr[j].contains("a")) {arr[j] = "4";}
            if(arr[j].contains("e")) {arr[j] = "3";}
            if(arr[j].contains("i")) {arr[j] = "1";}
            if(arr[j].contains("o")) {arr[j] = "0";}
            System.out.print(arr[j]);
        }
    }
}// Class sonu