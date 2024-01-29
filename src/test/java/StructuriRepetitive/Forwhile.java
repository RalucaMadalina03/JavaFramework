package StructuriRepetitive;

import org.testng.annotations.Test;


public class Forwhile {
    // Structuri repetitive = for, while, for each
    // for fratele mai mare ( de la cat pornesti , pana la cat ajungi si cu cat cresti )
    // while fratele mai mic cu un nr finit de pasi
    //break opresste cand conditia e indeplinita

    @Test

    public void metoda_test() {
        afisare_nr_for();
        afisare_nr_while();
        afisare_nume();
        suma_numere();
        nr_divizibil();
    }

    // Afisam primele 10 numere .

    public void afisare_nr_for() {
        for (Integer index=0; index<50;index++){
            System.out.println(index);
        }
    }



    public void afisare_nr_while(){
        Integer index=0;
        while (index<50){
            System.out.println(index);
            index++;
        }
    }



    // Afisam numele nostru de 5 ori.
    public void afisare_nume(){
        for(Integer index=0;index<5;index++){
            System.out.println("Madalina");
        }
    }



    // calculam suma primelor 10 numere
    public void suma_numere(){
        Integer index=0;
        Integer suma_numere=index;
        while(index<10){
            suma_numere=suma_numere+index;
            index++;
        }
        System.out.println("suma numerelor este:" +suma_numere);
    }



    // afisam primele 3 nr divizibile cu 5 (cat=1, rest=0)

    public void nr_divizibil(){
        Integer a=0;
        for(Integer index=0;index<21;index++){
            if(index%5==0 && a<3){
                a++;
                System.out.println(index);
            }
         //   if (a==3){
          //      break;
            // }
        }
    }

}