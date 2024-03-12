package simpleFactory.main;

import simpleFactory.classes.PersonalSpital;
import simpleFactory.classes.fabrica.FabricaPersonal;
import simpleFactory.classes.fabrica.TipPersonal;

public class Main {
    public static void main(String[] args) {
        FabricaPersonal fabricaPersonal = new FabricaPersonal();
        try{
            PersonalSpital medic = fabricaPersonal.createPersonal(TipPersonal.MEDIC, "Ionel", 5000);
            PersonalSpital asistent = fabricaPersonal.createPersonal(TipPersonal.ASISTENT, "Andrei", 5000);
            PersonalSpital brancardier = fabricaPersonal.createPersonal(TipPersonal.BRANCARDIER, "Ioana", 5000);
            medic.afiseazaDetalii();
            asistent.afiseazaDetalii();
            brancardier.afiseazaDetalii();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
