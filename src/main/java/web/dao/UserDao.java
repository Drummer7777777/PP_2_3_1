package web.dao;

import java.util.List;
import web.models.User;

public interface UserDao {
    List<User> listUsers();
    void add(User user);
    void remove(int id);
    void edit(User user);
    User getById(int id);
}
