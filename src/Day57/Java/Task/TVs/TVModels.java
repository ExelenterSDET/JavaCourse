package Day57.Java.Task.TVs;

public enum TVModels {
    TOSHIBA("Toshiba"), LG("LG"), SAMSUNG("Samsung");

    String name;
    TVModels(String name) {
        this.name = name;
    }

    public String getModelName(){
        return this.name;
    }
}
