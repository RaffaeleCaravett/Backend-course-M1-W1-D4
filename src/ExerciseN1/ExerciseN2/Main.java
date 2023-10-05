package ExerciseN1.ExerciseN2;

import ExerciseN1.Dipendente.Dipendente;
import ExerciseN1.Enum.Dipartimento;
import ExerciseN1.Enum.Livello;

public class Main {
    public static void main(String[] args) {
        Dipendente Hello = new Dipendente(1500,378569493546L,1500,20, new Livello[]{Livello.OPERAIO},
            new Dipartimento[]{Dipartimento.PRODUZIONE});
        Dipendente Kitty = new Dipendente(1500,378569493547L,1500,40, new Livello[]{Livello.OPERAIO},
            new Dipartimento[]{Dipartimento.PRODUZIONE});
        Dipendente Gengis = new Dipendente(1500,378569493548L,1500,100, new Livello[]{Livello.IMPIEGATO},
            new Dipartimento[]{Dipartimento.AMMINISTRAZIONE});
        Dipendente Kahn = new Dipendente(1500,378569493549L,1500,120, new Livello[]{Livello.DIRIGENTE},
            new Dipartimento[]{Dipartimento.VENDITE});


        Dipendente[] dipendentes = new Dipendente[4];
        dipendentes[0] = Hello;
        dipendentes[1] = Kitty;
        dipendentes[2] = Gengis;
        dipendentes[3] = Kahn;
        //GestioneDipendenti.promuoviOperaioImpiegato(dipendentes);
       // GestioneDipendenti.stampaStatoDipendenti((dipendentes));
        GestioneDipendenti.stampaStipendioTuttiDipendenti(((dipendentes)));
    }
}
