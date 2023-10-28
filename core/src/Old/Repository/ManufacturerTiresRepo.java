//package by.pvt.core.repository.manufacturer;
//
//import by.pvt.api.dto.carDTO.ManufacturerTireResponse;
//import by.pvt.core.domain.shopDomain.ManufacturerTires;
//import by.pvt.core.repository.IManufacturerTiresRepo;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class ManufacturerTiresRepo implements IManufacturerTiresRepo {
//    @Autowired
//    private SessionFactory sessionFactory;
//    @Override
//    public void add(ManufacturerTires tires) {
//        Session session = sessionFactory.openSession();
//        session.getTransaction().begin();
//        session.persist(tires);
//        session.getTransaction().commit();
//        session.close();
//    }
//
//    @Override
//    public List<ManufacturerTireResponse> getAll() {
//        Session session = sessionFactory.openSession();
//        session.getTransaction().begin();
//        Query query = session.createQuery("select a from ManufacturerTires a");
//        return (List<ManufacturerTireResponse>) query.getResultList();
//    }
//
//
//    @Override
//    public void delete(long id) {
//        Session session = sessionFactory.openSession();
//        ManufacturerTires tires = session.get(ManufacturerTires.class, id);
//        session.getTransaction().begin();
//        session.remove(tires);
//        session.close();
//    }
//}
