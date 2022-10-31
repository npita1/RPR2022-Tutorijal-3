package ba.unsa.etf.rpr;

import java.util.Objects;

public class MedunarodniBroj extends TelefonskiBroj{

    private String drzava;
    private String broj;



    public MedunarodniBroj(String drzava, String broj) {
        this.drzava = drzava;
        this.broj = broj;
    }


    @Override
    public String ispisi() {
        return drzava + " " + broj;
    }

    @Override
    public int hasCode() {
        return Objects.hash(drzava,broj);
    }
}
