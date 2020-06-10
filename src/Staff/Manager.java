package Staff;

public class Manager extends Membru_Staff{
    double buget_transferuri;
    int nr_transferuri_valabile;

    public Manager(String nume, int varsta, int salariu, double vechime, double buget_transferuri, int nr_transferuri_valabile) {
        super(nume, varsta, salariu, vechime);
        this.buget_transferuri = buget_transferuri;
        this.nr_transferuri_valabile = nr_transferuri_valabile;
    }

    public double getBuget_transferuri() {
        return buget_transferuri;
    }

    public void setBuget_transferuri(double buget_transferuri) {
        this.buget_transferuri = buget_transferuri;
    }

    public int getNr_transferuri_valabile() {
        return nr_transferuri_valabile;
    }

    public void setNr_transferuri_valabile(int nr_transferuri_valabile) {
        this.nr_transferuri_valabile = nr_transferuri_valabile;
    }

    @Override
    public String toString() {
        return getNume() + " " + getVechime();
    }
}
