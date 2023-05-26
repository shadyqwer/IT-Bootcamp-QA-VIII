package domaci17;

public enum Mreza {
    G3("3G"), G4("4G"), G5("5G");
    private final String mreza;

    Mreza(String mreza) {
        this.mreza = mreza;
    }

    public String getMreza() {
        return mreza;
    }
}
