package Enum_PrenotazioneTavoli;

public class Prenotazione {
    private String nomeCliente;
    private int numeroPersone;
    private Fascia_Oraria fasciaOraria;
    private Stato_Prenotazione stato;

    public Prenotazione(String nomeCliente, int numeroPersone, Fascia_Oraria fasciaOraria) {
        this.nomeCliente = nomeCliente;
        this.numeroPersone = numeroPersone;
        this.fasciaOraria = fasciaOraria;
        this.stato = Stato_Prenotazione.IN_ATTESA;
    }

    public void conferma() {
        this.stato = Stato_Prenotazione.CONFERMATA;
    }

    public void annulla() {
        this.stato = Stato_Prenotazione.ANNULLATA;
    }

    public void mostraDettagli() {
        System.out.println("Prenotazione:");
        System.out.println("- Cliente: " + nomeCliente);
        System.out.println("- Persone: " + numeroPersone);
        System.out.println("- Fascia oraria: " + fasciaOraria);
        System.out.println("- Stato: " + stato);
    }
}
