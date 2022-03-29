package bank.entity;

import java.util.List;

public class KontoBankowe {
    private Status status;
    private Double balans;
    private List<Przelew> historiaPrzelewow;
    private Uzytkownik wlasciciel;

    public KontoBankowe() {
    }

    public KontoBankowe(Status status, Double balans, List<Przelew> historiaPrzelewow, Uzytkownik wlasciciel) {
        this.status = status;
        this.balans = balans;
        this.historiaPrzelewow = historiaPrzelewow;
        this.wlasciciel = wlasciciel;
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
