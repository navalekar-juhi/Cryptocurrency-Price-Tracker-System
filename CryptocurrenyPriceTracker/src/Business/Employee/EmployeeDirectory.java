/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
        private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
    public boolean searchEmployee(String name){
        boolean status=false;
        
        for(Employee a:employeeList)
        {
            if(a.getName().equalsIgnoreCase(name))
            {
               return true;  
            }
           
        }
        return false;
    }
}