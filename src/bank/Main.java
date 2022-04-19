package bank;

import bank.entity.Uzytkownik;
import bank.service.MainService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MainService service = new MainService();

        System.out.println("Witaj w aplikacji banku");
        System.out.println("Wybierz, którym użytkownikiem jesteś: ");

        List<Uzytkownik> uzytkownicy = service.pobierzUnikalnychUzytkownikow();
        for (int i = 0; i < uzytkownicy.size(); i++) {
            System.out.println(uzytkownicy.get(i));

        }


    }

}
