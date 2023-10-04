package by.pvt.core.repository;

import by.pvt.api.dto.carDTO.CarLampResponse;
import by.pvt.core.config.HibernateConfig;
import by.pvt.core.domain.shopDomain.CarLamp;
import by.pvt.core.repository.interfaceRepository.CarLampInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.math.BigDecimal;
import java.util.List;

public class CarLampRepository implements CarLampInterface
    {
    private final SessionFactory sessionFactory;

    public CarLampRepository() {
    sessionFactory = HibernateConfig.getSessionFactory();
    }
    @Override
    public void addCarLamps(CarLamp lamps)
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(lamps);
        session.getTransaction().commit();
        session.close();
        }

    @Override
    public List<CarLampResponse> getAllLamps()
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("select a from CarLamps a");
        return (List<CarLampResponse>) query.getResultList();
        }
        @Override
        public List<CarLampResponse> getCarLampByPower(int power)
        {
            Session session = sessionFactory.openSession();
            session.getTransaction().begin();
            Query query = session.createQuery("select a from CarLamp a where power = :power").setParameter("power", power);
            return (List<CarLampResponse>) query.getResultList();
        }
        @Override
        public List<CarLampResponse> getCarLampBySocket(String socket)
        {
            Session session = sessionFactory.openSession();
            session.getTransaction().begin();
            Query query = session.createQuery("select a from CarLamp a where socket = :socket").setParameter("socket", socket);
            return (List<CarLampResponse>) query.getResultList();}
        @Override
        public List<CarLampResponse> getCarLampByPrice(BigDecimal start, BigDecimal end)
        {
            Session session = sessionFactory.openSession();
            session.getTransaction().begin();
            Query query = session.createQuery("select a from BodyPart a where a.cost >= :start AND a.cost <= :end");
            query.setParameter("start", start);
            query.setParameter("end", end);
            return (List<CarLampResponse>) query.getResultList();
        }
    @Override
    public CarLampResponse findById(Long lampID)
        {
        Session session = sessionFactory.openSession();
        return session.get(CarLampResponse.class, lampID);
        }

    @Override
    public void updateLamps(CarLamp lamp)
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.update(lamp);
        session.getTransaction().commit();
        session.close();
        }

    @Override
    public void delCarLamps(long id)
        {
        Session session = sessionFactory.openSession();
        CarLamp lamps = session.get(CarLamp.class, id);
        session.getTransaction().begin();
        session.remove(lamps);
        session.close();
        }
    }
