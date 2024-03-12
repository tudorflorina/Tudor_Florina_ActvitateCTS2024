package factoryMethod.classes;

public class Infirmier extends PersonalSpital {
    public Infirmier(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Infirmierul " + getNume() + " are salariul " + getSalariu());
    }
}
