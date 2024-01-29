package StaticKeyword;

import org.testng.annotations.Test;

public class StaticTest {
    @Test
    public void testmethod(){
        Elevi unu = new Elevi("Popescu", "Ciprian");
        unu.prezentareElev();

        Elevi doi = new Elevi("Popescu2", "Ciprian2");
        doi.prezentareElev();

        Elevi trei = new Elevi("Popescu3","Ciprian3");
        trei.prezentareElev();

    }
}
