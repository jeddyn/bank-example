package bank.entity;

public class Adres {
    private String ulica;
    private String numerDomu;
    private String kodPocztowy;
    private String miasto;

    public Adres() {
    }

    public Adres(String ulica, String numerDomu, String kodPocztowy, String miasto) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(String numerDomu) {
        this.numerDomu = numerDomu;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "ulica='" + ulica + '\'' +
                ", numerDomu='" + numerDomu + '\'' +
                ", kodPocztowy='" + kodPocztowy + '\'' +
                ", miasto='" + miasto + '\'' +
                '}';
    }
}
