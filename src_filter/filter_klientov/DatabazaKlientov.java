package filter_klientov;

import java.util.ArrayList;


public class DatabazaKlientov {

    // asi by mal byt private

   private  ArrayList<Klienti> databazaKlientov = new ArrayList<>();

public void pridajKlientaDoDB(Klienti klient)
    {
        databazaKlientov.add(klient);
    }

    public  void vypisKlientovHlasovejSluzby() {
        for (Klienti klient : databazaKlientov) {
            if (klient.isSluzbaHlas()) {
                System.out.println(klient);
            }
        }
        }
        public void vypisKlientovSoSluzbouInternet() {


            for (Klienti klient : databazaKlientov) {
                if (klient.isSluzbaInternet()) {
                    System.out.println(klient);
                }
            }
        }
            public void vypisKlientovSMinusZostatkom()
        {
            for (Klienti klient : databazaKlientov) {
                if (klient.getStavUctu() < 0)
                {
                    System.out.println(klient);
                }
            }
        }
            public void vypisKlientovSMB()
            {
                for (Klienti klient : databazaKlientov)
                {

                    if (klient.getTelefonKontakt().startsWith("09"))
                    {
                        System.out.println(klient);
                    }
                }

                }
            }



