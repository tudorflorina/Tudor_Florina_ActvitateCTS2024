package A4.prototype.main;

import A4.prototype.classes.Reteta;
import A4.prototype.classes.RetetaAbstracta;
import A4.prototype.classes.RetetaCrema;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> solutii1 = new HashMap<>();
        solutii1.put("Solutie1", 21.03);
        solutii1.put("Solutie2", 22.05);

        Reteta prototip = new Reteta(solutii1, "Medicament1");
        RetetaCrema prototip1 = new RetetaCrema(1, "Frisca");

        RetetaAbstracta reteta1 = prototip.clone();
        System.out.println(reteta1);

        RetetaAbstracta reteta2 = prototip1.clone();
        System.out.println(reteta2);
    }
}
