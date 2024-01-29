package Tema;

public class Variabila {

   //Conditions:
     // - Clasa noua creeata
     // - Afiseaza pe ecran urmatoarele:
     // - PENTRU FIECARE LINIE SE DECLARA VARIABILE NOI
     //
     //Assignments:
     //- Hello World
     //- Varsta ta (numar)
     //- Numele si prenumele pe 2 randuri
     //- (Tot) Care ii data de astazi?
     //  1/13/2019
     //  18:30 PM
     //  Marti/Joi
     //- Cat face [2+(3*4)-3]/3 ?
     //  Rezultatul corect este: {rezultatul}
     //- afiseaza pe ecran suma a 3 numere double intr-o variabila de acelasi tip +mesaj
     //- afiseaza pe ecran produsu a 2 numere integer intr-o variabila de acelasi tip+mesaj
     //- concateneaza la valoarile rezultate de mai sus mesajul "Stiu ca am calculat bine" si afiseaza-l pe ecran cu tot cu rezultatul calculului
     //- Adauga la "Salut" caracterul "M" la final
     //- Adauga la "Hello" caracterul "H" la inceput
     //- Adauga la "Ana are mere,pere,prune" dupa fiecare vocala de la final caracterul "Z"
     //- Comenteaza cerinta 2 4 6
     //- Decomenteaza cerintele comentate
     //- Adauga la toate rezultatele obtinute " Poti pleca acasa dupa ce iti verific munca!"



    public static void main(String[] args) {
        // Assignment 1: Hello World
        System.out.println("Hello, World!");

        // Assignment 2: Varsta ta (numar)
        int varsta = 25;
        System.out.println("Varsta ta este: " + varsta);

        // Assignment 3: Numele si prenumele pe 2 randuri
        String nume = "John";
        String prenume = "Doe";
        System.out.println("Numele: " + nume);
        System.out.println("Prenumele: " + prenume);

        // Assignment 4: (Tot) Care ii data de astazi?
        System.out.println("1/13/2019");
        System.out.println("18:30 PM");
        System.out.println("Marti/Joi");

        // Assignment 5: Cat face [2+(3*4)-3]/3 ?
        double rezultatul = (2 + (3 * 4) - 3) / 3.0;
        System.out.println("Rezultatul corect este: " + rezultatul);

        // Assignment 6: afiseaza pe ecran suma a 3 numere double intr-o variabila de acelasi tip +mesaj
        double numar1 = 5.5;
        double numar2 = 3.0;
        double numar3 = 2.25;
        double suma = numar1 + numar2 + numar3;
        System.out.println("Suma numerelor double este: " + suma);

        // Assignment 7: afiseaza pe ecran produsul a 2 numere integer intr-o variabila de acelasi tip+mesaj
        int integer1 = 7;
        int integer2 = 4;
        int produs = integer1 * integer2;
        System.out.println("Produsul numerelor int este: " + produs);

        // Assignment 8: concateneaza la valorile rezultate de mai sus mesajul "Stiu ca am calculat bine" si afiseaza-l pe ecran cu tot cu rezultatul calculului
        System.out.println("Stiu ca am calculat bine ");
        System.out.println("Suma numerelor double este: " + suma);
        System.out.println("Produsul numerelor int este: " + produs);

        // Assignment 9: Adauga la "Salut" caracterul "M" la final
        String salut = "Salut";
        salut = salut + "M";
        System.out.println(salut);

        // Assignment 10: Adauga la "Hello" caracterul "H" la inceput
        String hello = "Hello";
        hello = "H" + hello;
        System.out.println(hello);

        // Assignment 11: Adauga la "Ana are mere,pere,prune" dupa fiecare vocala de la final caracterul "Z"
        String text = "Ana are mere,pere,prune";
        text = text.replaceAll("([aeiouAEIOU])", "$1Z");
        System.out.println(text);

        // Assignment 12: Comenteaza cerinta 2 4 6
        // Assignment 2: Varsta ta (numar)
        // Assignment 4: (Tot) Care ii data de astazi?
        // Assignment 6: afiseaza pe ecran suma a 3 numere double intr-o variabila de acelasi tip +mesaj

        // Assignment 13: Decomenteaza cerintele comentate
        // Assignment 2: Varsta ta (numar)
        // Assignment 4: (Tot) Care ii data de astazi?
        // Assignment 6: afiseaza pe ecran suma a 3 numere double intr-o variabila de acelasi tip +mesaj

        // Assignment 14: Adauga la toate rezultatele obtinute " Poti pleca acasa dupa ce iti verific munca!"
        System.out.println("Varsta ta este: " + varsta + " Poti pleca acasa dupa ce iti verific munca!");
        System.out.println("1/13/2019 Poti pleca acasa dupa ce iti verific munca!");
        System.out.println("Suma numerelor double este: " + suma + " " + " Poti pleca acasa dupa ce iti verific munca!");
        System.out.println("Produsul numerelor int este: " + produs + " " + " Poti pleca acasa dupa ce iti verific munca!");
    }
}
