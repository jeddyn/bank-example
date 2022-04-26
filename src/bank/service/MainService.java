package bank.service;

import bank.entity.KontoBankowe;
import bank.entity.Uzytkownik;
import bank.repository.MainRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainService {
    private MainRepository repository; // TODO zrobić final

    public MainService() {
        this.repository = new MainRepository();
    }

    public List<Uzytkownik> pobierzUnikalnychUzytkownikow(){
        List<Uzytkownik> wszyscyUzytkownicy = repository.pobierzWszystkichUzytkownikow();
        List<Uzytkownik> wynik = new ArrayList<>();

        for (Uzytkownik uzytkownik : wszyscyUzytkownicy) {
            if (!sprawdzCzyIstnieje(wynik, uzytkownik)) {
                wynik.add(uzytkownik);
            }
        }

        return wynik;
    }

    private boolean sprawdzCzyIstnieje(List<Uzytkownik> wynik, Uzytkownik uzytkownik) {
        for (Uzytkownik aktualnieIterowanyUzytkownik : wynik) {
            if (czyTenSamWlasciciel(uzytkownik, aktualnieIterowanyUzytkownik)) {
                return true;
            }
        }
        return false;
    }

    public void generujDane(){
        repository.generujDane();
    }

    public void wyswietlStanKonta(Uzytkownik wlasciciel) {
        List<KontoBankowe> kontaBankowe = repository.pobierzWszystkieKonta();
        List<KontoBankowe> wynik = new ArrayList<>();
        for (KontoBankowe kontoBankowe : kontaBankowe) {
            if (czyTenSamWlasciciel(wlasciciel, kontoBankowe.getWlasciciel())) {
                wynik.add(kontoBankowe);
            }
        }

        if(wynik.size() == 1){
            System.out.println("Twój stan konta to: " + wynik.get(0).getBalans() + " zł");
        } else {
            System.out.println("Wybierz numer konta z którego wyświetlić saldo: ");
            for (int i = 0; i < wynik.size(); i++) {
                System.out.println((i+1) + ". " + wynik.get(i));
            }
            int wybor = new Scanner(System.in).nextInt();
            System.out.println("Twój stan konta to: " + wynik.get((wybor-1)).getBalans() + " zł");
        }
    }

    private boolean czyTenSamWlasciciel(Uzytkownik wlasciciel, Uzytkownik wlasciciel2) {
        return wlasciciel2.getImie().equalsIgnoreCase(wlasciciel.getImie()) &&
                wlasciciel2.getNazwisko().equalsIgnoreCase(wlasciciel.getNazwisko());
    }
}
