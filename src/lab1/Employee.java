package lab1;

import java.util.Date;

/**
 * Fix the code in this class to do PROPERTY encapsulation correctly. Also
 * consider if any of the properties should be mandatory and use a 
 * constructor to enforce that. Review the tips in the document 
 * "EncapCheckList.pdf" if needed.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.02
 */
public class Employee {
    public final String COMPANY_NAME = "Acme";
    private String firstName;
    private String lastName;
    private String ssn;
    boolean metWithHr;
    boolean metDeptStaff;
    boolean reviewedDeptPolicies;
    boolean movedIn;
    private String cubeId;
    private Date orientationDate;

    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty() || firstName.length() < 3){
            System.out.println("Enter a valid first name.");
            return;
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty() || lastName.length() < 3){
            System.out.println("Enter a valid first name.");
            return;
        }
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        if (ssn == null || ssn.length() != 9) {
            System.out.println("Enter a valid SSN.");
            return;
        }
        this.ssn = ssn;
    }

    public String getCubeId() {
        return cubeId;
    }

    public void setCubeId(String cubeId) {
        this.cubeId = cubeId;
    }

    public Date getOrientationDate() {
        return orientationDate;
    }

    public void setOrientationDate(Date orientationDate) {
        this.orientationDate = orientationDate;
    }



}
