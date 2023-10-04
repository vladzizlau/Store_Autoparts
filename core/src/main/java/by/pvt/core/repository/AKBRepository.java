package by.pvt.core.repository;

import by.pvt.api.dto.carDTO.AkbResponse;
import by.pvt.core.config.HibernateConfig;
import by.pvt.core.domain.shopDomain.AKB;
import by.pvt.core.repository.interfaceRepository.AKBInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.math.BigDecimal;
import java.util.List;

public class AKBRepository implements AKBInterface {

    private final SessionFactory sessionFactory;

    public AKBRepository() {
        sessionFactory = HibernateConfig.getSessionFactory();
    }

    @Override
    public void addAKB(AKB akb) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(akb);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<AkbResponse> getAllAKB() {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("select a from AKB a");
        return (List<AkbResponse>) query.getResultList();
    }

    @Override
    public List<AkbResponse> getAKBbyVoltage(int volt) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("select a from AKB a where voltage = :volt").setParameter("volt", volt);
        return (List<AkbResponse>) query.getResultList();
    }
    @Override
    public List<AkbResponse> getAKBbyBatteryCapacity(Double capacity) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("select a from AKB a where battery_capacity = :capacity").setParameter("capacity", capacity);
        return (List<AkbResponse>) query.getResultList();
    }
    @Override
    public List<AkbResponse> getAKBbyPrice(BigDecimal start, BigDecimal end) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("select a from AKB a where a.price >= :start AND a.price <= :end");
        query.setParameter("start", start);
        query.setParameter("end", end);
        return (List<AkbResponse>) query.getResultList();
    }

    @Override
    public AkbResponse findById(Long akbID) {
        Session session = sessionFactory.openSession();
        return session.get(AkbResponse.class, akbID);
    }

    @Override
    public void updateAKB(AKB akb) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.update(akb);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delAKB(long id) {
        Session session = sessionFactory.openSession();
        AKB akb = session.get(AKB.class, id);
        session.getTransaction().begin();
        session.remove(akb);
        session.close();
    }
}
