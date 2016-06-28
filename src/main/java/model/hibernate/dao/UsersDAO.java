package model.hibernate.dao;

import java.util.List;

/**
 * Created by Дмитрий on 28.06.2016.
 */
public interface UsersDAO {

    public void addUser();

    public void editUser(UsersEntity oldUser, UsersEntity newUser);

    public boolean deleteUser(UsersEntity user);

    public boolean deleteAllUsers();

    public UsersEntity getUser(String login);

    public List<UsersEntity> getAllUsers();

}
