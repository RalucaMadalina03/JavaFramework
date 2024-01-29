
package StructuriAlternative;
import org.testng.annotations.Test;

public class Curs_if_else {
    // Structurile pot sa fie de doua feluri : alternative si repetitive
    // Structuri alternative: if...than...else,switch...case

    @Test
    public void test_metod(){
//        verific_nr_mai_mare(9);
//        verific_nr_mai_mare(1);
//        verific_nr_mai_mare(5);
//        verific_nr_mai_mare(-6);
//        verific_nr_mai_mare(4);
//        verific_nr_mai_mare(6);
        verificam_nr_par(1);
        verificam_nr_par(2);
        verificam_nr_par(-3);
        verificam_nr_par(-10);
        verificam_nr_par(0);
        verificam_nr_par(600000);
        verificam_nr_par(333333);
        persoana_majora(17);
        persoana_majora(18);
        persoana_majora(19);
    }

    //verificam daca un nr este mai mare decat 5
    public void verific_nr_mai_mare(Integer nr){
        if(10>5) {
            System.out.println("Numarul "+nr+"10 este mai mare ca 5");
        }
        else {
            System.out.println("Numarul 10 este mai mic decat 5");
        }
    }
    // Verificam daca un nr este par si pozitiv .
    public void verificam_nr_par(Integer nr) {
        // Daca vreau catul = /(div)
        // Daca vreau restul = % (mod)
//        if (nr > 0) {
//            // Deci ai verificat aici mai sus daca numarul e mai mare ca zero
//            // Deci in acest IF intra doar numerele mai mari ca 0
//            }
//
//        if (nr % 2 == 0) {
//            System.out.println("Numarul " + nr + "este par si pozitiv");
//        }
//        else if (nr < 0) {
//            // Ca apoi sa verifici aici daca numarul e mai mic ca 0?????
//
//            if (nr % 2 == 0) ;
//        }
//        System.out.println("Numarul " + nr + "este par si negativ");
//        } else {
//            System.out.println("Numarul " + nr + "este impar si negativ");
//        }
//
//            else{
//            System.out.println("Numarul " + nr + "este 0");
//        }
//    }
        if(nr > 0){
            //AICI E POZITIV
            if(nr % 2 == 0){
                //AICI E POZITIV SI PAR
                System.out.println("Numarul " + nr + "este impar si negativ");
                //Iti pui tu mai departe loguri la fiecare de mai jos
            }
            else {
                //AICI E POZITIV SI IMPAR
            }
        }
        else{
            //AICI E NEGATIV
            if(nr % 2 == 0)
            {
                //AICI E NEGATIV SI PAR

            }
            else {
                //AICI E NEGATIV SI IMPAR

            }
        }
    }
    //    veroficam daca o persoana este majora
    public void persoana_majora(Integer varsta){
        if (varsta>=18){
            System.out.println("Persoana cu varsta de "+varsta+"ani este majora");
        }
        else {
            System.out.println("Persoanacu varsta "+varsta+"ani  nu este majora");
        }
    }
}
