package Tema;

import org.testng.annotations.Test;

public class Masina_tipuri_de_date {
    public String Marca;
    public String Model;
    public Integer An_fabricatie;
    public String Combustibil;
    public Double Motorizare;
    public Float Norma_de_poluare;

    public Boolean Disponibilitate_nou;

    @Test

    public void Caracteristici_masina() {

        Marca = "Mercedes";
        Model = "C class";
        An_fabricatie = 2023;
        Combustibil = "Benzina ";
        Motorizare = 2.5;
        Norma_de_poluare = 6f; //o vede ca si  double dar daca ii pui un f il recunoaste float; float trip
        Disponibilitate_nou = true;

        System.out.println("Urmeaza sa configurati autoturismul dorit:");
        System.out.println("Aceasta este o" + ' '+ Marca + ' ' +", iar modelul prezentat este"+ ' '+ Model);
        System.out.println("Anul fabricatiei :" + ' ' + An_fabricatie);
        System.out.println(Combustibil + ' ' +"benzina");
        System.out.println("Monitorizarea aleasa va fi "+ ' ' + Motorizare);
        System.out.println("Norma de poaluare a masini este "+ ' ' + Norma_de_poluare);
        System.out.println("Are masina disponibilitate noua ?"+ ' ' + Disponibilitate_nou);
    }


}
