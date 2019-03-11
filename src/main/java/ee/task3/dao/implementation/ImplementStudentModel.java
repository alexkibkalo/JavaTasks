package ee.task3.dao.implementation;

import ee.task3.dao.DaoFactory;
import ee.task3.entities.Student;
import ee.task3.factory.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;

import java.util.ArrayList;
import java.util.List;

public class ImplementStudentModel implements DaoFactory<Student> {
    @Override
    public void addObjects(Student stud) {
        Session session = null;
        try {
            session = HibernateSessionFactory.getSessionFactory().openSession();
            session.beginTransaction();
            List<Student> students = (List<Student>) session.createCriteria(Student.class)
                    .add(Expression.eq("name", stud.getName())).list();
            if(students.size() != 0){
                throw new Exception();
            }
            session.save(stud);
            session.getTransaction().commit();
        }
        catch (Exception e) {
            session.getTransaction().rollback();
        }
        finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Student> getAllObjects() {
        Session session = null;
        List<Student> studs = new ArrayList<>();
        try {
            session = HibernateSessionFactory.getSessionFactory().openSession();
            studs = (List<Student>) session.createCriteria(Student.class).list();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return studs;
    }
}