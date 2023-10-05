import ExerciseN1.Dipendente.Dipendente;
import ExerciseN1.Enum.Dipartimento;
import ExerciseN1.Enum.Livello;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Dipendente Jonny = new Dipendente(1500,378569493545L,1500,20, new Livello[]{Livello.IMPIEGATO},
            new Dipartimento[]{Dipartimento.PRODUZIONE});

        Jonny.stampaDatiDipendente();
        Jonny.promuovi();
        System.out.println("Lo stipendio di Jonny è : " + Jonny.calcolaPaga());
        System.out.println("Lo stipendio di Jonny comprensivo di ore di straordinario è :" + Jonny.calcolaPaga1(2));
    }
}
