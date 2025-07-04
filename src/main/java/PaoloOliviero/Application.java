package PaoloOliviero;

import PaoloOliviero.DAO.EventoDAO;
import PaoloOliviero.entities.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Date;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi2pu");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventoDAO ad = new EventoDAO(em);

        Concerto PU = new Concerto(
                null,
                "Ligabue Live",
                new Date(),
                "Grande concerto allo Stadio San Siro",
                TipoEvento.NUZIALE,
                40000,
                Genere.ROCK,
                true
        );

        PartitaDiCalcio derby = new PartitaDiCalcio(
                null,
                "Derby della Madonnina",
                new Date(),
                "Partita epica tra Milan e Inter",
                TipoEvento.COMPLEANNO,
                75000,
                "AC Milan",
                "Inter",
                "AC Milan", // oppure null se pareggio
                3,
                2
        );
        GaraDiAtletica giroitalia = new GaraDiAtletica(
                null,
                "100 metri finali",
                new Date(),
                "Finale olimpica 100 metri",
                TipoEvento.CONFERENZA,
                8,
                "Usain Bolt",
                8
        );

        ad.save(PU);
        ad.save(giroitalia);
        ad.save(derby);

        em.close();
        emf.close();

    }
}

