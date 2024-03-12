package simpleFactory.classes;

public class Asistent extends PersonalSpital{

    public Asistent(String nume, int salariu) {
        super(nume, salariu);
    }


    @Override
    public void afiseazaDetalii() {
        System.out.println("Asistentul " + getNume() + " are salariul " + getSalariu());
    }
}
