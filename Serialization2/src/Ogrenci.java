import java.io.Serializable;

public class Ogrenci implements Serializable {

    private String isim;
    //private Transient int no ; transient 0 verir serileşmez.

    private int id;
    private String bolum;

    public Ogrenci(String isim, int id, String bolum) {
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
    }

    @Override
    public String toString() {

        String bilgiler = "Öğrenci ; \nİsim: " + isim + "\nNumara: " + id + "\nBölüm: " + bolum;

        return bilgiler;
    }
}
