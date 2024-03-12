package FactoryMethod.classes.main;

import factoryMethod.classes.PersonalSpital;
import factoryMethod.classes.fabrica.FabricaAsistent;
import factoryMethod.classes.fabrica.FabricaMedic;
import factoryMethod.classes.fabrica.IFabricaPersonal;

public class Main {

    public static void prelucrarePersonal(IFabricaPersonal fabricaPersonal, String nume, int salariu) {
        PersonalSpital personal = fabricaPersonal.createPersonal(nume, salariu);
        personal.afiseazaDetalii();
    }



    public static void main(String[] args) {
        IFabricaPersonal fabricaMedic = new FabricaMedic();
        IFabricaPersonal fabricaAsistent = new FabricaAsistent();

        factoryMethod.classes.PersonalSpital medic = fabricaMedic.createPersonal("Marius Ilie", 6700);
        factoryMethod.classes.PersonalSpital asistent = fabricaAsistent.createPersonal("Potcovescu Ioana", 3500);

        medic.afiseazaDetalii();
        asistent.afiseazaDetalii();

        prelucrarePersonal(new FabricaMedic(), "Burlacu Petru", 7600);
    }
}