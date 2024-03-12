package factoryMethod.classes.fabrica;

import factoryMethod.classes.PersonalSpital;
import simpleFactory.classes.Brancardier;

public class FabricaBrancardier implements IFabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Brancardier(nume, salariu);
    }
}
