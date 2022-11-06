package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class ImenikTest {

    @Test
    void dodaj() {
        Imenik imenik = new Imenik();
        MobilniBroj mobitel = new MobilniBroj(61, "147-258");
        FiksniBroj fiksni = new FiksniBroj("987-456", Grad.TUZLA);
        MedunarodniBroj medunarodni = new MedunarodniBroj("+387", "62 456-789");

        imenik.dodaj("Mobilni Mobilic", mobitel);
        imenik.dodaj("Fikso Fiksic", fiksni);
        imenik.dodaj("Medunarod Medunarodic", medunarodni);

        assertEquals("Mobilni Mobilic", imenik.getImenik().get(mobitel));
        assertEquals("Fikso Fiksic", imenik.getImenik().get(fiksni));
        assertEquals("Medunarod Medunarodic", imenik.getImenik().get(medunarodni));
    }


    @Test
    void naSlovo() {
        Imenik imenik = new Imenik();
        MobilniBroj mobitel = new MobilniBroj(61, "147-258");
        FiksniBroj fiksni = new FiksniBroj("987-456", Grad.TUZLA);
        MedunarodniBroj medunarodni = new MedunarodniBroj("+387", "62 456-789");

        imenik.dodaj("Mobilni Mobilic", mobitel);
        imenik.dodaj("Fikso Fiksic", fiksni);
        imenik.dodaj("Medunarod Medunarodic", medunarodni);

        assertEquals("1. Mobilni Mobilic - 061/147-258 \n2. Medunarod Medunarodic - +387 62 456-789 \n", imenik.naSlovo('M'));
    }
    
    @Test
    void dajIme(){
        Imenik imenik = new Imenik();
        MobilniBroj mobitel = new MobilniBroj(61, "147-258");
        imenik.dodaj("Mobilni Mobilic", mobitel);
        assertEquals("Mobilni Mobilic", imenik.dajIme(mobitel));
    }

    @Test
    void dajBroj() throws NePostojiBrojException {
        Imenik imenik = new Imenik();
        Exception exception = assertThrows(NePostojiBrojException.class, () -> imenik.dajBroj("Nepostojan Nepostojić"),"Nije bacen izuzetak");
        assertTrue(exception.getMessage().contains("Ne postoji broj pod tim imenom!"));
    }
}