package P03_sanslıKullanıcı;

import java.time.LocalDateTime;

public class Kullanıcı { // step 1-> kullanıcı obj uretecek main olmayan pojo class


    String  name;
    LocalDateTime kayıtZamanı;

   // public Kullanıcı() {//p'siz cons
   // }

    public Kullanıcı(String name, LocalDateTime kayıtZamanı) {//obj uretecek full p'li telescopic const.        this.name = name;
        this.kayıtZamanı = kayıtZamanı;
        this.name = name;;
    }

    @Override
    public String toString() {// obj field'larını stringe çeviren   meth
        return
                "name='" + name + '\'' +
                ", kayıtZamanı=" + kayıtZamanı ;
    }
}
