package simpleFactory.classes;

public class Brancardier extends PersonalSpital{

    public Brancardier(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Brancardierul " + getNume() + " are salariul " + getSalariu());
    }
}
