package by.pvt.core.repository;

import by.pvt.api.dto.carDTO.CarModelResponse;
import by.pvt.core.config.HibernateConfig;
import by.pvt.core.domain.shopDomain.CarModel;
import by.pvt.core.repository.interfaceRepository.CarModelInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class CarModelRepository implements CarModelInterface {
    private final SessionFactory sessionFactory;

    public CarModelRepository() {
        sessionFactory = HibernateConfig.getSessionFactory();
    }

    @Override
    public void addModel(CarModel carModel) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(carModel);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<CarModelResponse> getAllModel() {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("select a from CarModel a");
        return (List<CarModelResponse>) query.getResultList();
    }

    @Override
    public List<CarModelResponse> getModelByBrand(Long brandId) {

        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select c from CarModel c where car_id = :brandId");
        query.setParameter("carId", brandId);
        return (List<CarModelResponse>) query.getResultList();
    }

    @Override
    public CarModel getModelById(Long modelId) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select c from CarModel c where id = :modelId").setParameter("modelId", modelId);
        return (CarModel) query.getSingleResult();
    }
    @Override
    public void updateModel(CarModel carmodel) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.update(carmodel);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void deleteModel(Long id) {
        Session session = sessionFactory.openSession();
        CarModel model = session.get(CarModel.class, id);
        session.getTransaction().begin();
        session.remove(model);
        session.close();
    }

}
