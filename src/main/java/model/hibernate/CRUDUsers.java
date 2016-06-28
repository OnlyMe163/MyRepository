package model.hibernate;

import model.hibernate.dao.UsersDAO;
import model.hibernate.dao.UsersEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by Дмитрий on 28.06.2016.
 */
public class CRUDUsers implements UsersDAO {
    @Override
    public void addUser() {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();

        UsersEntity user = new UsersEntity();
        user.setLogin("login3");
        user.setPassword("pass");

        session.save(user);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void editUser(UsersEntity oldUser, UsersEntity newUser) {

    }

    @Override
    public boolean deleteUser(UsersEntity user) {
        return false;
    }

    @Override
    public boolean deleteAllUsers() {

        return false;
    }

    @Override
    public UsersEntity getUser(String login) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM UsersEntity WHERE login = :paramLogin");
        query.setParameter("paramLogin", login);
        List<UsersEntity> list = query.getResultList();
        session.getTransaction().commit();
        session.close();

        return list.get(0);
    }

    @Override
    public List<UsersEntity> getAllUsers() {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("From UsersEntity");
        List<UsersEntity> list = query.getResultList();
        session.getTransaction().commit();
        session.close();
        return list;
    }
}
