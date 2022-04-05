package bank.entity;

import java.util.ArrayList;
import java.util.List;

public class KontoBankowe {
    private Status status;
    private Double balans;
    private List<Przelew> historiaPrzelewow;
    private Uzytkownik wlasciciel;
    private List<Kredyt> kredyty;

    public KontoBankowe() {
        historiaPrzelewow = new ArrayList<>();
        kredyty = new ArrayList<>();
    }

    public KontoBankowe(Status status, Double balans, Uzytkownik wlasciciel) {
        this.status = status;
        this.balans = balans;
        this.wlasciciel = wlasciciel;
        historiaPrzelewow = new ArrayList<>();
        kredyty = new ArrayList<>();
    }

    public void dodajKredyt(Kredyt kredyt){
        kredyty.add(kredyt);
    }

    public void usunKredyt(Kredyt kredyt){
        kredyty.remove(kredyt);
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Double getBalans() {
        return balans;
    }

    public void setBalans(Double balans) {
        this.balans = balans;
    }

    public List<Przelew> getHistoriaPrzelewow() {
        return historiaPrzelewow;
    }

    public void setHistoriaPrzelewow(List<Przelew> historiaPrzelewow) {
        this.historiaPrzelewow = historiaPrzelewow;
    }

    public Uzytkownik getWlasciciel() {
        return wlasciciel;
    }

    public void setWlasciciel(Uzytkownik wlasciciel) {
        this.wlasciciel = wlasciciel;
    }

    @Override
    public String toString() {
        return "KontoBankowe{" +
                "status=" + status +
                ", balans=" + balans +
                ", historiaPrzelewow=" + historiaPrzelewow +
                ", wlasciciel=" + wlasciciel +
                '}';
    }
}
