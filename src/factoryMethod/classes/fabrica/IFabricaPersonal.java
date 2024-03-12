package factoryMethod.classes.fabrica;

import factoryMethod.classes.PersonalSpital;

public interface IFabricaPersonal {
    public PersonalSpital createPersonal(String nume, int salariu);
}
