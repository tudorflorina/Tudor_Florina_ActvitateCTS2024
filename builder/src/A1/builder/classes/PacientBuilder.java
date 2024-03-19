package A1.builder.classes;

public class PacientBuilder implements Builder{

    Pacient pacient;

    public PacientBuilder(){
        pacient = new Pacient(false,false,false,false);
    }

    public PacientBuilder setArePatRabatabil(boolean arePatRabatabil) {
        this.pacient.setArePatRabatabil(arePatRabatabil);
        return this;
    }

    public PacientBuilder setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.pacient.setAreMicDejunInclus(areMicDejunInclus);
        return this;
    }

    public PacientBuilder setArePapuciDeCamera(boolean arePapuciDeCamera) {
        this.pacient.setArePapuciDeCamera(arePapuciDeCamera);
        return this;
    }

    public PacientBuilder setAreHalatInterior(boolean areHalatInterior) {
        this.pacient.setAreHalatInterior(areHalatInterior);
        return this;
    }

    @Override
    public Pacient build() {
        return pacient;
    }
}
