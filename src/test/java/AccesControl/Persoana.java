package AccesControl;

public class Persoana {

    // Acces control java : public, private, protected
    // Se pot folosi la variabile sau metode

    // Public = ofera vizibilitate peste tot si oricui
    // Parinte Copil = vizibil peste tot
    // Obiect = vizibil in acelasi pachet + in orice pachet

    // Private = ofera vizibilitate doar in interiorul clasei
    // Parinte Copil = nu este vizibil chiar daca ne aflam in acelasi pachet sau nu
    // Obiect = nu este vizibil in niciun pachet

    // Protected = oferta vizibilitate peste tot in interiorul pachetului
    // Parinte Copil = ofera vizibilitate peste tot in intregul program
    // Obiect = este vizibil daca este in acelasi pachet / nu este vizibil daca este in afara pachetului

    public void metodaPublica(){


    }

    private void  metodaPrivata(){


    }

    protected void metodaProtected(){

    }
}
