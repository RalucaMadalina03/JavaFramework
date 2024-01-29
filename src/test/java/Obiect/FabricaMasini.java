package Obiect;

public class FabricaMasini {

    //Constructor = are ca rol sa initializeze atributurile unei clase (alea cu mov)
    // Un constructor este public si are acelasi nume ca si clasa
    // Un constructor poate sa fie de doua feluri : cu parametri si fara
    // Un constructor fara parametri se mai buneste si defapult
    // Daca nu am definit noi un constructor , avem unul default
    // Intr-o cls putem avea n constructori, diferentiati prin nr sau tip de parametri

    // Obiect = instanta unei clase
    // Un obiect reprezinta o structura pe care o are clasa si din care poate accesa variabilele si metodele respective

    //Dintr-o clasa putem initializa n obiecte
    // In momentul in care iniatilizam un obiect apelam constructorul din clasa
    // Initializarea se fface cu new




    public String marca;
    public String model;
    public String combustibil;
    public String transmisie;
    public Integer an;
    public Double motorizare;
    public Integer pret;

//    public FabricaMasini(String Marca, String Model, String Combustibil, String Transmisie, Integer An, Double Motorizare){
////        this.Marca = Marca;
////        this.Model = Model;
////        this.Combustibil = Combustibil;
////        this.Transmisie = Transmisie;
////        this.An = An;
////        this.Motorizare = Motorizare;
//    }


    public FabricaMasini(String marca, String model, String combustibil, String transmisie, Integer an, Double motorizare) {
        this.marca = marca;
        this.model = model;
        this.combustibil = combustibil;
        this.transmisie = transmisie;
        this.an = an;
        this.motorizare = motorizare;
    }

    public FabricaMasini(String marca, String model, String combustibil, String transmisie, Integer an, Double motorizare, Integer pret) {
        this.marca = marca;
        this.model = model;
        this.combustibil = combustibil;
        this.transmisie = transmisie;
        this.an = an;
        this.motorizare = motorizare;
        this.pret = pret;
    }

    public void prezentareProdus(){
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este :" + model);
        System.out.println("Combustibilul masinii este :" + combustibil);
        System.out.println("Transmisia masinii este :" + transmisie);
        System.out.println("Anul masinii este :" + an);
        System.out.println("Monitorizarea masinii este :" +motorizare);
        if(pret != null){
        System.out.println("Pretul masinii este :" +pret); }
    }

    public void calculImpozit(){
        if(an >= 2020 && combustibil.equals("Electric") ){
            System.out.println("Clientul trebuie sa plateasca 5 ron.");
        }
        else {
            System.out.println("Clientul trebuie sa plateasca in functie de anul masinii.");

        }
    }


}
