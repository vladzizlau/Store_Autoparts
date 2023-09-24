package by.pvt.core.repository.manufacturer;

import by.pvt.core.config.HibernateConfig;
import by.pvt.core.domain.shopDomain.ManufacturerAKB;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class ManufacturerAKBRepo implements IManufacturerAKB
    {
    private final SessionFactory sessionFactory;
    public ManufacturerAKBRepo() {
    sessionFactory = HibernateConfig.getSessionFactory();
    }
    @Override
    public void add(ManufacturerAKB manufacturerAKB)
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(manufacturerAKB);
        session.getTransaction().commit();
        session.close();
        }

    @Override
    public List<ManufacturerAKB> getAll()
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("select a from ManufacturerAKB a");
        return (List<ManufacturerAKB>) query.getResultList();
        }

    @Override
    public void delete(long id)
        {
        Session session = sessionFactory.openSession();
        ManufacturerAKB akb = session.get(ManufacturerAKB.class, id);
        session.getTransaction().begin();
        session.remove(akb);
        session.close();
        }
    }
