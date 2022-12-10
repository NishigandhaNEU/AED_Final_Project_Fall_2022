/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author Nishigandha
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeArrayList;

    public EmployeeDirectory() {
        employeeArrayList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeArrayList;
    }
    
    public Employee createEmp(String empName){
        Employee employee = new Employee();
        employee.setEmpName(empName);
        employeeArrayList.add(employee);
        return employee;
    }
    public void updateEmp(Employee employee, String empName){
        employee.setEmpName(empName);
    }
}