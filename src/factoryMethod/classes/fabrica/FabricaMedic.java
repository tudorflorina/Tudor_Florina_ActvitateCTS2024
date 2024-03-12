package factoryMethod.classes.fabrica;

import factoryMethod.classes.PersonalSpital;
import simpleFactory.classes.Medic;

public class FabricaMedic implements IFabricaPersonal{

    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Medic(nume, salariu);
    }
}
