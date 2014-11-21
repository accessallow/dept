
import java.io.Serializable;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.exception.spi.Configurable;

public class DataManager {

    private SessionFactory factory;

    public DataManager() {

        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Exception ex) {
            System.out.println("Data Manager >> Error in DataManager Constructor:" + ex);
        }

    }

    public void init() {
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Exception ex) {
            System.out.println("Data Manager >> Error in DataManager init:" + ex);
        }
    }

    public void add_a_student(Student s) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String roll_no = (String) session.save(s);
            System.out.println("Data Manager >> Student Saved roll_no = " + roll_no);
            tx.commit();
        } catch (Exception ex) {
            System.out.println("Data Manager >> Could not save student roll_no = " + s);
        } finally {
            session.close();
        }
    }

    public void update_a_student(Student s) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            // Student s1 = (Student) session.get(Student.class, s.getRoll_number());
            session.update(s);
            System.out.println("Data Manager >> Student updated roll_no = " + s.getRoll_number());
            tx.commit();
        } catch (Exception ex) {
            System.out.println("Data Manager >> Could not updated student roll_no = " + s.getRoll_number());
        } finally {
            session.close();
        }
    }

    public void delete_a_student(String roll_no) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Student s = (Student) session.get(Student.class, roll_no);
            session.delete(s);
            System.out.println("Data Manager >> Student deleted roll_no = " + roll_no);
            tx.commit();
        } catch (Exception ex) {
            System.out.println("Data Manager >> Could not delete student roll_no = " + roll_no);
        } finally {
            session.close();
        }
    }

    public Student get_a_student(String roll_no) {
        Session session = factory.openSession();
        Student s = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            s = (Student) session.get(Student.class, roll_no);
            System.out.println("Data Manager >> Student fetched roll_no = " + roll_no);
            tx.commit();
            return s;
        } catch (Exception ex) {
            System.out.println("Data Manager >> Could not fetch student roll_no = " + roll_no);
        } finally {
            session.close();
        }
        return s;
    }

    public List get_selected_sem_students(int semester) {

        Session session = factory.openSession();
        List results = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String hql = "FROM Student S WHERE S.semester =" + semester;
            Query query = session.createQuery(hql);
            results = query.list();
            System.out.println("Data Manager >> List fetched  = " + semester);
            tx.commit();
            return results;
        } catch (Exception ex) {
            System.out.println("Data Manager >> Could not fetch list semester = " + semester);
        } finally {
            session.close();
        }
        return results;
    }

}
