package by.pvt.core.repository;

import by.pvt.core.config.HibernateConfig;
import by.pvt.core.domain.Order;
import by.pvt.core.repository.interfaceRepository.OrderInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class OrderRepository implements OrderInterface
    {
    private final SessionFactory sessionFactory;
    public OrderRepository() {
    sessionFactory = HibernateConfig.getSessionFactory();
    }
    @Override
    public void addOrder(Order order)
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(order);
        session.getTransaction().commit();
        session.close();
        }

    @Override
    public List<Order> getAllOrder()
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("select a from Order a");
        return (List<Order>) query.getResultList();
        }

    @Override
    public Order findById(Long orderID)
        {
        Session session = sessionFactory.openSession();
        return session.get(Order.class, orderID);
        }

    @Override
    public void updateOrder(Order order)
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.update(order);
        session.getTransaction().commit();
        session.close();
        }

    @Override
    public void delOrder(Order order)
        {
        Session session = sessionFactory.openSession();
        Order order1 = session.get(Order.class, order.getId());
        session.getTransaction().begin();
        session.remove(order1);
        session.close();
        }
    }
