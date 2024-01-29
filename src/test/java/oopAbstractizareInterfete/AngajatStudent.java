package oopAbstractizareInterfete;

public class AngajatStudent extends Persoana implements StudentInt,AngajatInt{


    public AngajatStudent(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);

    }

    @Override
    public void munceste() {
        System.out.println("Angajatul/Studentul munceste ");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul/Studentul pprimeste salariu ");
    }

    @Override
    public void areConcediu() {
        System.out.println("Angajatul/Studentul isi ia concediu ");

    }

    @Override
    public void mergeLaFacultate() {
        System.out.println("Angajatul/Studentul merge la facultate ");
    }

    @Override
    public void sustineExamene() {
        System.out.println("Angajatul/Studentul sustine examene ");
    }

    @Override
    public void mergeInVacanta() {
        System.out.println("Angajatul/Studentul merge in vacanta ");

    }

    @Override
    public void treceRestante() {
        System.out.println("Angajatul/Studentul sustine examene pentru restante ");
    }
}
