package bank.service;

import bank.entity.Uzytkownik;
import bank.repository.MainRepository;

import java.util.ArrayList;
import java.util.List;

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
            if (aktualnieIterowanyUzytkownik.getImie().equalsIgnoreCase(uzytkownik.getImie())
                    && aktualnieIterowanyUzytkownik.getNazwisko().equalsIgnoreCase(uzytkownik.getNazwisko())) {
                return true;
            }
        }
        return false;
    }

    public void generujDane(){
        repository.generujDane();
    }

}
