package bank.repository;

import bank.entity.Adres;
import bank.entity.KontoBankowe;
import bank.entity.Uzytkownik;

import java.util.ArrayList;
import java.util.List;

public class MainRepository {
    private List<KontoBankowe> kontaBankowe;

    public MainRepository() {
        kontaBankowe = new ArrayList<>();
    }

    public void generujDane(){
        Adres adres1 = new Adres("Kwiatowa", "50", "10-000", "Warszawa");
        Uzytkownik wlasciciel1 = new Uzytkownik("Stefan", "Kowalski", 20, adres1);
        KontoBankowe kontoBankowe1 = new KontoBankowe(wlasciciel1);

        Adres adres2 = new Adres("Biedronki", "1", "30-020", "Biedronkowo");
        Uzytkownik wlasciciel2 = new Uzytkownik("Karol", "Biedronka", 50, adres2);
        KontoBankowe kontoBankowe2 = new KontoBankowe(wlasciciel2);

        Adres adres3 = new Adres("Programisty", "256", "10-512", "Fajno");
        Uzytkownik wlasciciel3 = new Uzytkownik("Bob", "Uncle", 65, adres3);
        KontoBankowe kontoBankowe3 = new KontoBankowe(wlasciciel3);

        kontaBankowe.add(kontoBankowe1);
        kontaBankowe.add(kontoBankowe2);
        kontaBankowe.add(kontoBankowe3);

    }

    public List<Uzytkownik> pobierzWszystkichUzytkownikow() {
        List<Uzytkownik> wynik = new ArrayList<>();
        for (KontoBankowe kontoBankowe : kontaBankowe) {
            wynik.add(kontoBankowe.getWlasciciel());
        }

        return wynik;
    }

    public List<KontoBankowe> pobierzWszystkieKonta(){
        return kontaBankowe;
    }
}
