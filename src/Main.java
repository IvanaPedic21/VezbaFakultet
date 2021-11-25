import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Osoba> nizOsoba = ucitajOsobe();
        stampajOsobe(nizOsoba);

    }

    public static ArrayList<Osoba> ucitajOsobe() {
        ArrayList<Osoba> nizOsoba = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        while (true) {
            stampaj("Unesi studenta (S), Profesora (P), Asistenta (A) ili 'stop' za prekid ");
            String komanda = scanner.next();
            if (komanda.equals("stop")) break;
            switch (komanda) {
                case "S":
                    stampaj("Unesi ime");
                    String ime = scanner.next();
                    stampaj("Unesi prezime");
                    String prezime = scanner.next();
                    stampaj("Unesi broj indexa");
                    String brojIndexa = scanner.next();
                    stampaj("Unesi godina studija");
                    int godinaStudija = scanner.nextInt();
                    stampaj("Unesi da Li Je Na Buzetu");
                    boolean budzet = scanner.nextBoolean();
                    Student student = new Student(ime, prezime, brojIndexa, godinaStudija, budzet);
                    nizOsoba.add(student);
                    break;
                case "P":
                    stampaj("Unesi ime");
                    ime = scanner.next();
                    stampaj("Unesi prezime");
                    prezime = scanner.next();
                    stampaj("Unesi predmet");
                    String predmet = scanner.next();
                    stampaj("Unesi da li je redovan");
                    boolean redovan = scanner.nextBoolean();
                    Profesor profesor = new Profesor(ime, prezime, predmet, true);
                    nizOsoba.add(profesor);
                    break;
                case "A":
                    stampaj("Unesi ime");
                    ime = scanner.next();
                    stampaj("Unesi prezime");
                    prezime = scanner.next();
                    stampaj("Unesi predmet");
                    predmet = scanner.next();
                    stampaj("Unesi broj casova");
                    int brCasova = scanner.nextInt();
                    Asistent asistent = new Asistent(ime, prezime, predmet, false,5);
                    nizOsoba.add(asistent);
                    break;
                case "stop":  break;
                default: stampaj("Nije dobra komanda");
            }
        }
        return nizOsoba;
        }

    public static void stampaj(String s) {
        System.out.println(s);
    }

    public static void stampajOsobe(ArrayList<Osoba> niz) {
        for (Osoba osoba : niz) {
            osoba.stampaj();
        }
    }
}





