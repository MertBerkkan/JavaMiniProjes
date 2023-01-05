package Hayvan;

public class Hayvan {

    private String isim;
    private int kilo;
    private int boy;
    private int ayak_sayisi;

    public Hayvan(String isim, int kilo, int boy, int ayak_sayisi) {
        this.isim = isim;
        this.kilo = kilo;
        this.boy = boy;
        this.ayak_sayisi = ayak_sayisi;
    }

    public void yemek_ye (){

        System.out.println("Hayvan şu anda yemek yiyor.");
    }

    public void harekete_gec(int hiz){

        System.out.println("Hayvan " + hiz + " km/s ile hareket ediyor.");
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getAyak_sayisi() {
        return ayak_sayisi;
    }

    public void setAyak_sayisi(int ayak_sayisi) {
        this.ayak_sayisi = ayak_sayisi;
    }
}
