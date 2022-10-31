package ba.unsa.etf.rpr;

import java.util.HashMap;
import java.util.Set;


public class Imenik {

    private HashMap<TelefonskiBroj,String> imenik = new HashMap<>();

    public void dodaj (String ime, TelefonskiBroj telefonskiBroj) {
        imenik.put(telefonskiBroj,ime);
    }

    public String dajIme(TelefonskiBroj broj) {
         return imenik.get(broj);
    }

    public String dajBroj (String ime) {
        for (HashMap.Entry<TelefonskiBroj,String> e : imenik.entrySet()) {
            if (e.getValue().equals(ime))
                return e.getKey().ispisi();
        }
        return "Ne postoji broj pod tim imenom!";
    }

    public String naSlovo (char slovo) {
        String ispis = "";
        int i = 1;
        for (HashMap.Entry<TelefonskiBroj,String> entry : imenik.entrySet()) {
            if(entry.getValue().charAt(0) == slovo) {
                ispis += String.valueOf(i) + ". " + entry.getValue() + " - " + entry.getKey().ispisi() + " \n";
                i++;
            }
        }
        return ispis;
    }

    Set<String> izGrada (Grad g) {
        return null;
    }

    Set<TelefonskiBroj> izGradaBrojevi (Grad g) {
        return null;
    }

}
