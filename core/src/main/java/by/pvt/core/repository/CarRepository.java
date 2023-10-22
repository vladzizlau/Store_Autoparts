package by.pvt.core.repository;

import by.pvt.api.dto.carDTO.CarResponse;
import by.pvt.core.config.HibernateConfig;
import by.pvt.core.domain.shopDomain.Car;
import by.pvt.core.domain.shopDomain.CarModel;
import by.pvt.core.repository.interfaceRepository.CarInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CarRepository implements CarInterface
    {
        @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCar(Car car)
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(car);
        session.getTransaction().commit();
        session.close();
        }

//    @Override
    public List<CarResponse> getAllCars()
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("select c from Car c");
        return (List<CarResponse>) query.getResultList();

        }

    @Override
    public CarResponse findById(Long carID)
        {
        Session session = sessionFactory.openSession();
        return session.get(CarResponse.class, carID);
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
