package Giocatore;

public class Jucator_Rezerva extends Jucator{
    int prioritate_rezerva;

    public Jucator_Rezerva(String nume, int varsta, int salariu, int rating, String pozitie, int prioritate_rezerva) {
        super(nume, varsta, salariu, rating, pozitie);
        this.prioritate_rezerva = prioritate_rezerva;
    }

    @Override
    public String toString() {
        return getNume() + " " + getRating() + " " + getPozitie() + " ";
    }

    public int getPrioritate_rezerva() {
        return prioritate_rezerva;
    }

    public void setPrioritate_rezerva(int prioritate_rezerva) {
        this.prioritate_rezerva = prioritate_rezerva;
    }
}
