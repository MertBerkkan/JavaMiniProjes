package isBasvuruInterface;


public class Main {
    public static void main(String[] args) {

        IMuhendis muhendis = new PcMuhendisi(true, false);
        IMuhendis muhendis1 = new PcMuhendisi(true, true);
        IMuhendis muhendis2 = new MakineMuhendisi(true,true);
        MakineMuhendisi muhendis3 = new MakineMuhendisi(false, false);

        System.out.println("\t\tGELEN BAŞVURULAR");

        System.out.println();

        muhendis.ad("Mert Berkkan");
        muhendis.adli_sicil_sorgula();
        muhendis.askerlik_Sorgula();
        muhendis.mezuniyet_ortalama(3.10);

        String[] is_tecrube = {"Vestel, Kodak, AAA yazılım"};
        muhendis.is_tecrubesi(is_tecrube);

        System.out.println("---------------------------------------");

        muhendis1.ad("Mehmet Ali");
        muhendis1.adli_sicil_sorgula();
        muhendis1.askerlik_Sorgula();
        muhendis1.mezuniyet_ortalama(2.85);

        String[] is_tecrube1 = {"Alioski"};
        muhendis1.is_tecrubesi(is_tecrube1);

        System.out.println("---------------------------------------");

        muhendis2.ad("Mustafa Ali");
        muhendis2.adli_sicil_sorgula();
        muhendis2.askerlik_Sorgula();
        muhendis2.mezuniyet_ortalama(2.55);

        String[] is_tecrube2 = {"Alabora, MAll"};
        muhendis2.is_tecrubesi(is_tecrube1);

        String[] referans = {"Sabri Kandemir, Tayfun Kelen"};
        ((MakineMuhendisi)muhendis2).referans(referans);

        System.out.println("---------------------------------------");

        muhendis3.ad("Hasan Ali");
        muhendis3.adli_sicil_sorgula();
        muhendis3.askerlik_Sorgula();
        muhendis3.mezuniyet_ortalama(2.95);

        String[] is_tecrube3 = {};
        muhendis3.is_tecrubesi(is_tecrube1);

        String[] referans2 = {"Mehmet Mustafa, Jhan Wayne"};
        muhendis3.referans(referans2);

    }
}
