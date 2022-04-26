package bank;

import bank.entity.Uzytkownik;
import bank.service.MainService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MainService service = new MainService();
        service.generujDane();
        Scanner scanner = new Scanner(System.in);

        Uzytkownik zalogowany = null;

        System.out.println("Witaj w aplikacji banku");
        System.out.println("Wybierz, którym użytkownikiem jesteś: ");

        List<Uzytkownik> uzytkownicy = service.pobierzUnikalnychUzytkownikow();
        for (int i = 0; i < uzytkownicy.size(); i++) {
            System.out.println((i + 1) + ". " + uzytkownicy.get(i));
        }

        System.out.print("Wybierz uytkownika: ");
        int wybierzUzytkownika = scanner.nextInt();
        zalogowany = uzytkownicy.get(wybierzUzytkownika - 1);

        System.out.println("Wybrałeś uzytkownika: " + zalogowany);

        boolean czyAktywna = true;

        while (czyAktywna) {
            wyswietlMenu();
            int opcja = scanner.nextInt();
            switch (opcja) {
                case 1: // Wyswietl stan konta (jezeli więcej kont bankowych to wybierz, który balans wyświetlić)
                    service.wyswietlStanKonta(zalogowany);
                    break;
                case 2:
                    System.out.println("Właściciel konta: " + zalogowany.getImie() + " " + zalogowany.getNazwisko());
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    czyAktywna = false;
                    System.out.println("Dziękujemy za wizytę!");
                    break;
            }
        }

    }


    public static void wyswietlMenu() {
        System.out.println("Wybierz opcję");
        System.out.println("1. Wyświetl stan konta");
        System.out.println("2. Wyświetl dane właściciela");
        System.out.println("3. Wykonaj przelew");
        System.out.println("4. Weź kredyt");
        System.out.println("5. Spłać ratę");
        System.out.println("6. Zakończ aplikację");
    }


}
