package by.pvt.core.repository;

import by.pvt.core.config.HibernateConfig;
import by.pvt.core.domain.shopDomain.Tires;
import by.pvt.core.repository.interfaceRepository.TiresInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class TiresRepository implements TiresInterface
    {
    private final SessionFactory sessionFactory;
    public TiresRepository() {
    sessionFactory = HibernateConfig.getSessionFactory();
    }
    @Override
    public void addTires(Tires tires)
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(tires);
        session.getTransaction().commit();
        session.close();
        }

    @Override
    public List<Tires> getAllTires()
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("select a from Tires a");
        return (List<Tires>) query.getResultList();
        }

    @Override
    public Tires findById(Long tiresID)
        {
        Session session = sessionFactory.openSession();
        return session.get(Tires.class, tiresID);
        }

    @Override
    public void updateTires(Tires tires)
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.update(tires);
        session.getTransaction().commit();
        session.close();
        }

    @Override
    public void delTires(long id)
        {
        Session session = sessionFactory.openSession();
        Tires tires = session.get(Tires.class, id);
        session.getTransaction().begin();
        session.remove(tires);
        session.close();
        }
    }
