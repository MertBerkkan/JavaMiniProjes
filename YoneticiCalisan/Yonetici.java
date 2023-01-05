package YoneticiCalisan;

public class Yonetici extends Calisanlar {

    private int sorumlu_kisi;

    public Yonetici (String isim, int maas, String departman, int sorumluKisi){
        //this.isim = isim;
        //this.maas = maas;
        //this.departman = departman;

        super(isim, maas, departman);

        this.sorumlu_kisi = sorumluKisi;
    }

    public void zam_yap(int zamMiktari){

        System.out.println("Çalışanlara " + zamMiktari + " tl zam yapıldı.");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();

        System.out.println("Sorumlu olduğu kişi sayısı: " + sorumlu_kisi);
    }
}
