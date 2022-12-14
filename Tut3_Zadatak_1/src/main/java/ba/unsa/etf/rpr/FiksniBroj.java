package ba.unsa.etf.rpr;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj implements Comparable<FiksniBroj> {

    private String fiksniBroj;
    private Grad grad;

    public FiksniBroj(String fiksniBroj, Grad grad) {
        this.fiksniBroj = fiksniBroj;
        this.grad = grad;
    }

    @Override
    public String ispisi() {
        return grad.label + "/" + fiksniBroj;
    }

    @Override
    public int hasCode() {
        return Objects.hash(this.grad, this.fiksniBroj);
    }

    public Grad getGrad() {
        return grad;
    }

    public String getFiksniBroj() {
        return fiksniBroj;
    }

    @Override
    public String toString() {
        return this.ispisi();
    }

    @Override
    public int compareTo(FiksniBroj o) {
        return this.ispisi().compareTo(o.ispisi());
    }

}
