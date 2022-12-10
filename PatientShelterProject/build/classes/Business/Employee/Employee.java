/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author Nishigandha
 */
public class Employee {
    
    private String empName;
    private int id;
    private static int counter = 1;

    public Employee() {
        id = counter;
        counter++;
    }

    public int getId() {
        return id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    

    @Override
    public String toString() {
        return empName;
    }
    
    
}
