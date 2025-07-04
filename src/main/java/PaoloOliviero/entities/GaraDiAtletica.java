package PaoloOliviero.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "garadiatletica")
public class GaraDiAtletica extends Evento {

    @Column(name = "nomevincitore")
    private String nomeVincitore;

    @Column(name = "numero_atleti")
    private int numeroAtleti;

    public GaraDiAtletica() {
    }

    public GaraDiAtletica(Long id, String titolo, Date dataEvento, String descrizione,
                          TipoEvento tipoEvento, int numeroMassimoPartecipanti,
                          String nomeVincitore, int numeroAtleti) {
        super(id, titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);
        this.nomeVincitore = nomeVincitore;
        this.numeroAtleti = numeroAtleti;
    }

    public String getNomeVincitore() {
        return nomeVincitore;
    }

    public void setNomeVincitore(String nomeVincitore) {
        this.nomeVincitore = nomeVincitore;
    }

    public int getNumeroAtleti() {
        return numeroAtleti;
    }

    public void setNumeroAtleti(int numeroAtleti) {
        this.numeroAtleti = numeroAtleti;
    }
}