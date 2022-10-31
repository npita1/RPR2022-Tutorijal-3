package ba.unsa.etf.rpr;

import java.util.Objects;

public class MobilniBroj extends TelefonskiBroj{

    private int mobilnaMreza;
    private String mobilniBroj;

    public MobilniBroj(int mobilnaMreza, String mobilniBroj) {
        this.mobilnaMreza = mobilnaMreza;
        this.mobilniBroj = mobilniBroj;
    }

    @Override
    public String ispisi() {
        return "0" + String.valueOf(this.mobilnaMreza) + "/" + mobilniBroj;
    }

    @Override
    public int hasCode() {
        return Objects.hash(mobilnaMreza,mobilniBroj);
    }
}
