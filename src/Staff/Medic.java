package Staff;

public class Medic extends  Membru_Staff {
    String specializare;

    public Medic(String nume, int varsta, int salariu, double vechime, String specializare) {
        super(nume, varsta, salariu, vechime);
        this.specializare = specializare;
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }
    @Override
    public String toString() {
        return getNume() + " " + getSpecializare();
    }

}
