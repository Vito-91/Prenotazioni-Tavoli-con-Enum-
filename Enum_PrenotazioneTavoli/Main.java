package Enum_PrenotazioneTavoli;

public class Main {
    public static void main(String[] args) {

        // Creo una prenotazione
        Prenotazione p1 = new Prenotazione("VITO SALAMINO", 4, Fascia_Oraria.CENA);

        // La mostro
        p1.mostraDettagli();

        // Confermo la prenotazione
        p1.conferma();

        System.out.println("\nDopo conferma:");
        p1.mostraDettagli();

        // Annullamento
        p1.annulla();
        System.out.println("\nDopo annullamento:");
        p1.mostraDettagli();
    }
}
