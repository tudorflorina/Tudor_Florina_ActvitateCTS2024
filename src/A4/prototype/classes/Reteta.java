package A4.prototype.classes;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements RetetaAbstracta{

    private Map<String, Double> solutii;
    private String numeMedicament;

    public Reteta() {
        numeMedicament = "Not applicable";
        solutii = null;
    }

    public Reteta(Map<String, Double> solutii, String numeMedicament) {
        this.solutii = solutii;
        this.numeMedicament = numeMedicament;
    }

    public Map<String, Double> getSolutii() {
        return solutii;
    }

    public void setSolutii(Map<String, Double> solutii) {
        this.solutii = solutii;
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public void setNumeMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Reteta{");
        sb.append("solutii=").append(solutii);
        sb.append(", numeMedicament='").append(numeMedicament).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public RetetaAbstracta clone() {
        Reteta clona = new Reteta();
        clona.setSolutii(this.solutii);
        clona.setNumeMedicament(this.numeMedicament);
        return clona;
    }
}
