package by.pvt.core.repository;

import by.pvt.api.dto.shopDTO.UserResponse;
import by.pvt.core.config.HibernateConfig;
import by.pvt.core.domain.User;
import by.pvt.core.repository.interfaceRepository.UserInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class UserRepository implements UserInterface
    {
    private final SessionFactory sessionFactory;

    public UserRepository()
        {
        sessionFactory = HibernateConfig.getSessionFactory();
        }


    @Override
    public void addUser(User user)
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(user);
        session.getTransaction().commit();
        session.close();
        }

    @Override
    public List<User> getAllUsers()
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("select u from User u");
        return (List<User>) query.getResultList();
        }

    @Override
    public User findById(Long userID)
        {
        Session session = sessionFactory.openSession();
        return session.get(User.class, userID);
        }

    @Override
    public void updateUser(User user)
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.update(user);
        session.getTransaction().commit();
        session.close();
        }

    @Override
    public void delUser(long id)
        {
        Session session = sessionFactory.openSession();
        User user = session.get(User.class, id);
        session.getTransaction().begin();
        session.remove(user);
        session.close();
        }


    }
