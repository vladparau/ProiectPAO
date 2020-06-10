package Staff;

public class Antrenor_principal extends Membru_Staff {
    String tip_licenta;
    boolean wants_new_players;

    public Antrenor_principal(String nume, int varsta, int salariu, double vechime, String tip_licenta, boolean wants_new_players) {
        super(nume, varsta, salariu, vechime);
        this.tip_licenta = tip_licenta;
        this.wants_new_players = wants_new_players;
    }

    public String getTip_licenta() {
        return tip_licenta;
    }

    public void setTip_licenta(String tip_licenta) {
        this.tip_licenta = tip_licenta;
    }

    public boolean isWants_new_players() {
        return wants_new_players;
    }

    public void setWants_new_players(boolean wants_new_players) {
        this.wants_new_players = wants_new_players;
    }
}
