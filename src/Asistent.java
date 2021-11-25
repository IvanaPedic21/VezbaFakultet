public class Asistent extends Profesor {
    private int fondCasova;

    public int getFondCasova() {
        return fondCasova;
    }

    public void setFondCasova(int fondCasova) {
        this.fondCasova = fondCasova;
    }

    public Asistent(String ime, String prezime, String predmet, boolean redovan, int fondCasova) {
        super(ime, prezime, predmet, redovan);
        this.fondCasova = fondCasova;
    }
    public void stampaj(){
        super.stampaj();
        Main.stampaj("Fond casova" + getFondCasova());
    }
}
