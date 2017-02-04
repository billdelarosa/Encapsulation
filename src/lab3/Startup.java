/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Billy-Mac
 */
public class Startup {
    public static void main(String[] args) {
        
        Employee employee = new Employee("William", "Delarosa", "555-55-5555");
        employee.doFirstTimeOrientation("100");
        employee.getReportService().outputReport();
    }
}
