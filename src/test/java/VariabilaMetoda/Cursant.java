package VariabilaMetoda;

import org.testng.annotations.Test;

public class Cursant{
    // Primul curs
    //Clasa=Cu sablon specific unui obiect care contine vriabile si metode
    //Identificam o clasa dupa cuvantul class
    //O clasa trebuie sa aiba un nune
    //Continutul unei clase se regaseste intre acolade
    //Intr-un fisier Java putem avea mai multe clase
    //Variabila = Prioprietate a unei clase
    //Variabilele sunt de doua feluri: global si local
    //Variabila globala= este vizibila peste tot in clasa
    //Variabila locala= este vizibila doar in locul declarat
    //Variabila globala=public tip de data nume variabila (public string adresa)
    //Variabila poate sau nu sa primeasca o valoare
    //Metoda=Actiunea unei clase
    //Metodele sunt de 2 feluri: void si return
    //Void=Metoda care executa si arata actiunea
    //Return=Metoda care returneaza  actiunea
    public String nume;
    public String prenume;
    public Integer varsta;
    public String adresa;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areStudii;

   @Test

    public void metodatest(){
       afisareDate();
       //mai exact de aici, si in prima instanta ii trimiti 9.25 si 6.50
       calculmedie("semestrul 1",9.25,6.50);
       calculmedie("semestrul 2",8.00,7.50);
       calculpret(10);
       calculpret(50);
    }


    public void afisareDate() {
    nume = "Petreus";
    prenume = "Raluca";
    varsta = 27;
    adresa = "Arad nr.96  ";
    inaltime = 1.69;
    greutate = 60.0f; //o vede ca si  double dar daca ii pui un f il recunoaste float; float trip
    sex = 'F';
    areStudii = true;

    System.out.println ("Numele cursantului este" +nume+" "+prenume);//printeaza pe linia urmatoare.
    System.out.println("Varsta cursantului este "+varsta);
    System.out.println("Adresa cursantului este "+adresa);
    System.out.println("Inaltime cursantului este "+inaltime);
    System.out.println("Greutate cursantului este "+greutate);
    System.out.println("Sexul cursantului este "+sex);
    System.out.println("Are cursantul studii? "+areStudii);

}

    public void calculmedie (String tipnote,Double nota1,Double nota2){
       //Aproape mi-am pierdut cunostinta cand am vazut asa cv
        // na tu chemi functia asta de undeva
        //pai astea de jos ce mai sunt?????
        //na clasa asta e completa, in sensul ca nu mai ai erori, mai avem 1
       Double rezultat=(nota1+nota2)/2;
    System.out.println("Media examenelor la"+tipnote+" este "+rezultat);
    System.out.println("Media semestrelor la"+tipnote+" este "+rezultat);

    }

    public void  calculpret (Integer reducere){
       Integer pret=1000;
       System.out.println("Pretul initial al cursului este" +pret);
       Integer diferentapret=(pret*reducere)/100;
       Integer pretfinal=(pret-diferentapret);
       System.out.println("Pretul final al cursului dupa aplicarea reducerii este "+pretfinal);

    }
}
