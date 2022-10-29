package Day57.Practice.Ibrahim.Task1.Tvs;

enum TvBrands {
    TOSHIBA("Toshiba"), LG("LG"), SAMSUNG("Samsung");

    final String name;
    TvBrands(String name) {
        this.name = name;
    }

    public String getModelName(){
        return this.name;
    }
}
