package Exceptii;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class ExceptiTest {

    @Test
    public void checkedExceptionType(){

        ExceptionConcept exceptionConcept = new ExceptionConcept();
        exceptionConcept.checkedExample("src/test/java/Exceptii/numa.txt");
        exceptionConcept.checkedExample("src/test/java/Exceptii/numa.txt");
    }
    @Test
    public void uncheckedExceptionType(){
        ExceptionConcept exceptionConcept = new ExceptionConcept();
        exceptionConcept.uncheckedExampleV1();
    }
    @Test
    public void uncheckedExceptionType2(){
        ExceptionConcept exceptionConcept = new ExceptionConcept();
        exceptionConcept.uncheckedExampleV2();
    }

    @Test
    public void throwException(){
        ExceptionConcept exceptionConcept = new ExceptionConcept();
        exceptionConcept.verificaVarsta(20);
        exceptionConcept.verificaVarsta(15);
    }

    @Test
    public void throwsException() throws FileNotFoundException {
        ExceptionConcept exceptionConcept = new ExceptionConcept();
        exceptionConcept.throwsExample("");
    }


}
