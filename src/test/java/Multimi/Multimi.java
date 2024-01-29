package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Multimi {

    @Test

    //array e cu paranteze     []
    //lenght scimba singur pozitia
    // fiecare pozitie are un contor
    //size= lista nu trb sa aiba valoare GET
    //hashMap    PUT

    public void metoda_test(){
        nume_cursanti_array();
        nume_cursanti_lista();
        obiecte_hashmap();
        tariOrase();
        reteteGatit("Tiramisu");
    }



    // Afisam numele cursantilor
    public void nume_cursanti_array(){
        String[] nume_cursanti=new String[4];
        nume_cursanti[0]="Adi";
        nume_cursanti[1]="Anca";
        nume_cursanti[2]="Andreea";
        nume_cursanti[3]="Claudia";

        for (Integer index=0;index<nume_cursanti.length;index++){
            System.out.println(nume_cursanti[index]);
        }
    }
    public void nume_cursanti_lista(){
        List<String> nume_cursanti=new ArrayList<>();
        nume_cursanti.add("Cosmin");
        nume_cursanti.add("Oana");
        nume_cursanti.add("Letitia");
        nume_cursanti.add("Diana");

        for (Integer index=0;index<nume_cursanti.size();index++){
            System.out.println(nume_cursanti.get(index));
        }
    }

    //hashmap= key-value   PUT
    // o multime de valori care nu au legatura
    //cheia trebuie sa aiba o valoare   String
    //valoarea    String

    public void obiecte_hashmap(){
        HashMap<String,String> obiecte=new HashMap<>();
        obiecte.put("electronic","telefon");
        obiecte.put("alimente","supa");
        obiecte.put("masina","ford");
         for (String key: obiecte.keySet()){
             System.out.println("cheia este "+key);
             System.out.println("Valoarea este "+obiecte.get(key));
         }

    }
    // reprezentam niste tari cu orase

    public void tariOrase(){
        HashMap<String,List<String>>testData= new HashMap<>();

        List<String>oraseRomania = new ArrayList<>();
        oraseRomania.add("Bucresti");
        oraseRomania.add("Arad");
        oraseRomania.add("Cluj");

        List<String>oraseItalia = new ArrayList<>();
        oraseItalia.add("Roma");
        oraseItalia.add("Sicilia");
        oraseItalia.add("Napoly");

        List<String>oraseSpania = new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Madrid");
        oraseSpania.add("Sevillia");


        testData.put("Romania",oraseRomania);
        testData.put("Italia",oraseItalia);
        testData.put("Spania",oraseSpania);

        for (String key: testData.keySet()){
            System.out.println("Tara este "+key);
            System.out.println("Orasele sunt "+testData.get(key));
        }

    }

    //definim retete de gatit

    public void reteteGatit(String reteta){
        HashMap<String,List<String>>carteBucate= new LinkedHashMap<>();

        List<String>ciorbaRadauteana = new ArrayList<>();
        ciorbaRadauteana.add("Morcovi - 2 bucati");
        ciorbaRadauteana.add("Ceapa - 3 bucati");
        ciorbaRadauteana.add("smantana");
        ciorbaRadauteana.add("apa - 4l");
        ciorbaRadauteana.add("Telina - 1/2");
        ciorbaRadauteana.add("Carne de pui - 500g");
        ciorbaRadauteana.add("Sare si piper - dupa gust");

        List<String>Tiramisu = new ArrayList<>();
        Tiramisu.add("Piscoturi - 400 g");
        Tiramisu.add("Cafea - 50 ml");
        Tiramisu.add("Mascarpone - 500");
        Tiramisu.add("Amareto - 20ml");
        Tiramisu.add("Oua - 3 buc");
        Tiramisu.add("Zahar - 2 linguri");


        carteBucate.put("Ciorba radauteana ", ciorbaRadauteana);
        carteBucate.put("Tiramisu" , Tiramisu);


        for (String key: carteBucate.keySet()){
            if(key.equals(reteta)){

            System.out.println("Reteta este pentru: "+key);
            System.out.println(" Ingredientele pt reteta sunt urmatoarele: "+carteBucate.get(key));}
        }


    }
}
