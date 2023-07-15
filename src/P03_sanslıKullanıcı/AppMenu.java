package P03_sanslıKullanıcı;

import java.util.ArrayList;
import java.util.Scanner;

import static P03_sanslıKullanıcı.Kayıt.*;

public class AppMenu {
    public static void giris() {
        System.out.println("Lütfen işleminizi seciniz : \n1->Kullanıcı Kayıt Al\n" +
                "2->Şanslı Kişi Bul\n3->Kayıtları Listele\n0->Çıkış");

        System.out.print("seçiminizi giriniz : ");


        switch (new Scanner(System.in).nextInt()) {

            case 0:
                cıkıs();
                break;
            case 1:
                kullanıcılar = kayıtAl();//Kayıt Classdan kayıtAl met call edildi
                giris();
                break;
            case 2:
                sansliKullanıcıBul(kullanıcılar);
                giris();
                break;
            case 3:
               listele(kullanıcılar);
                giris();
                break;
            default:
                System.out.println("Hatalı giriş tekrar giriş yapınız ");
                break;
        }
    }

    private static void cıkıs() {
        System.out.println("cıkısınız yapılmıştır. DEWAMKEE ");
    }


}
