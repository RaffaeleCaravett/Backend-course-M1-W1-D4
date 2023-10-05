package ExerciseN1.Dipendente;

import ExerciseN1.Enum.Dipartimento;
import ExerciseN1.Enum.Livello;

import static ExerciseN1.Enum.Livello.IMPIEGATO;

public class Dipendente {

    //Attributes
    private static double stipendioBase;
    private  long matricola;
    private  double stipendio;
    private  double importoOrarioStraordinario;
    private  Livello[] livello;
    private  Dipartimento[] dipartimento;



    public Dipendente(long mat,Dipartimento[] dip){
        stipendio=stipendioBase;
        importoOrarioStraordinario=30;
        livello=new Livello[] {Livello.OPERAIO};
        matricola=mat;
        dipartimento=dip;
    }
    public Dipendente(double stipendioB,long mat,double stip,double importoOS,
                      Livello[] liv, Dipartimento[] dip){
        stipendioBase=stipendioB;
        matricola=mat;
        stipendio=stip;
        importoOrarioStraordinario=importoOS;
        livello=liv;
        dipartimento=dip;
    }

    //Getters and Setters
    static public double getStipendioBase(){
        return stipendioBase;
    }

     public long getMatricola(){
        return matricola;
    }

     public double getStipendio(){
        return stipendio;
    }

     public double getImportoOrarioStraordinario(){
        return importoOrarioStraordinario;
    }

     public Livello getLivello(){
        return livello[0];
    }

     public  Dipartimento[] getDipartimento(){
        return dipartimento;
    }

     public Dipartimento[] setDipartimento (Dipartimento[] Dipartimento){
        return dipartimento = Dipartimento;
    }

     double setImportoOrarioStraordinario (double importoOrarioS){
        return importoOrarioStraordinario=importoOrarioS;
    }


    public void stampaDatiDipendente() {

            System.out.println("Stipendio Base: " + stipendioBase);
            System.out.println("Matricola: " + matricola);
            System.out.println("Stipendio: " + stipendio);
            System.out.println("Importo Orario Straordinario: " + importoOrarioStraordinario);

            System.out.println("Livello:");
            for (Livello liv : livello) {
                System.out.println("- " + liv);
            }

            System.out.println("Dipartimento:");
            for (Dipartimento dept :dipartimento) {
                System.out.println("- " + dept);
            }

    }
   private static boolean isPromuoviCalled=false;
    public void promuovi() {
        isPromuoviCalled = true;
        double stipendioBaseCopy = stipendioBase;
        switch (livello[0]){
            case OPERAIO:
                livello[0]=Livello.IMPIEGATO;
                stipendio =stipendioBase*1.2;
                break;
            case IMPIEGATO : livello[0]=Livello.QUADRO;
                stipendio =stipendioBase*1.5;
                break;
            case QUADRO :livello[0]=Livello.DIRIGENTE;
                stipendio =stipendioBase*2;
                break;
            default: livello[0]=Livello.OPERAIO;
                stipendio=stipendioBase;
        }
        System.out.println("Complimenti! Sei stato assegnato alla posizione di :" + livello[0] +"," +
            " ed il tuo stipendio è passato da " + stipendioBaseCopy + "euro, a " + stipendio
            +" euro");
    }
    public  double calcolaPaga(){
        switch (livello[0]){
            case OPERAIO:livello[0]= IMPIEGATO;
                stipendio =isPromuoviCalled==true?stipendio:stipendioBase*1.2;
                break;
            case IMPIEGATO : livello[0]=Livello.QUADRO;
                stipendio =isPromuoviCalled==true?stipendio:stipendioBase*1.5;
                break;
            case QUADRO :livello[0]=Livello.DIRIGENTE;
                stipendio =isPromuoviCalled==true?stipendio:stipendioBase*2;
                break;
            default: livello[0]=Livello.OPERAIO;
            stipendio=stipendioBase;
        }
        return stipendio;
    }

    public  double calcolaPaga1(double oreDiStraordinario){
        return stipendio + (oreDiStraordinario*importoOrarioStraordinario);
    }


}
