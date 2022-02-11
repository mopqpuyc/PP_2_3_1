package crud.dao;

import crud.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void createUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public User showUser(Long id) {
        Query query = entityManager.createQuery("select u from User u where u.id = :id");
        query.setParameter("id", id);
        return (User)query.getSingleResult();
    }

    @Override
    public List<User> showAllUsers() {
        return entityManager.createQuery("select u from User u").getResultList();
    }

    @Override
    public void editUser(Long id, User user) {
        User userToUpdate = showUser(id);
        userToUpdate.setName(user.getName());
        userToUpdate.setAge(user.getAge());
    }

    @Override
    public void deleteUser(Long id) {
        entityManager.remove(showUser(id));
    }
}
