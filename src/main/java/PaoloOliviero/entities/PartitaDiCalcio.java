package PaoloOliviero.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "partitadicalcio")
public class PartitaDiCalcio extends Evento {

    @Column(name = "squadra_di_casa", nullable = false)
    private String squadraDiCasa;

    @Column(name = "squadra_ospite", nullable = false)
    private String squadraOspite;

    @Column(name = "squadra_vincente")
    private String squadraVincente;

    @Column(name = "gol_casa", nullable = false)
    private int numeroGolSquadraDiCasa;

    @Column(name = "gol_ospite", nullable = false)
    private int numeroGolSquadraOspite;

    public PartitaDiCalcio() {
    }

    public PartitaDiCalcio(Long id, String titolo, Date dataEvento, String descrizione,
                           TipoEvento tipoEvento, int numeroMassimoPartecipanti,
                           String squadraDiCasa, String squadraOspite, String squadraVincente,
                           int numeroGolSquadraDiCasa, int numeroGolSquadraOspite) {
        super(id, titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
        this.squadraVincente = squadraVincente;
        this.numeroGolSquadraDiCasa = numeroGolSquadraDiCasa;
        this.numeroGolSquadraOspite = numeroGolSquadraOspite;
    }

    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    public int getNumeroGolSquadraDiCasa() {
        return numeroGolSquadraDiCasa;
    }

    public void setNumeroGolSquadraDiCasa(int numeroGolSquadraDiCasa) {
        this.numeroGolSquadraDiCasa = numeroGolSquadraDiCasa;
    }

    public int getNumeroGolSquadraOspite() {
        return numeroGolSquadraOspite;
    }

    public void setNumeroGolSquadraOspite(int numeroGolSquadraOspite) {
        this.numeroGolSquadraOspite = numeroGolSquadraOspite;
    }
}