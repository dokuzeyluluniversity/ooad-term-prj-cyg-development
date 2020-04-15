package sample.Interfaces;

import sample.company.Employee;

public interface StaffManager {
    /**
     *     Adds a new employee
     */
    public void addEmployee​ (Employee employee);
    /**
     *    Removes an employee
     */
    public void removeEmployee​ (Employee employee);
    /**
     *    Edits an employee
     */
    public void editEmployee​ (Employee employee);
    /**
     *    Finds and returns employee with specified ID
     */
    public Employee searchEmployee​(int employeeID);
}
