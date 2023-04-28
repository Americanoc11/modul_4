package Dao;

import model.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements IUserDao {
    private static final String SELECT_ALL_USER = "select * from users where is_user=1;";
    private static final String SELECT_ALL_USER_OFF = "select * from users where is_user=0;";
    private static final String SELECT_BY_ID = "select id_users,name_users,email,country from users where id_users=?;";
    private static final String INSERT_VALUE = "insert into users(name_users,email,country) value (?,?,?);";
    private static final String UPDATE_USER = "update users set name_users=?,email=?,country=? where id_users=?;";

    private static final String DELETED_BY_ID =
            "update users set is_user=0 where id_users= ?;";


    @Override
    public List<User> findAll() {
        System.out.println(SELECT_ALL_USER);
        List<User> userList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = BaseConnection.getConnection().prepareStatement(SELECT_ALL_USER);
            User user;
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id_users"));
                user.setName(resultSet.getString("name_users"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    @Override
    public void save(User user) {
        System.out.println(INSERT_VALUE);
        try {
            PreparedStatement preparedStatement = BaseConnection.getConnection().prepareStatement(INSERT_VALUE);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User delete(int id) {
        System.out.println(DELETED_BY_ID);
        try {
            PreparedStatement preparedStatement = BaseConnection.getConnection().prepareStatement(DELETED_BY_ID);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> findAllOff() {
        System.out.println(SELECT_ALL_USER_OFF);
        List<User> userList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = BaseConnection.getConnection()
                    .prepareStatement(SELECT_ALL_USER_OFF);
            User user;
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id_users"));
                user.setName(resultSet.getString("name_users"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    @Override
    public User findById(int id) {
        System.out.println(SELECT_BY_ID);
        User user = null;
        try {
            PreparedStatement preparedStatement = BaseConnection.getConnection().prepareStatement(SELECT_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                user = new User();
                user.setName(resultSet.getString("name_users"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                return user;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(User user) {
        System.out.println(UPDATE_USER);
        try {
            PreparedStatement preparedStatement = BaseConnection.getConnection().prepareStatement(UPDATE_USER);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            preparedStatement.setInt(4, user.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
