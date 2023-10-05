package ExerciseN1.ExerciseN2;

import ExerciseN1.Dipendente.Dipendente;
import ExerciseN1.Enum.Livello;

public class GestioneDipendenti {


public GestioneDipendenti(){

}
private static boolean soloUnOperaio = false;
    public static void promuoviOperaioImpiegato(Dipendente[] dipendentes){
        for (Dipendente dipendente : dipendentes) {
            Livello l = dipendente.getLivello();
            if (l == Livello.OPERAIO) {
                if(soloUnOperaio==false){
                    dipendente.promuovi();
                    System.out.println("Complimenti Operaio " + dipendente.getMatricola() + "! Sei stato promosso a " +  dipendente.getLivello());
                    soloUnOperaio=true;
                }

            } else if (l == Livello.IMPIEGATO) {
                dipendente.promuovi();
                System.out.println("Comlimenti Impiegato " + dipendente.getMatricola() + "! Sei stato promosso a " + dipendente.getLivello());
            }
        }
    }



    public static void stampaStatoDipendenti(Dipendente[] dipendentes) {
        for (Dipendente dipendente : dipendentes) {
            Livello l = dipendente.getLivello();
            System.out.println(l);

        }
    }


    public static void stampaStipendioTuttiDipendenti(Dipendente[] dipendentes) {
        double totaleStipendi = 0.0;
        int totaleOreOperaio=0;
        int totaleOreImpiegato=0;
        int totaleOreQuadro=0;
        int totaleOreDirigente=0;
        double extraOperaio =0;
        double extraImpiegato=0;
        double extraQuadro=0;
        double extraDirigente=0;
        for (Dipendente dipendente : dipendentes) {
            totaleStipendi += dipendente.getStipendio();
            Livello l = dipendente.getLivello();
            if (l == Livello.OPERAIO) {
             totaleOreOperaio+=5;
             extraOperaio=dipendente.getImportoOrarioStraordinario();
            } else if (l == Livello.IMPIEGATO) {
                totaleOreImpiegato+=5;
                extraImpiegato=dipendente.getImportoOrarioStraordinario();
            }
            else if (l == Livello.QUADRO) {
                totaleOreQuadro+=5;
                extraQuadro=dipendente.getImportoOrarioStraordinario();
            }
            else if (l == Livello.DIRIGENTE) {
                totaleOreDirigente += 5;
                extraDirigente=dipendente.getImportoOrarioStraordinario();
            }
        }
        String formattedOutput = String.format("La somma totale degli stipendi più 5 ore di straordinario ciascuno, " +
                "pagate secondo la tariffa personale è : %.2f%n",
            totaleStipendi + (totaleOreOperaio * extraOperaio) + (totaleOreImpiegato * extraImpiegato) + (totaleOreQuadro * extraQuadro) + (totaleOreDirigente * extraDirigente));
        System.out.println(formattedOutput);

    }
    }






