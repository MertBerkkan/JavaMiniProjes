package Hayvan;

public class Kedi extends Hayvan {

    private int dis_sayisi;

    public Kedi (String isim, int kilo, int boy, int ayak_sayisi, int dis_sayisi){

        super(isim, kilo, boy, ayak_sayisi);

    }

    @Override
    public void harekete_gec(int hiz) {
        System.out.println("Kedi " + hiz + "km/s ile hareket ediyor.");
    }

    public void kedi_kos(int hiz){

        System.out.println("Kedi koşuyor.....");

        super.harekete_gec(hiz);
    }
}
