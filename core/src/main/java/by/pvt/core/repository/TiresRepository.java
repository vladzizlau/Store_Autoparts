package by.pvt.core.repository;

import by.pvt.api.dto.carDTO.AkbResponse;
import by.pvt.api.dto.carDTO.TireResponse;
import by.pvt.core.config.HibernateConfig;
import by.pvt.core.domain.shopDomain.Tire;
import by.pvt.core.domain.shopDomain.TireType;
import by.pvt.core.repository.interfaceRepository.TiresInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.math.BigDecimal;
import java.util.List;

public class TiresRepository implements TiresInterface
    {
    private final SessionFactory sessionFactory;
    public TiresRepository() {
    sessionFactory = HibernateConfig.getSessionFactory();
    }
    @Override
    public void addTires(Tire tire)
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(tire);
        session.getTransaction().commit();
        session.close();
        }

    @Override
    public List<TireResponse> getAllTires()
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("select a from Tires a");
        return (List<TireResponse>) query.getResultList();
        }
        public List<TireResponse> getTirebyDiametr(int d) {
            Session session = sessionFactory.openSession();
            session.getTransaction().begin();
            Query query = session.createQuery("select a from Tire a where diametr = :diametr").setParameter("diametr", d);
            return (List<TireResponse>) query.getResultList();
        }

        public List<TireResponse> getTirebyWidth(int w) {
            Session session = sessionFactory.openSession();
            session.getTransaction().begin();
            Query query = session.createQuery("select a from Tire a where profile_width = :w").setParameter("w", w);
            return (List<TireResponse>) query.getResultList();
        }
        public List<TireResponse> getTirebyHeight(int h) {
            Session session = sessionFactory.openSession();
            session.getTransaction().begin();
            Query query = session.createQuery("select a from Tire a where profile_height = :h").setParameter("h", h);
            return (List<TireResponse>) query.getResultList();
        }
        public List<TireResponse> getTirebySeason(TireType type) {
            Session session = sessionFactory.openSession();
            session.getTransaction().begin();
            Query query = session.createQuery("select a from Tire a where season = :season").setParameter("season", type);
            return (List<TireResponse>) query.getResultList();
        }

        public List<TireResponse> getTireByPrice(BigDecimal start, BigDecimal end) {
            Session session = sessionFactory.openSession();
            session.getTransaction().begin();
            Query query = session.createQuery("select a from Tire a where a.price >= :start AND a.price <= :end");
            query.setParameter("start", start);
            query.setParameter("end", end);
            return (List<TireResponse>) query.getResultList();
        }

    @Override
    public TireResponse findById(Long tiresID)
        {
        Session session = sessionFactory.openSession();
        return session.get(TireResponse.class, tiresID);
        }

    @Override
    public void updateTires(Tire tire)
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.update(tire);
        session.getTransaction().commit();
        session.close();
        }

    @Override
    public void delTires(long id)
        {
        Session session = sessionFactory.openSession();
        Tire tire = session.get(Tire.class, id);
        session.getTransaction().begin();
        session.remove(tire);
        session.close();
        }
    }
