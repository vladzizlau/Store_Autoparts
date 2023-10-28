//package by.pvt.core.repository.manufacturer;
//
//import by.pvt.api.dto.carDTO.ManufacturerAKBResponse;
//import by.pvt.core.domain.shopDomain.ManufacturerAKB;
//import by.pvt.core.repository.IManufacturerAKBRepo;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class ManufacturerAKBRepo implements IManufacturerAKBRepo {
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    @Override
//    public void add(ManufacturerAKB manufacturerAKB) {
//        Session session = sessionFactory.openSession();
//        session.getTransaction().begin();
//        session.persist(manufacturerAKB);
//        session.getTransaction().commit();
//        session.close();
//    }
//
//    @Override
//    public List<ManufacturerAKBResponse> getAll() {
//        Session session = sessionFactory.openSession();
//        session.getTransaction().begin();
//        Query query = session.createQuery("select a from ManufacturerAKB a");
//        return (List<ManufacturerAKBResponse>) query.getResultList();
//    }
//
//    @Override
//    public void delete(long id) {
//        Session session = sessionFactory.openSession();
//        ManufacturerAKB akb = session.get(ManufacturerAKB.class, id);
//        session.getTransaction().begin();
//        session.remove(akb);
//        session.close();
//    }
//}
