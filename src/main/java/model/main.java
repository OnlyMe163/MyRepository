package model;

import model.hibernate.CRUDUsers;
import model.hibernate.dao.UsersDAO;

/**
 * Created by Дмитрий on 28.06.2016.
 */
public class main {

    public static void main(String[] args) {
        UsersDAO users = new CRUDUsers();
        System.out.println(users.getUser("login"));
    }
}
