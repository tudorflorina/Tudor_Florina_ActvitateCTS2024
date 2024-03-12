package factoryMethod.classes.fabrica;

import factoryMethod.classes.PersonalSpital;
import simpleFactory.classes.Asistent;

public class FabricaAsistent implements IFabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Asistent(nume, salariu);
    }
}
