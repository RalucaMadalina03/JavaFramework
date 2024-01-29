package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student_get_return {

    @Test
    public void metodaTest(){
        //get_marire();
        System.out.println(get_marire(30));
        //la fel ce ziceam, trimiti direct valoarea
        calcul_medie(8.5,6.5,"semestrul 1");
    }

    //metoda care calculeaza salariul unei persoane dupa o marire
    public Integer get_marire(Integer procent){
        Integer salar=15000;
        Integer marire=(salar*procent)/100;

        return salar+marire;
    }

    //fara ; dupa functie
    public Double get_medie(Double n1,Double n2) {
        return (n1+n2)/2;
    }

    public void calcul_medie(Double n1, Double n2, String text){
        System.out.println("Media pe"+text+"este:" +get_medie(n1,n2));
    }
}

