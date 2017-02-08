package lab4;

import java.util.ArrayList;
import java.util.List;


public class HrEmployee {
    private List<Employee> employeeList;
    private EmployeeReportService report;
    
    public HrEmployee(){
        employeeList = new ArrayList();
        report = new EmployeeReportService();
    }
    
    public void hireEmployee(String firstName, String lastName, String ssn){
        Employee e = new Employee(firstName, lastName, ssn);
        e.setFirstName(firstName); 
        e.setLastName(lastName); 
        e.setSsn(ssn);
        doEmployeeOrientation(e);
        employeeList.add(e);
        e.getReportService().outputReport();
        
    }

    public void doEmployeeOrientation(Employee e){
        e.doFirstTimeOrientation("111");
    }
        
    public void outputEmployee(String ssn){
            Employee placeholderEmployee = null; // storing object from employeeList that matches ssn

        for(Employee e : employeeList) {
            if(e.getSsn().equals(ssn)) {
                placeholderEmployee = e;
                break;
            }
        }      
              placeholderEmployee.getReportService().outputReport();
    }
    
                
       
}
