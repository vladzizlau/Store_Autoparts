package by.pvt.core.repository;

import by.pvt.core.config.HibernateConfig;
import by.pvt.core.domain.shopDomain.Car;
import by.pvt.core.repository.interfaceRepository.CarInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class CarRepository implements CarInterface
    {
    private final SessionFactory sessionFactory;

    public CarRepository() {
    sessionFactory = HibernateConfig.getSessionFactory();
    }
    @Override
    public void addCar(Car car)
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(car);
        session.getTransaction().commit();
        session.close();
        }

    @Override
    public List<Car> getAllCars()
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("select a from Car a");
        return (List<Car>) query.getResultList();
        }

    @Override
    public Car findById(Long carID)
        {
        Session session = sessionFactory.openSession();
        return session.get(Car.class, carID);
        }

    @Override
    public void updateCar(Car car)
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.update(car);
        session.getTransaction().commit();
        session.close();
        }

    @Override
    public void delCar(long id)
        {
        Session session = sessionFactory.openSession();
        Car car = session.get(Car.class, id);
        session.getTransaction().begin();
        session.remove(car);
        session.close();
        }
    }
