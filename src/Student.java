public class Student extends Osoba{
    private String brIndexa;
    private int godinaStudija;
    private boolean daLiJeNaBudzetu;

    public String getBrIndexa() {
        return brIndexa;
    }
    public void setBrIndexa(String brIndexa) {
        this.brIndexa = brIndexa;
    }
    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public boolean isDaLiJeNaBudzetu() {
        return daLiJeNaBudzetu;
    }

    public void setDaLiJeNaBudzetu(boolean daLiJeNaBudzetu) {
        this.daLiJeNaBudzetu = daLiJeNaBudzetu;
    }

    public Student(String ime, String prezime, String brIndexa, int godinaStudija, boolean daLiJeNaBudzetu) {
        super(ime,prezime);
        this.brIndexa = brIndexa;
        this.godinaStudija = godinaStudija;
        this.daLiJeNaBudzetu = daLiJeNaBudzetu;
    }
    public void stampaj(){
       super.stampaj();
       Main.stampaj("brIndex:" + getBrIndexa() + " , godina " + getGodinaStudija()+" , na budzetu = " + isDaLiJeNaBudzetu());
       Main.stampaj("");


    }

}
