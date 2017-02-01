package lab2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In this lab focus on METHOD encapsulation and fix/add code as necessary.
 * Pay special attention to the following issues:
 *    1. Not all methods need to be public
 *    2. When methods need to be called in a certain order you can do this
 *       by creating a parent method that calls the other, helper methods.
 *    3. There is some duplicate code used that violates the D.R.Y. principle.
 *       Eliminate that by encapsulating the duplicate code in a new method
 *       and then call that method in place of the duplicate code
 *    4. All method parameters should be validated.
 * 
 * Review the tips in the document "EncapCheckList.pdf" if needed.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.02
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private Date orientationDate;

    public Employee(String firstName, String lastName, String ssn) {
        
        if (validateString(firstName)){
        this.firstName = firstName;
        }
        if (validateString(lastName)){
        this.lastName = lastName;
        }
        if (ssnValidate(ssn)){
        this.ssn = ssn;
        }
    }

    // Assume this must be performed first, and assume that an employee
    // would only do this once, upon being hired.
    private void meetWithHrForBenefitAndSalryInfo() {
        metWithHr = true;
        orientationActivityCompleted("met with HR for benefit and salary information");
    }

    // Assume this must be performed first, and assume that an employee
    // would only do this once, upon being hired.:
    private void meetDepartmentStaff() {
        metDeptStaff = true;
        orientationActivityCompleted("met with department staff");
    }

    // Assume this must be performed third. And assume that because department
    // policies may change that this method may need to be called 
    // independently from other classes.
    public void reviewDeptPolicies() {
        reviewedDeptPolicies = true;
        orientationActivityCompleted("reviewed department policies");
    }

    // Assume this must be performed 4th. And assume that because employees
    // sometimes change office locations that this method may need to be called 
    // independently from other classes.
    public void moveIntoCubicle(String cubeId) {
        this.cubeId = cubeId;
        this.movedIn = true;
        orientationActivityCompleted("moved into cubicle");
    }

    private void orientationActivityCompleted(String orientationActivityCompleted){
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(orientationDate);       
        System.out.println(firstName + " " + lastName + orientationActivityCompleted + " on "
            + fmtDate);
    }
    
    private boolean ssnValidate(String ssn){
    boolean ssnValidate = false;
        
    if (ssn == null || ssn.isEmpty() || ssn.length() != 9) {
        return ssnValidate;
        } 
        ssnValidate = true;
        return ssnValidate;
        }

    
    private boolean validateString(String name){
        boolean nameValidate = false;
        
        if (name == null || name.isEmpty() || name.length() < 3) {
            outputError();
            return nameValidate;
        } 
        nameValidate = true;
        return nameValidate;
    }
    
    public void performOrientation(String cubeID){
        if (orientationDate == null){
            outputError();
            return;
        }
        meetWithHrForBenefitAndSalryInfo();
        meetDepartmentStaff();
        reviewDeptPolicies();
        moveIntoCubicle(cubeID);
    }
    
    

    
    private void outputError() {
        System.out.println("Your input was invalid.");
    }
    
    public String getFirstName() {
        return firstName;
    }

    // setter methods give the developer the power to control what data is
    // allowed through validation.
    
    
    public void setFirstName(String firstName) {
        if (validateString(firstName)) {
        this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (validateString(lastName)) {
        this.lastName = lastName;
        }
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        if (!ssnValidate(ssn)){
            return;
        }
        this.ssn=ssn;
    }
    

    public boolean isMetWithHr() {
        return metWithHr;
    }

    // boolean parameters need no validation
    public void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    public void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
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
    }}
