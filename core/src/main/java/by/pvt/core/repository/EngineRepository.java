package by.pvt.core.repository;

import by.pvt.core.config.HibernateConfig;
import by.pvt.core.domain.shopDomain.Engine;
import by.pvt.core.repository.interfaceRepository.EngineInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class EngineRepository implements EngineInterface
    {
    private final SessionFactory sessionFactory;

    public EngineRepository() {
    sessionFactory = HibernateConfig.getSessionFactory();
    }
    @Override
    public void addEngine(Engine engine)
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(engine);
        session.getTransaction().commit();
        session.close();
        }

    @Override
    public List<Engine> getAllEngine()
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("select a from Engine a");
        return (List<Engine>) query.getResultList();
        }

    @Override
    public Engine findById(Long engineID)
        {
        Session session = sessionFactory.openSession();
        return session.get(Engine.class, engineID);
        }

    @Override
    public void updateEngine(Engine engine)
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.update(engine);
        session.getTransaction().commit();
        session.close();
        }

    @Override
    public void delEngine(long id)
        {
        Session session = sessionFactory.openSession();
        Engine engine = session.get(Engine.class, id);
        session.getTransaction().begin();
        session.remove(engine);
        session.close();
        }
    }
