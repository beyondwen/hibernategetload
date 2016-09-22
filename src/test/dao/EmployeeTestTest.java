package dao;

import domain.Employee;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lenovo on 2016/09/22.
 */
public class EmployeeTestTest {
    @Test
    public void get() throws Exception {
        EmployeeTest employeeTest = new EmployeeTest();
        Employee employee = employeeTest.get();
        System.out.println(employee);
    }

}