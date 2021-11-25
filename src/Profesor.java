public class Profesor extends Osoba {
    private String predmet;
    private boolean redovan;


    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public boolean isRedovan() {
        return redovan;
    }

    public void setRedovan(boolean redovan) {
        this.redovan = redovan;
    }

    public Profesor(String ime, String prezime, String predmet, boolean redovan) {
        super(ime, prezime);
        this.predmet = predmet;
        this.redovan = redovan;
    }
    public void stampaj(){
        super.stampaj();
        Main.stampaj("Predmet : " + getPredmet() + " , redovan = " + isRedovan());
        Main.stampaj("");

    }
}
