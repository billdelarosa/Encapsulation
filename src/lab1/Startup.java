package lab1;


public class Startup {
    
    public static void main(String[] args) {
        
        Employee employee = new Employee();
        employee.setSsn("555");
        System.out.println(employee.getSsn());
    }
}
