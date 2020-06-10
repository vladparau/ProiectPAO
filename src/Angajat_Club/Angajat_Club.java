package Angajat_Club;

public class Angajat_Club {
    private String nume;
    private int varsta;
    private int salariu;
    public Angajat_Club(){}
    public Angajat_Club(String nume, int varsta, int salariu) {
        this.nume = nume;
        this.varsta = varsta;
        this.salariu = salariu;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public long getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "Angajat_Club{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", salariu=" + salariu +
                '}';
    }
}
