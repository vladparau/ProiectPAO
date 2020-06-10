package Staff;

import Angajat_Club.Angajat_Club;

public class Membru_Staff extends Angajat_Club {
    double vechime;

    public Membru_Staff(String nume, int varsta, int salariu, double vechime) {
        super(nume, varsta, salariu);
        this.vechime = vechime;
    }

    public double getVechime() {
        return vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }
}
