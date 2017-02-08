package lab4;

/**
 * This class is the startup class for the program. But together with the 
 * other classes provided it is not a particularly good simulation of the 
 * real world. Employees don't just hire themselves and them tell themselves
 * to go through orientation. There's usually a company and a HR person involved.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.02
 */
public class Startup {
    public static void main(String[] args) {

    Company c = new Company();
    // testing
    c.hireEmployee("Tom", "First", "111-11-1111");
    c.hireEmployee("Jim", "Second", "222-22-2222");
    c.hireEmployee("Bob", "Third", "333-33-3333");
    
    c.getHrEmployee().outputEmployee("222-22-2222");
    
    }
}
