//package by.pvt.core.repository.Old;
//
//import by.pvt.api.dto.shopDTO.UserResponse;
//import by.pvt.core.domain.User;
//import by.pvt.core.repository.UserInterface;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class UserRepository implements UserInterface {
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    @Override
//    public void addUser(User user) {
//        Session session = sessionFactory.openSession();
//        session.getTransaction().begin();
//        session.persist(user);
//        session.getTransaction().commit();
//        session.close();
//    }
//
//    @Override
//    public List<UserResponse> getAllUsers() {
//        Session session = sessionFactory.openSession();
//        session.getTransaction().begin();
//        Query query = session.createQuery("select u from User u");
//        return (List<UserResponse>) query.getResultList();
//    }
//
//    @Override
//    public UserResponse findById(Long userID) {
//        Session session = sessionFactory.openSession();
//        return session.get(UserResponse.class, userID);
//    }
//
//    @Override
//    public void updateUser(User user) {
//        Session session = sessionFactory.openSession();
//        session.getTransaction().begin();
//        session.update(user);
//        session.getTransaction().commit();
//        session.close();
//    }
//
//    @Override
//    public void delUser(long id) {
//        Session session = sessionFactory.openSession();
//        User user = session.get(User.class, id);
//        session.getTransaction().begin();
//        session.remove(user);
//        session.close();
//    }
//
//
//}
