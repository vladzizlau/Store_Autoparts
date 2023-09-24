package by.pvt.core.repository;

import by.pvt.core.config.HibernateConfig;
import by.pvt.core.domain.shopDomain.CarLamps;
import by.pvt.core.repository.interfaceRepository.CarLampsInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class CarLampRepository implements CarLampsInterface
    {
    private final SessionFactory sessionFactory;

    public CarLampRepository() {
    sessionFactory = HibernateConfig.getSessionFactory();
    }
    @Override
    public void addCarLamps(CarLamps lamps)
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(lamps);
        session.getTransaction().commit();
        session.close();
        }

    @Override
    public List<CarLamps> getAllLamps()
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("select a from CarLamps a");
        return (List<CarLamps>) query.getResultList();
        }

    @Override
    public CarLamps findById(Long lampID)
        {
        Session session = sessionFactory.openSession();
        return session.get(CarLamps.class, lampID);
        }

    @Override
    public void updateLamps(CarLamps lamps)
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.update(lamps);
        session.getTransaction().commit();
        session.close();
        }

    @Override
    public void delCarLamps(long id)
        {
        Session session = sessionFactory.openSession();
        CarLamps lamps = session.get(CarLamps.class, id);
        session.getTransaction().begin();
        session.remove(lamps);
        session.close();
        }
    }
