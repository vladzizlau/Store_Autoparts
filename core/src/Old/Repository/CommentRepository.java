//package by.pvt.core.repository.Old;
//
//import by.pvt.api.dto.shopDTO.CommentResponse;
//import by.pvt.core.domain.Comments;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//@Repository
//public class CommentRepository implements CommentInterface {
//    @Autowired
//    private SessionFactory sessionFactory;
//    @Override
//    public void addcomment(Comments comm)
//    {
//        Session session = sessionFactory.openSession();
//        session.getTransaction().begin();
//        session.persist(comm);
//        session.getTransaction().commit();
//        session.close();
//    }
//
//    @Override
//    public List<CommentResponse> getAllComment()
//    {
//        Session session = sessionFactory.openSession();
//        session.getTransaction().begin();
//        Query query = session.createQuery("select c from Comments c");
//        return (List<CommentResponse>) query.getResultList();
//    }
//
//    @Override
//    public CommentResponse findById(Long commID)
//    {
//        Session session = sessionFactory.openSession();
//        return session.get(CommentResponse.class, commID);
//    }
//
//    @Override
//    public void updateComment(Comments comments)
//    {
//        Session session = sessionFactory.openSession();
//        session.getTransaction().begin();
//        session.update(comments);
//        session.getTransaction().commit();
//        session.close();
//    }
//
//    @Override
//    public void delComment(long id)
//    {
//        Session session = sessionFactory.openSession();
//        Comments comm = session.get(Comments.class, id);
//        session.getTransaction().begin();
//        session.remove(comm);
//        session.close();
//    }
//
//    public List<CommentResponse> getAllCommentByUserId(Long userId) {
//
//        Session session = sessionFactory.openSession();
//        Query query = session.createQuery("select c from Comments c where user_id = :userId");
//        query.setParameter("userId", userId);
//        return (List<CommentResponse>) query.getResultList();
//    }
//}
