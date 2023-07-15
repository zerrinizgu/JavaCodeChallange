package P03_sanslıKullanıcı;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayıt { //step 2->

    static ArrayList<Kullanıcı> kullanıcılar = new ArrayList<>();// Kullanıcı class'dan uretilen obj depolanacagı boş list
    public static ArrayList<Kullanıcı> kayıtAl() {//step 2

        System.out.print("Agam adını giresen : ");

        Kullanıcı k1obj = new Kullanıcı(new Scanner(System.in).nextLine(), LocalDateTime.now());//name vekayıt zamanı polarak girilen k1obj üretildi
        kullanıcılar.add(k1obj);//uretilen k1obj kullanıclar liste eklendi.
        return kullanıcılar;
    }

    public static void sansliKullanıcıBul(ArrayList<Kullanıcı> kllnc) { // step 3

        for (Kullanıcı avuc : kllnc) {
            if (avuc.kayıtZamanı.getSecond() <= 10) {//tekraradaki her bir kullanıcı obj kayıt zamanı saniyesi 10 dan az olam şartı
                System.out.println(avuc.name + " şansli kişisiniz 5 kilo BAL kazandınız sistem giriş zamanı : " + avuc.kayıtZamanı);
            } else
                System.out.println(avuc.name + " şansli kişi değilsiniz  KOVAN YAĞMALANDI :(  sistem giriş zamanı : " + avuc.kayıtZamanı);

        }


    }
    public  static  void listele(ArrayList<Kullanıcı> kullanıcı){

        System.out.println( kullanıcı);


    }
}
