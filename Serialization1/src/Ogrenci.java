import java.io.Serializable;

public class Ogrenci implements Serializable {

    private static final long serialVersionUID = 1000;
    private String isim;
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
