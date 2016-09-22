package controller;

import dao.EmployeeTest;
import domain.Employee;

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
        EmployeeTest employeeTest = new EmployeeTest();
        System.out.println("get");
        employeeTest.get();
        System.out.println("get");
        System.out.println("=============");
        System.out.println("load");
        Employee employee = employeeTest.load();
        System.out.println(employee);
        System.out.println("load");
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
