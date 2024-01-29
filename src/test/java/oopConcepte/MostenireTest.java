package oopConcepte;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MostenireTest {

    @Test
    public void testMethod(){

        List<String> dotariAudiA5 = new ArrayList<>();
        dotariAudiA5.add("jante");
        dotariAudiA5.add("trapa");
        dotariAudiA5.add("faruri");

        List<String> dotariAudiA7 = new ArrayList<>();
        dotariAudiA7.add("jante");
        dotariAudiA7.add("trapa");
        dotariAudiA7.add("faruri");
        dotariAudiA7.add("oglinzi electrice");

        List<String> dotariBMWx6interior = new ArrayList<>();
        dotariBMWx6interior.add("incalzire scaune");
        dotariBMWx6interior.add("clima");
        dotariBMWx6interior.add("tetiera");
        dotariBMWx6interior.add("oglinzi electrice");

        List<String> dotariBMWx6exterior = new ArrayList<>();
        dotariBMWx6exterior.add("jante");
        dotariBMWx6exterior.add("trapa");
        dotariBMWx6exterior.add("faruri");
        dotariBMWx6exterior.add("spoiler");

        FabricaAudi audiA5 = new FabricaAudi("A5","sedan","negru",20,dotariAudiA5);
        audiA5.prezantareAudi();

        audiA5.setModel("A8");      //   asa se modifica modelul doar ca marca ramane neschimbata
        audiA5.prezantareAudi();

        audiA5.AfisareRezultate();
        audiA5.AfisareRezultate(2022);
        audiA5.AfisareRezultate("x");

        System.out.println(5);
        System.out.println("5");


        audiA5.AngajariFirma();

//        audiA5.motorizare = 3;           // se foloseste pt a modifica tot dar gresit
//        audiA5.marca = "Dacia";          // .
//        audiA5.prezantareAudi();

//        FabricaAudi audiA7 = new FabricaAudi("A7","SUV", "alb",30, dotariAudiA7);
//        audiA7.prezantareAudi();


        FabricaBMW BMWx6 = new FabricaBMW("x6","SUV","Negru",35,dotariBMWx6interior,
                dotariBMWx6exterior);
        BMWx6.prezantareBMW();
        BMWx6.AngajariFirma();


    }

}
