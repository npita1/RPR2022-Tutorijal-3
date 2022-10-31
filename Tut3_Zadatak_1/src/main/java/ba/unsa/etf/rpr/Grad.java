package ba.unsa.etf.rpr;

public enum Grad {
    SARAJEVO("033"), ZENICA("032"), MOSTAR("036"), TRAVNIK("030"), ORAJSE("031"), TUZLA("035"),
    GORAZDE("038"), SIROKI_BRIJEG("039"), LIVNO("034"), BRCKO("049");

    public String label;
    private Grad(String s) {
        this.label = s;
    }


}
