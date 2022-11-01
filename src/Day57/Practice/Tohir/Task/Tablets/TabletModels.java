package Day57.Tohir.Task.Tablets;

public enum TabletModels {

    SAMSUNG("Samsung"), APPPLE("Apple"), KINDLE("Kindle");
    String name;

    TabletModels(String name) {
        this.name = name;
    }

    public String getModelName(){
        return name;
    }

}
