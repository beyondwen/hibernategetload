package controller;

import dao.EmployeeTest;
import domain.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lenovo on 2016/09/22.
 */
@WebServlet("/emp")
public class EmployeeServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       /* EmployeeTest employeeTest = new EmployeeTest();
        System.out.println("get");
        Employee employee = employeeTest.get();
        System.out.println(employee.getId());
        System.out.println("get");
        System.out.println("=============");
        System.out.println("load");
        Employee employee1 = employeeTest.load();
        System.out.println(employee1.getId());
        System.out.println(employee1.getName());
        System.out.println("load");
        req.getRequestDispatcher("/index.jsp").forward(req, resp);*/

        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Employee employee = session.get(Employee.class, 10L);
        //Employee employee1 = session.load(Employee.class, 10L);
        System.out.println(employee);
        session.close();
        //System.out.println(employee1.getName());
    }
}
