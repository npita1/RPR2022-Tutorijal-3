package ba.unsa.etf.rpr;

import java.util.Iterator;
import java.util.Set;

public class Program
{
    public static void main( String[] args )
    {
       Imenik imenik = new Imenik();
       MobilniBroj mobitel = new MobilniBroj(61, "147-258");
       FiksniBroj fiksni = new FiksniBroj("987-456", Grad.TUZLA);
       MedunarodniBroj medunarodni = new MedunarodniBroj("+387", "62 456-789");

       imenik.dodaj("Mobilni Mobilic", mobitel);
       imenik.dodaj("Fikso Fiksic", fiksni);
       imenik.dodaj("Medunarod Medunarodic", medunarodni);

       System.out.println(imenik.dajIme(mobitel));
       System.out.println(imenik.dajIme(fiksni));
       System.out.println(imenik.dajIme(medunarodni));

        System.out.println(imenik.dajBroj("Mobilni Mobilic"));
        System.out.println(imenik.dajBroj("Fikso Fiksic"));
        System.out.println(imenik.dajBroj("Medunarod Medunarodic"));
        System.out.println(imenik.dajBroj("Nepostojan Nepostojic"));

        System.out.println(imenik.naSlovo('M'));

        FiksniBroj fiksni2 = new FiksniBroj("789-112", Grad.TUZLA);
        imenik.dodaj("Fiksin Brat",fiksni2);

        Set<String> osobeIzGrada = imenik.izGrada(Grad.TUZLA);
        Iterator it = osobeIzGrada.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        Set<TelefonskiBroj> brojeviIzGrada = imenik.izGradaBrojevi(Grad.TUZLA);
        it = brojeviIzGrada.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
