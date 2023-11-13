//package by.pvt.core.repository.Old;
//
//import by.pvt.api.dto.shopDTO.OrderResponse;
//import by.pvt.core.domain.Order;
//import by.pvt.core.repository.OrderInterface;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//@Repository
//public class OrderRepository implements OrderInterface
//    {
//        @Autowired
//    private SessionFactory sessionFactory;
//    @Override
//    public void addOrder(Order order)
//        {
//        Session session = sessionFactory.openSession();
//        session.getTransaction().begin();
//        session.persist(order);
//        session.getTransaction().commit();
//        session.close();
//        }
//
//    @Override
//    public List<OrderResponse> getAllOrder()
//        {
//        Session session = sessionFactory.openSession();
//        session.getTransaction().begin();
//        Query query = session.createQuery("select a from Order a");
//        return (List<OrderResponse>) query.getResultList();
//        }
//
//    @Override
//    public OrderResponse findById(Long orderID)
//        {
//        Session session = sessionFactory.openSession();
//        return session.get(OrderResponse.class, orderID);
//        }
//
//    @Override
//    public void updateOrder(Order order)
//        {
//        Session session = sessionFactory.openSession();
//        session.getTransaction().begin();
//        session.update(order);
//        session.getTransaction().commit();
//        session.close();
//        }
//
//    @Override
//    public void delOrder(Order order)
//        {
//        Session session = sessionFactory.openSession();
//        Order order1 = session.get(Order.class, order.getId());
//        session.getTransaction().begin();
//        session.remove(order1);
//        session.close();
//        }
//    }
