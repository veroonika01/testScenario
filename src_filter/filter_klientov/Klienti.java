package filter_klientov;

public class Klienti
{
    private String menoKlienta;
    private String telefonKontakt;
    private boolean sluzbaHlas;
    private boolean sluzbaInternet;
    private double stavUctu;
    private Platba platba;


    // getter metoda na vyuzitie instancnych premennych na namapovanie s CSV suborom
    public String getMenoKlienta() {
        return menoKlienta;
    }

    public String getTelefonKontakt() {
        return telefonKontakt;
    }

    public boolean isSluzbaHlas() {
        return sluzbaHlas;
    }

    public boolean isSluzbaInternet() {
        return sluzbaInternet;
    }

    public double getStavUctu() {
        return stavUctu;
    }

    @Override
    public String toString() {
        return "Klienti{" +
                "menoKlienta='" + menoKlienta + '\'' +
                ", stavUctu=" + stavUctu +
                ", platba=" + platba +
                '}';
    }

    public Klienti(String menoKlienta, String telefonKontakt, boolean sluzbaHlas, boolean sluzbaInternet, double stavUctu, Platba platba) {
        this.menoKlienta = menoKlienta;
        this.telefonKontakt = telefonKontakt;
        this.sluzbaHlas = sluzbaHlas;
        this.sluzbaInternet = sluzbaInternet;
        this.stavUctu = stavUctu;
        this.platba = platba;

    }
}
