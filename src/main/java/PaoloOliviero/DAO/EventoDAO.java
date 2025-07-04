package PaoloOliviero.DAO;

import PaoloOliviero.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import PaoloOliviero.entities.Evento;

public class EventoDAO {
    private final EntityManager entityManager;

    public EventoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Evento nuovoEvento) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(nuovoEvento);
        transaction.commit();
        System.out.println("L'evento" + nuovoEvento.getTitolo() + " è stato salvato correttamente!");
    }

    public Evento findById(long eventoId) {
        Evento found =entityManager.find(Evento.class, eventoId);
        if (found ==null) throw new NotFoundException(eventoId);
        return found;
    }

}