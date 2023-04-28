package Dao;

import model.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();

    void save(User user);

    User delete(int id);

    List<User> findAllOff();

    User findById(int id);

    void update(User user);
}
