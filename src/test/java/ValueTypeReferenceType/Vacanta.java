package ValueTypeReferenceType;

import org.testng.annotations.Test;

public class Vacanta {
    public Integer value1=10;
    public String value2="Madalina";
    // Primitive: int, boolean, char, float, double, short, long
    // Nonprimitive : restul ( ex : string, multimi, object )

    public static Integer value3=10;

    public final Integer value4=5;

    @Test
    public void testMethod(){
        changeValueType(value1);
        System.out.println("Valoarea actuala este :" + value1);

        changeStringType(value2);
        System.out.println("Valoarea actuala este :" +value2 );

        changeStaticType(value3);
        System.out.println("Valoarea actuala este: " +value3);

       // value4=value4+5;


    }


    public void changeValueType(Integer x){
        x=x + 20;
        System.out.println("Noua valoare este:" +x);
    }

    public void changeStringType(String z){
        value2=value2 + z;
        System.out.println("Noua valoare este " + value2);
    }

    public void changeStaticType(Integer x){
        value3=value3 + x;
        System.out.println("Noua valoare este:" + x);
    }
}
