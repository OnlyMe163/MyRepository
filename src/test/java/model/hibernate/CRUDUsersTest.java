package model.hibernate;

import model.hibernate.dao.UsersDAO;
import org.junit.Test;

public class CRUDUsersTest {

    @Test
    public void testGetUserNPT() throws Exception {
        UsersDAO usersDAO = new CRUDUsers();
        usersDAO.getUser(null);

    }
}