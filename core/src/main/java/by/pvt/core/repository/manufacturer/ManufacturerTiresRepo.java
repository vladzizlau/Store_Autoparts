package by.pvt.core.repository.manufacturer;

import by.pvt.core.config.HibernateConfig;
import by.pvt.core.domain.shopDomain.ManufacturerTires;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class ManufacturerTiresRepo implements IManufacturerTires
    {
    private final SessionFactory sessionFactory;
    public ManufacturerTiresRepo() {
    sessionFactory = HibernateConfig.getSessionFactory();
    }
    @Override
    public void add(ManufacturerTires tires)
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(tires);
        session.getTransaction().commit();
        session.close();
        }

    @Override
    public List<ManufacturerTires> getAll()
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("select a from ManufacturerTires a");
        return (List<ManufacturerTires>) query.getResultList();
        }


    @Override
    public void delete(long id)
        {
        Session session = sessionFactory.openSession();
        ManufacturerTires tires = session.get(ManufacturerTires.class, id);
        session.getTransaction().begin();
        session.remove(tires);
        session.close();
        }
    }
