package Day57.Tohir.Task.TVs;

public enum TVModels {

    TOSHIBA("Toshiba"), SAMSUNG("Samsung"), LG("LG");

    String name;

    TVModels(String name) {
        this.name = name;
    }

    public String getModelName(){
        return this.name;
    }
}
