package ee.task3.dao.implementation;

import ee.task3.dao.DaoFactory;
import ee.task3.entities.Group;
import ee.task3.factory.HibernateSessionFactory;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class ImplementGroupModel implements DaoFactory<Group> {
    @Override
    public void addObjects(Group group) {
        Session session = null;
        try {
            session = HibernateSessionFactory.getSessionFactory().openSession();
            session.beginTransaction();

            SQLQuery querySelect = session.createSQLQuery("SELECT * FROM groups WHERE name = :name");
            querySelect.setParameter("name", group.getName());

            if(querySelect.list().size() != 0 ){
                throw new Exception();
            }

            SQLQuery queryInsert = session.createSQLQuery("INSERT INTO groups (name) VALUES (:name)");
            queryInsert.setParameter("name", group.getName());
            queryInsert.executeUpdate();

            session.getTransaction().commit();

        } catch (Exception ex) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public List<Group> getAllObjects() {
        SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Group> groups = null;

        try {
            session.beginTransaction();

            SQLQuery querySelect = session.createSQLQuery("SELECT * FROM groups");
            querySelect.addEntity(Group.class);
            groups = querySelect.list();

            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
        } finally {
            session.close();
            sessionFactory.close();
        }
        return groups;
    }
}
