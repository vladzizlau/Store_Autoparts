package by.pvt.core.repository;

import by.pvt.api.dto.carDTO.EngineResponse;
import by.pvt.core.config.HibernateConfig;
import by.pvt.core.domain.shopDomain.Engine;
import by.pvt.core.domain.shopDomain.EngineType;
import by.pvt.core.repository.interfaceRepository.EngineInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.math.BigDecimal;
import java.util.List;

public class EngineRepository implements EngineInterface {
    private final SessionFactory sessionFactory;

    public EngineRepository() {
        sessionFactory = HibernateConfig.getSessionFactory();
    }

    @Override
    public void addEngine(Engine engine) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(engine);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<EngineResponse> getAllEngine() {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("select a from Engine a");
        return (List<EngineResponse>) query.getResultList();
    }

    @Override
    public List<EngineResponse> getEngineByCapacity(Double capacity) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("select a from Engine a where engineCapacity = :capacity").setParameter("capacity", capacity);
        return (List<EngineResponse>) query.getResultList();
    }

    @Override
    public List<EngineResponse> getEngineByType(EngineType type) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("select a from Engine a where type = :type").setParameter("type", type);
        return (List<EngineResponse>) query.getResultList();
    }

    @Override
    public List<EngineResponse> getEngineByPrice(BigDecimal start, BigDecimal end) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("select a from Engine a where a.cost >= :start AND a.cost <= :end");
        query.setParameter("start", start);
        query.setParameter("end", end);
        return (List<EngineResponse>) query.getResultList();
    }

    @Override
    public EngineResponse findById(Long engineID) {
        Session session = sessionFactory.openSession();
        return session.get(EngineResponse.class, engineID);
    }

    @Override
    public void updateEngine(Engine engine) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.update(engine);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delEngine(long id) {
        Session session = sessionFactory.openSession();
        Engine engine = session.get(Engine.class, id);
        session.getTransaction().begin();
        session.remove(engine);
        session.close();
    }
}
