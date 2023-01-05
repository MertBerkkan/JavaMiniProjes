package YoneticiCalisan;

public class Calisanlar {


    // inheritance = kalıtım
    // extends ile çalışıyor.
    //super'i unutma!!!
    private String isim;
    private int maas;
    private String departman;

    public Calisanlar(String isim, int maas, String departman) {
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }

    public void bilgileriGoster (){

        System.out.println("İsim: " + isim);
        System.out.println("Maaş: " + maas);
        System.out.println("Departman: " + departman);
    }

    public void calis (){

        System.out.println("Çalışan çalışıyor.....");
    }

    public void departman_degistir(String yeniDepartman){

        this.departman = yeniDepartman;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
