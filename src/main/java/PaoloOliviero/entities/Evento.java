package PaoloOliviero.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name= "evento")
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titolo", nullable = false)
    private String titolo;

    @Column(name = "data_evento", nullable = false)
    private Date dataEvento;

    @Column(name = "descrizione", nullable = false)
    private String descrizione;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_evento", nullable = false)
    private TipoEvento tipoEvento;

    @Column(name = "numero_massimo_partecipanti", nullable = false)
    private int numeroMassimoPartecipanti;

    public Evento() {
    }

    public Evento(Long id, String titolo, Date dataEvento, String descrizione,
                  TipoEvento tipoEvento, int numeroMassimoPartecipanti) {
        this.id = id;
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitolo() { return titolo; }
    public void setTitolo(String titolo) { this.titolo = titolo; }

    public Date getDataEvento() { return dataEvento; }
    public void setDataEvento(Date dataEvento) { this.dataEvento = dataEvento; }

    public String getDescrizione() { return descrizione; }
    public void setDescrizione(String descrizione) { this.descrizione = descrizione; }

    public TipoEvento getTipoEvento() { return tipoEvento; }
    public void setTipoEvento(TipoEvento tipoEvento) { this.tipoEvento = tipoEvento; }

    public int getNumeroMassimoPartecipanti() { return numeroMassimoPartecipanti; }
    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }
}