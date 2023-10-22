package by.pvt.core.repository;

import by.pvt.api.dto.carDTO.BodypartResponse;
import by.pvt.core.config.HibernateConfig;
import by.pvt.core.domain.shopDomain.BodyPart;
import by.pvt.core.repository.interfaceRepository.BodyPartInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
@Repository
public class BodyPartRepository implements BodyPartInterface
    {
    private final SessionFactory sessionFactory;

    public BodyPartRepository() {
    sessionFactory = HibernateConfig.getSessionFactory();
    }
    @Override
    public void addBodyPart(BodyPart parts)
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(parts);
        session.getTransaction().commit();
        session.close();
        }

    @Override
    public List<BodypartResponse> getAllBodyParts()
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("select a from BodyPart a");
        return (List<BodypartResponse>) query.getResultList();
        }

        public List<BodypartResponse> getBodypartByModel(Long modelid)
        {
            Session session = sessionFactory.openSession();
            session.getTransaction().begin();
            Query query = session.createQuery("select a from BodyPart a where model_id = :modelID").setParameter("modelID", modelid);
            return (List<BodypartResponse>) query.getResultList();
        }
        public List<BodypartResponse> getBydypartByPrice(BigDecimal start, BigDecimal end) {
            Session session = sessionFactory.openSession();
            session.getTransaction().begin();
            Query query = session.createQuery("select a from BodyPart a where a.cost >= :start AND a.cost <= :end");
            query.setParameter("start", start);
            query.setParameter("end", end);
            return (List<BodypartResponse>) query.getResultList();
        }

    @Override
    public BodypartResponse findById(Long partsID)
        {
        Session session = sessionFactory.openSession();
        return session.get(BodypartResponse.class, partsID);
        }

    @Override
    public void updateBodyPart(BodyPart part)
        {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.update(part);
        session.getTransaction().commit();
        session.close();
        }

    @Override
    public void delBodyPart(long id)
        {
        Session session = sessionFactory.openSession();
        BodyPart bodyPart = session.get(BodyPart.class, id);
        session.getTransaction().begin();
        session.remove(bodyPart);
        session.close();
        }
    }
