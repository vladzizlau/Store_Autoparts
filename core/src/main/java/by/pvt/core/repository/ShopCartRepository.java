package by.pvt.core.repository;

import by.pvt.core.config.HibernateConfig;
import by.pvt.core.domain.Shopcart;
import by.pvt.core.repository.interfaceRepository.ShopcartInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class ShopCartRepository implements ShopcartInterface
    {
    private final SessionFactory sessionFactory;
    public ShopCartRepository() {
    sessionFactory = HibernateConfig.getSessionFactory();
    }
    @Override
    public void addShopcart(Shopcart shopcart)
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(shopcart);
        session.getTransaction().commit();
        session.close();
        }

    @Override
    public List<Shopcart> getAllShopcart()
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("select a from Shopcart a");
        return (List<Shopcart>) query.getResultList();
        }

    @Override
    public Shopcart findById(Long shopcartID)
        {
        Session session = sessionFactory.openSession();
        return session.get(Shopcart.class, shopcartID);
        }

    @Override
    public void updateShopcart(Shopcart shopcart)
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.update(shopcart);
        session.getTransaction().commit();
        session.close();
        }

    @Override
    public void delShopcart(long id)
        {
        Session session = sessionFactory.openSession();
        Shopcart shopcart = session.get(Shopcart.class, id);
        session.getTransaction().begin();
        session.remove(shopcart);
        session.close();
        }
    }
