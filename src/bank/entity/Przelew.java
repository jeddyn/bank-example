package bank.entity;

import java.time.LocalDateTime;

public class Przelew {
    private LocalDateTime dataPrzelewu;
    private KontoBankowe odKogo;
    private KontoBankowe doKogo;
    private Double kwota;

    public Przelew() {
    }

    public Przelew(LocalDateTime dataPrzelewu, KontoBankowe odKogo, KontoBankowe doKogo, Double kwota) {
        this.dataPrzelewu = dataPrzelewu;
        this.odKogo = odKogo;
        this.doKogo = doKogo;
        this.kwota = kwota;
    }

    public LocalDateTime getDataPrzelewu() {
        return dataPrzelewu;
    }

    public void setDataPrzelewu(LocalDateTime dataPrzelewu) {
        this.dataPrzelewu = dataPrzelewu;
    }

    public KontoBankowe getOdKogo() {
        return odKogo;
    }

    public void setOdKogo(KontoBankowe odKogo) {
        this.odKogo = odKogo;
    }

    public KontoBankowe getDoKogo() {
        return doKogo;
    }

    public void setDoKogo(KontoBankowe doKogo) {
        this.doKogo = doKogo;
    }

    public Double getKwota() {
        return kwota;
    }

    public void setKwota(Double kwota) {
        this.kwota = kwota;
    }

    @Override
    public String toString() {
        return "Przelew{" +
                "dataPrzelewu=" + dataPrzelewu +
                ", odKogo=" + odKogo +
                ", doKogo=" + doKogo +
                ", kwota=" + kwota +
                '}';
    }
}
