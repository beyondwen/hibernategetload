package dao;

import domain.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by lenovo on 2016/09/22.
 */
public class EmployeeTest {
    public Employee get() {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Employee employee = session.get(Employee.class, 1L);
        return employee;
    }

    public Employee load() {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Employee employee = session.load(Employee.class, 1L);
        return employee;
    }
}
