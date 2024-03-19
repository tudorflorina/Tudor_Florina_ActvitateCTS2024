package A1.builder_v2.classes;

public class Pacient {
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuciDeCamera;
    private boolean areHalatInterior;

    public Pacient(boolean arePatRabatabil, boolean areMicDejunInclus, boolean arePapuciDeCamera, boolean areHalatInterior) {
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejunInclus = areMicDejunInclus;
        this.arePapuciDeCamera = arePapuciDeCamera;
        this.areHalatInterior = areHalatInterior;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pacient{");
        sb.append("arePatRabatabil=").append(arePatRabatabil);
        sb.append(", areMicDejunInclus=").append(areMicDejunInclus);
        sb.append(", arePapuciDeCamera=").append(arePapuciDeCamera);
        sb.append(", areHalatInterior=").append(areHalatInterior);
        sb.append('}');
        return sb.toString();
    }

    public void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    public void setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
    }

    public void setArePapuciDeCamera(boolean arePapuciDeCamera) {
        this.arePapuciDeCamera = arePapuciDeCamera;
    }

    public void setAreHalatInterior(boolean areHalatInterior) {
        this.areHalatInterior = areHalatInterior;
    }

    public static class PacientBuilder implements Builder{
        private boolean arePatRabatabil;
        private boolean areMicDejunInclus;
        private boolean arePapuciDeCamera;
        private boolean areHalatInterior;

        public PacientBuilder() {

        }


        @Override
        public Pacient build() {
            return new Pacient(arePatRabatabil, areMicDejunInclus, arePapuciDeCamera, areHalatInterior);
        }

        public PacientBuilder(boolean arePatRabatabil, boolean areMicDejunInclus, boolean arePapuciDeCamera, boolean areHalatInterior) {
            this.arePatRabatabil = arePatRabatabil;
            this.areMicDejunInclus = areMicDejunInclus;
            this.arePapuciDeCamera = arePapuciDeCamera;
            this.areHalatInterior = areHalatInterior;
        }

        public PacientBuilder setPatRabatabil(boolean patRabatabil){
            this.arePatRabatabil = patRabatabil;
            return this;
        }

        public PacientBuilder setMicDejunInclus(boolean micDejunInclus){
            this.areMicDejunInclus = micDejunInclus;
            return  this;
        }

        public PacientBuilder setPapuciDeamera(boolean papuciDeamera){
            this.arePapuciDeCamera = papuciDeamera;
            return this;
        }

        public PacientBuilder setHalatBaie(boolean halatBaie){
            this.areHalatInterior = halatBaie;
            return this;
        }
    }
}
