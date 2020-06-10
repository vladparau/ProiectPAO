package Giocatore;

import Angajat_Club.Angajat_Club;

public class Jucator extends Angajat_Club {
    private int rating;
    private String pozitie;
    public Jucator(){}

    public Jucator(String nume, int varsta, int salariu, int rating, String pozitie) {
        super(nume, varsta, salariu);
        this.rating = rating;
        this.pozitie = pozitie;

    }

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getPozitie() {
        return pozitie;
    }

    public void setPozitie(String pozitie) {
        this.pozitie = pozitie;
    }

    @Override
    public String toString() {
        return "Jucator{" +
                "rating=" + rating +
                ", pozitie='" + pozitie + '\'' +
                '}';
    }
}
