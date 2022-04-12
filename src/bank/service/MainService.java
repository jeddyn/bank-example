package bank.service;

import bank.entity.Uzytkownik;
import bank.repository.MainRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainService {
    private MainRepository repository;

    public MainService() {
        this.repository = new MainRepository();
    }

    public List<Uzytkownik> pobierzUnikalnychUzytkownikow(){
        List<Uzytkownik> wszyscyUzytkownicy = repository.pobierzWszystkichUzytkownikow();
        List<Uzytkownik> wynik = new ArrayList<>();

        for (int i = 0; i < wszyscyUzytkownicy.size(); i++) {
            if(!sprawdzCzyIstnieje(wynik, wszyscyUzytkownicy.get(i))){
                wynik.add(wszyscyUzytkownicy.get(i));
            }
        }

        return wynik;
    }

    private boolean sprawdzCzyIstnieje(List<Uzytkownik> wynik, Uzytkownik uzytkownik) {
        for (int i = 0; i < wynik.size(); i++) {
            Uzytkownik aktualnieIterowanyUzytkownik = wynik.get(i);
            if(aktualnieIterowanyUzytkownik.getImie().equalsIgnoreCase(uzytkownik.getImie())
            && aktualnieIterowanyUzytkownik.getNazwisko().equalsIgnoreCase(uzytkownik.getNazwisko())){
                return true;
            }
        }
        return false;
    }

}
