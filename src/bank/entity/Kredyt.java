package bank.entity;

import java.time.LocalDate;
import java.util.List;

public class Kredyt {
    private KontoBankowe kontoBankowe;
    private List<Rata> splaconeRaty;
    private Double sumaSplaconychRat;
    private Double kwotaPobranegoKredytu;
    private LocalDate terminSplatyKredytu;

    public Kredyt() {
    }

    public Kredyt(KontoBankowe kontoBankowe, List<Rata> splaconeRaty, Double sumaSplaconychRat, Double kwotaPobranegoKredytu, LocalDate terminSplatyKredytu) {
        this.kontoBankowe = kontoBankowe;
        this.splaconeRaty = splaconeRaty;
        this.sumaSplaconychRat = sumaSplaconychRat;
        this.kwotaPobranegoKredytu = kwotaPobranegoKredytu;
        this.terminSplatyKredytu = terminSplatyKredytu;
    }

    public KontoBankowe getKontoBankowe() {
        return kontoBankowe;
    }

    public void setKontoBankowe(KontoBankowe kontoBankowe) {
        this.kontoBankowe = kontoBankowe;
    }

    public List<Rata> getSplaconeRaty() {
        return splaconeRaty;
    }

    public void setSplaconeRaty(List<Rata> splaconeRaty) {
        this.splaconeRaty = splaconeRaty;
    }

    public Double getSumaSplaconychRat() {
        return sumaSplaconychRat;
    }

    public void setSumaSplaconychRat(Double sumaSplaconychRat) {
        this.sumaSplaconychRat = sumaSplaconychRat;
    }

    public Double getKwotaPobranegoKredytu() {
        return kwotaPobranegoKredytu;
    }

    public void setKwotaPobranegoKredytu(Double kwotaPobranegoKredytu) {
        this.kwotaPobranegoKredytu = kwotaPobranegoKredytu;
    }

    public LocalDate getTerminSplatyKredytu() {
        return terminSplatyKredytu;
    }

    public void setTerminSplatyKredytu(LocalDate terminSplatyKredytu) {
        this.terminSplatyKredytu = terminSplatyKredytu;
    }

    @Override
    public String toString() {
        return "Kredyt{" +
                "kontoBankowe=" + kontoBankowe +
                ", splaconeRaty=" + splaconeRaty +
                ", sumaSplaconychRat=" + sumaSplaconychRat +
                ", kwotaPobranegoKredytu=" + kwotaPobranegoKredytu +
                ", terminSplatyKredytu=" + terminSplatyKredytu +
                '}';
    }
}
