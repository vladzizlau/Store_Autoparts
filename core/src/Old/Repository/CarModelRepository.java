//package by.pvt.core.repository;
//
//import by.pvt.api.dto.carDTO.CarModelResponse;
//import by.pvt.core.config.HibernateConfig;
//import by.pvt.core.domain.shopDomain.Car;
//import by.pvt.core.domain.shopDomain.CarModel;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.criteria.CriteriaBuilder;
//import jakarta.persistence.criteria.CriteriaQuery;
//import jakarta.persistence.criteria.Join;
//import jakarta.persistence.criteria.Root;
//import java.util.List;
//@Repository
//public class CarModelRepository implements CarModelInterface {
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    @Override
//    public void addModel(CarModel carModel) {
//        Session session = sessionFactory.openSession();
//        session.getTransaction().begin();
//        session.persist(carModel);
//        session.getTransaction().commit();
//        session.close();
//    }
//
//    @Override
//    public List<CarModelResponse> getAllModel() {
//        Session session = sessionFactory.openSession();
//        session.getTransaction().begin();
//        Query query = session.createQuery("select a from CarModel a");
//        return (List<CarModelResponse>) query.getResultList();
//    }
//
//    @Override
//    public List<CarModel> getModelByBrand(Long brandId) {
//        EntityManager entityManager = sessionFactory.createEntityManager();
//        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
//        CriteriaQuery<CarModel> criteriaQuery = criteriaBuilder.createQuery(CarModel.class);
//        Root<CarModel> root = criteriaQuery.from(CarModel.class);
//        Join <CarModel, Car> carJoin = root.join("car");
//
//        criteriaQuery.where(criteriaBuilder.equal(carJoin.get("id"), brandId));
//        List<CarModel> u = (List<CarModel>) entityManager.createQuery(criteriaQuery).getResultList();
//        return u;
//
//    }
//
//    @Override
//    public CarModel getModelById(Long modelId) {
//        EntityManager entityManager = sessionFactory.createEntityManager();
//        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
//        CriteriaQuery<CarModel> criteriaQuery = criteriaBuilder.createQuery(CarModel.class);
//        Root<CarModel> root = criteriaQuery.from(CarModel.class);
//
//        criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("id"), modelId));
//        return entityManager.createQuery(criteriaQuery).getSingleResult();
//    }
//    @Override
//    public void updateModel(CarModel carmodel) {
//        Session session = sessionFactory.openSession();
//        session.getTransaction().begin();
//        session.update(carmodel);
//        session.getTransaction().commit();
//        session.close();
//    }
//
//    @Override
//    public void deleteModel(Long id) {
//        Session session = sessionFactory.openSession();
//        CarModel model = session.get(CarModel.class, id);
//        session.getTransaction().begin();
//        session.remove(model);
//        session.close();
//    }
//
//}
