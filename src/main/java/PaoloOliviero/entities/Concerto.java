package PaoloOliviero.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "concerto")
public class Concerto extends Evento {

    @Enumerated(EnumType.STRING)
    @Column(name = "genere", nullable = false)
    private Genere genere;

    @Column(name = "in_streaming", nullable = false)
    private boolean inStreaming;

    public Concerto() {
    }

    public Concerto(Long id, String titolo, Date dataEvento, String descrizione,
                    TipoEvento tipoEvento, int numeroMassimoPartecipanti,
                    Genere genere, boolean inStreaming) {
        super(id, titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);
        this.genere = genere;
        this.inStreaming = inStreaming;
    }



    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public boolean isInStreaming() {
        return inStreaming;
    }

    public void setInStreaming(boolean inStreaming) {
        this.inStreaming = inStreaming;
    }
}