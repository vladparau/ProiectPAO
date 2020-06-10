package Staff;

public class Antrenor_secund extends Membru_Staff{
    boolean has_license;

    public boolean isHas_license() {
        return has_license;
    }

    public void setHas_license(boolean has_license) {
        this.has_license = has_license;
    }

    public Antrenor_secund(String nume, int varsta, int salariu, double vechime, boolean has_license) {
        super(nume, varsta, salariu, vechime);
        this.has_license = has_license;

    }
}
