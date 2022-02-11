package crud.dao;

import crud.model.User;

import java.util.List;

public interface UserDao {
    void createUser(User user);
    User showUser(Long id);
    List<User> showAllUsers();
    void editUser(Long id, User user);
    void deleteUser(Long id);
}
