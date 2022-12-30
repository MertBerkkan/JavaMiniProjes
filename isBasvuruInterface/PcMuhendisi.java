package isBasvuruInterface;

public class PcMuhendisi implements ICalis, IMuhendis {
    private boolean askerlik;
    private boolean adliSicil;

    public PcMuhendisi(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }

    @Override
    public void calisiyor() {
        System.out.println("Mühendis çalışıyor.");

    }

    @Override
    public void ad(String ad) {
        System.out.println("İSİM-SOYİSİM: " + ad);

    }

    @Override
    public void askerlik_Sorgula() {
        if (askerlik){
            System.out.println("Askerliğini yapmış.");
        }else {
            System.out.println("Henüz askerliğini yapmamış.");
        }
    }

    @Override
    public void adli_sicil_sorgula() {
        if (adliSicil){
            System.out.println("Adli sicil kaydı mevcut.");
        }else {
            System.out.println("Adli sicil kaydı yok.");
        }
    }

    @Override
    public void mezuniyet_ortalama(double ortalama) {
        System.out.println("Mezuniyet ortalaması: " + ortalama);

    }

    @Override
    public void is_tecrubesi(String[] array) {
        System.out.println("İŞ TECRÜBELERİ");

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}

