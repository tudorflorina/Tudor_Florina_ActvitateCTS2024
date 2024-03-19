package A1.builder.main;

import A1.builder.classes.Pacient;
import A1.builder.classes.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        Pacient pacientBuilder = new PacientBuilder().setAreMicDejunInclus(true).build();
        System.out.println(pacientBuilder);
    }
}
