package lab4;


public class Company {
    private HrEmployee hr;
    
    public Company(){
        hr = new HrEmployee();
    }
    
    public void hireEmployee(String firstName, String lastName, String ssn){
        hr.hireEmployee(firstName, lastName, ssn);
    }
    
    
    public void setHrEmployee(HrEmployee hr){
        this.hr = hr;
    }
    
    public HrEmployee getHrEmployee(){
        return hr;
    }
    
    
}
