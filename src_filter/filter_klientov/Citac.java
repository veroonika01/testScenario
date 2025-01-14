package filter_klientov;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Citac
{

    public static void main(String[] args) {

        System.out.println("Zadal si " + args.length + "argumentov");
        for (String argument : args) {
            System.out.println(argument);
        }

        FileReader citac = null;

        try {
            citac = new FileReader(args [0]);
        } catch (FileNotFoundException e) {
            System.out.println("Chybný súbor!");
            System.exit(0);
        }
        DatabazaKlientov databaza = new DatabazaKlientov();  // mimo cyklu inak sa mi bude vytvarat stale nova db s jednym riadkom instanciou
        Scanner vstup = new Scanner(citac);


        while (vstup.hasNextLine()) {
            String riadok = vstup.nextLine();

            // sparovanie csv hodnot do pola
            String[] udajeKlienta = riadok.split(",");

            // o kazdom zakaznikovi je potrebné uchovávat nasledovny typ udajov:
            // vypisat prehladne na konzolu vsetky udaje o novovytvorenom klientovi
//            System.out.println("Meno klienta je " + udajeKlienta[0]);
//            System.out.println("telefonický kontakt " + udajeKlienta[1]);
//            System.out.println("má aktivovanú hlasovú službu " + udajeKlienta[2]);
//            System.out.println("má aktivovanú aj internetovú službu " + udajeKlienta[3]);
//            System.out.println("S platbou na " + udajeKlienta[4]);
//            System.out.println("Aktuálny stav na zákazníckom účte " + udajeKlienta[5] + " Eur" + "\n\n");

            Klienti klient = new Klienti(udajeKlienta[0], udajeKlienta[1], udajeKlienta[2].equals("hlas"), udajeKlienta[3].equals("internet"),
                    Double.valueOf(udajeKlienta[5]), udajeKlienta[4].equals("pausal") ? Platba.PAUSAL : Platba.KREDIT);

            // takto vytvorených zákaznikov potrebujem uložiť do databazy

            databaza.pridajKlientaDoDB(klient);
        }
        vstup.close();
        try {
            citac.close();

        } catch (IOException e) {
            System.out.println("Subor zakaznici.txt sa nepodarilo zavrieť.");
        }

        if (args[1].equals("h")) {
            databaza.vypisKlientovHlasovejSluzby();
        }
        //i - vyfiltruje zákazníkov so službou internet
        else if (args[1].equals("i")) {
            databaza.vypisKlientovSoSluzbouInternet();
        }
        //f - vyfiltruje zákazníkov pre fakturáciu (len klienti so záporným stavom účtu)
        else if (args[1].equals("f")) {
            databaza.vypisKlientovSMinusZostatkom();
        }
        // m - vyfiltruje zákazníkov, na ktorých máme mobilný kontakt (mobilné telefónne číslo musí začínať 09)
        else if (args[1].equals("m")) {
            databaza.vypisKlientovSMB();
        } else {
            System.out.println("Nesprávne zadaný filter, svoju požiadavku zadajte opat prosím");

        }
        System.out.println("\n"+ "---------Koniec programu--------------");
    }

        }





