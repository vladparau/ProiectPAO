package Giocatore;

public class Jucator_Titular extends Jucator {

    private boolean isCaptain;
    private int bonus_victorie;
    private int bonus_gol;
    private int bonus_cleansheet;


    public Jucator_Titular(String nume, int varsta, int salariu, int rating, String pozitie, boolean isCaptain, int bonus_victorie, int bonus_gol, int bonus_cleansheet) {
        super(nume, varsta, salariu, rating, pozitie);
        this.isCaptain = isCaptain;
        this.bonus_victorie = bonus_victorie;
        this.bonus_gol = bonus_gol;
        this.bonus_cleansheet = bonus_cleansheet;
    }

    public boolean isCaptain() {
        return isCaptain;
    }

    public void setCaptain(boolean captain) {
        isCaptain = captain;
    }

    public int getBonus_victorie() {
        return bonus_victorie;
    }

    public void setBonus_victorie(int bonus_victorie) {
        this.bonus_victorie = bonus_victorie;
    }

    public int getBonus_gol() {
        return bonus_gol;
    }

    public void setBonus_gol(int bonus_gol) {
        this.bonus_gol = bonus_gol;
    }

    public int getBonus_cleansheet() {
        return bonus_cleansheet;
    }

    public void setBonus_cleansheet(int bonus_cleansheet) {
        this.bonus_cleansheet = bonus_cleansheet;
    }

    @Override
    public String toString() {
        return getNume() + " " + getRating() + " " + getPozitie() + " ";
    }
}
