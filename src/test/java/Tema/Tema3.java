package Tema;

import org.testng.annotations.Test;

public class Tema3 {

//    Clasa noua creeate
//    Rezolvam urmatoarele:
//            -Citim 3 numere cu valori diferite.Daca suma primelor 2 numere este mai mare decat al 3 lea numar afisam un mesaj corespunzator +valoarea sumei, altfel afisam contrariul
//-Afiseaza de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre
//-Problema de mai sus intr-un alt fel rezolvata
//-Primele 5 numere divizibile cu 3
//            -Primele 3 numere dibizibile cu 5
//            -Primele 4 numere pozitive si pare
//-Suma numerelor pana la 10
//            -Produsul numerelor pana la 5
//            -Problemele de mai sus le rescriem si in for/while in functie de ce abordare a avut fiecare

@Test
        public  void metoda_test() {
        citim_3_nr(7,8,18);
        afisare_x5_da();
        afisare_x5_da_while();
        nr_div_cu_3();
        nr_div_cu_5();
        prim_4_nr_poz_par();
        suma_nr_pana_la_10();
        produs_nr_pana_la_5();


}



    // -Citim 3 numere cu valori diferite.Daca suma primelor 2 numere este mai mare decat al 3 lea numar afisam un mesaj corespunzator +valoarea sumei, altfel afisam contrariul
        public void citim_3_nr(Integer num1,Integer num2, Integer num3) {

            System.out.print("Introduceti primul numar: "  + num1);

            System.out.print("Introduceti al doilea numar: " + num2);

            System.out.print("Introduceti al treilea numar: " + num3);


            int suma = num1 + num2;

            if (suma > num3) {
                System.out.println("Suma primelor doua numere este mai mare decat al treilea numar: " + suma);
            } else {
                System.out.println("Suma primelor doua numere nu este mai mare decat al treilea numar.");
            }
        }




    //-Afiseaza de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre

    public  void afisare_x5_da() {
        for (Integer i=0; i<5; i++) {
            System.out.print("DA ");
        }
    }

    public void afisare_x5_da_while(){
    Integer i=0;
    while (i<5){
            System.out.println("DA ");
            i++;
        }
    }




    //-Primele 5 numere divizibile cu 3
    public void nr_div_cu_3(){
       Integer a=0;
       for(Integer index=0; index<40; index++){
           if(index%3==0 && a<5){
               a++;
               System.out.println(index);
           }
       }
    }




    //-Primele 3 numere dibizibile cu 5
    public void nr_div_cu_5(){
    Integer a=0;
    for (Integer index=0;index<23;index++){
        if(index%5==0){
            a++;
            System.out.println(index);
        }
        if(a==3){
            break;
        }
    }

    }





    //-Primele 4 numere pozitive si pare
    public void prim_4_nr_poz_par(){
    Integer a=0;

    for( Integer index=2;index<60;index++){
        if (index % 2 == 0 && a<4) {
            a++;
            System.out.print(index);
        }
    }

    }




    //-Suma numerelor pana la 10
    public void suma_nr_pana_la_10(){
    Integer index=0;
    Integer suma_nr=index;
    while (index<10){
        suma_nr=suma_nr+index;
        index++;
    }
        System.out.println("Suma numerelor este :" + suma_nr);

    }




    //-Produsul numerelor pana la 5
    public void produs_nr_pana_la_5(){
    Integer index=1;
    Integer produs=index;
    while (index<5){
        produs=produs*index;
        index++;
    }
        System.out.println("Produsul numerelor este :" + produs);
    }
}
