package Obiect;


import org.testng.annotations.Test;

public class ObiectTest {

    @Test

    public void testMethod(){
        FabricaMasini MercedesG63AMG = new FabricaMasini("Mercedes","G 63 AMG","Electric",
                "Manuala",2022,4.8);

        MercedesG63AMG.prezentareProdus();
        MercedesG63AMG.calculImpozit();
        System.out.println("==================================================");

        FabricaMasini BMW = new FabricaMasini("BMW", "seria 6","Benzina", "Automata",
                2020, 2.0);

        BMW.prezentareProdus();
        BMW.calculImpozit();
        System.out.println("========================================");

        FabricaMasini Opel = new FabricaMasini("Opel", "Astra", "Diesel", "Manual",
                2017, 1.2);

        Opel.prezentareProdus();
        System.out.println("==================================================");

        FabricaMasini AudiR8 = new FabricaMasini("Audi", "R8", "Electric", "Manuala",
                2022, 3.2, 99000);
        AudiR8.prezentareProdus();
        System.out.println("====================");
        AudiR8.calculImpozit();
    }

}
