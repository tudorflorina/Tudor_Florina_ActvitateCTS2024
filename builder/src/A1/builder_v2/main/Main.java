package A1.builder_v2.main;

import A1.builder_v2.classes.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient.PacientBuilder pacientBuilder = new Pacient.PacientBuilder();
        Pacient pacient = pacientBuilder.setHalatBaie(true).build();
        System.out.println(pacient);
    }
}
