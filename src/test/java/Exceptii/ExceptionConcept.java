package Exceptii;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionConcept {

    // Exceptie = Eroare care apare in momentul cand programul ruleaza
    // Exceptiile trebuie tratate deoarece pot sa contina info din interior  c are pot sa fie exploatate
    // Poate sa apara o exceptie cand vrem sa citim un fisier
    // Citim datele dintr-un tabel din DB care nu exista
    // Exceptiile sunt de doua tipuri ; checked si un checked
    // CHECKED = exceptii care se trateaza in timpul complilarii
    // Acest tip de exceptii mostenesc clasa Exception
    // UNCHECKED = exceptii care nu se trateaza in timpul compilarii
    // Acest tip de excetii mostenesc clasa Runtime Exception
    // Exista doua keywords foarte importante pentru a trata exceptiile : throw si throws
    // Orice tip de exceptie se trateaza folosind structura try...catch...finaly

    public void checkedExample(String path){

        File file = new File(path);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            System.out.println("Am gasit fisierul. ");
        }
        catch(FileNotFoundException exception){
            System.out.println("A intrat pe clasa catch. ");
        }
        finally {
            System.out.println("Am mai incercat o data sa gaseasca fisierul.");
        }
    }
    public void uncheckedExampleV1(){
        System.out.println("Acest cod o sa produca o exceptie ");
        Integer calcul = 7/0;
        System.out.println(calcul);

    }
    public void uncheckedExampleV2(){

        String [] colegi = new String[2];
        colegi[0]= "Mada";
        colegi[1]= "Mada2";
        colegi[2]= "Mada3";
        System.out.println("Acest cod o sa produca o exceptie.");
        for (Integer index=0;index<colegi.length;index++){
            System.out.println(colegi[index]);

        }
    }
    // Throw = keybord folosit sa arunce o eceptie specifica
    // Se repeta in interiorul unei metode

    public void verificaVarsta(Integer varsta){
        if(varsta<18){
            throw new RuntimeException("Nu iti dau tigari pt ca esti minor. ");
        }
        else {
            System.out.println("Iti dau pt ca esti major. ");
        }
    }
    // Throws = keyword folosit in semnatura metodei ca sa arate faptul ca o metoda poate sa arunce o exceptie
    // Poate sa fie urmat de o multime de exceptii delimitate cu virgula

    public void throwsExample(String path) throws FileNotFoundException {

        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        System.out.println("Am gasit fisierul. ");
    }

}
