package bank.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Rata {
    private double kwota;
    private LocalDateTime dataWplaty;
    private LocalDate miesiacSplacanejRaty;

    public Rata() {
    }

    public Rata(double kwota, LocalDateTime dataWplaty, LocalDate miesiacSplacanejRaty) {
        this.kwota = kwota;
        this.dataWplaty = dataWplaty;
        this.miesiacSplacanejRaty = miesiacSplacanejRaty;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public LocalDateTime getDataWplaty() {
        return dataWplaty;
    }

    public void setDataWplaty(LocalDateTime dataWplaty) {
        this.dataWplaty = dataWplaty;
    }

    public LocalDate getMiesiacSplacanejRaty() {
        return miesiacSplacanejRaty;
    }

    public void setMiesiacSplacanejRaty(LocalDate miesiacSplacanejRaty) {
        this.miesiacSplacanejRaty = miesiacSplacanejRaty;
    }

    @Override
    public String toString() {
        return "Rata{" +
                "kwota=" + kwota +
                ", dataWplaty=" + dataWplaty +
                ", miesiacSplacanejRaty=" + miesiacSplacanejRaty +
                '}';
    }
}

