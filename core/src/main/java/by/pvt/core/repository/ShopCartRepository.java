package by.pvt.core.repository;

import by.pvt.api.dto.shopDTO.ShopcartResponse;
import by.pvt.core.config.HibernateConfig;
import by.pvt.core.domain.Shopcart;
import by.pvt.core.repository.interfaceRepository.ShopcartInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ShopCartRepository implements ShopcartInterface {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addShopcart(Shopcart shopcart) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(shopcart);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<ShopcartResponse> getAllShopcart() {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("select a from Shopcart a");
        return (List<ShopcartResponse>) query.getResultList();
    }

    @Override
    public ShopcartResponse findById(Long shopcartID) {
        Session session = sessionFactory.openSession();
        return session.get(ShopcartResponse.class, shopcartID);
    }

    @Override
    public void updateShopcart(Shopcart shopcart) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.update(shopcart);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delShopcart(long id) {
        Session session = sessionFactory.openSession();
        Shopcart shopcart = session.get(Shopcart.class, id);
        session.getTransaction().begin();
        session.remove(shopcart);
        session.close();
    }
}
