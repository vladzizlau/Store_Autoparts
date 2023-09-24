package by.pvt.core.repository;

import by.pvt.core.config.HibernateConfig;
import by.pvt.core.domain.shopDomain.AKB;
import by.pvt.core.repository.interfaceRepository.AKBInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class AKBRepository implements AKBInterface
    {

    private final SessionFactory sessionFactory;
    public AKBRepository() {
    sessionFactory = HibernateConfig.getSessionFactory();
    }
    @Override
    public void addAKB(AKB akb)
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(akb);
        session.getTransaction().commit();
        session.close();
        }

    @Override
    public List<AKB> getAllAKB()
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("select a from AKB a");
        return (List<AKB>) query.getResultList();
        }

    @Override
    public AKB findById(Long akbID)
        {
        Session session = sessionFactory.openSession();
        return session.get(AKB.class, akbID);
        }

    @Override
    public void updateAKB(AKB akb)
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.update(akb);
        session.getTransaction().commit();
        session.close();
        }

    @Override
    public void delAKB(long id)
        {
        Session session = sessionFactory.openSession();
        AKB akb = session.get(AKB.class, id);
        session.getTransaction().begin();
        session.remove(akb);
        session.close();
        }
    }
