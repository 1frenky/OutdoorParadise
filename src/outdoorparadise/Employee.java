/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outdoorparadise;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * ladenBtn
 *
 * @author mlk_s
 */
public class Employee {

    private final StringProperty employee_id;
    private final StringProperty manager_id;
    private final StringProperty department_id;
    private final StringProperty benefit_id;
    private final StringProperty job_id;
    private final StringProperty adress_id;
    private final StringProperty fname;
    private final StringProperty lname;
    private final StringProperty private_phone;
    private final StringProperty status;
    private final StringProperty ss_number;
    private final StringProperty start_date;
    private final StringProperty termination_date;
    private final StringProperty birth_date;
    private final StringProperty sex;
    private final StringProperty email;

    public Employee(String employee_id, String manager_id, String department_id, String benefit_id, String job_id, String adress_id, String fname, String lname, String private_phone, String status, String ss_number, String start_date, String termination_date, String birth_date, String sex, String email) {
        this.employee_id = new SimpleStringProperty(employee_id);
        this.manager_id = new SimpleStringProperty(employee_id);
        this.department_id = new SimpleStringProperty(employee_id);
        this.benefit_id = new SimpleStringProperty(employee_id);
        this.job_id = new SimpleStringProperty(employee_id);
        this.adress_id = new SimpleStringProperty(employee_id);
        this.fname = new SimpleStringProperty(employee_id);
        this.lname = new SimpleStringProperty(employee_id);
        this.private_phone = new SimpleStringProperty(employee_id);
        this.status = new SimpleStringProperty(employee_id);
        this.ss_number = new SimpleStringProperty(employee_id);
        this.start_date = new SimpleStringProperty(employee_id);
        this.termination_date = new SimpleStringProperty(employee_id);
        this.birth_date = new SimpleStringProperty(employee_id);
        this.sex = new SimpleStringProperty(employee_id);
        this.email = new SimpleStringProperty(employee_id);
    }

    //Gettets  
    public String getDepartment() {
        return department_id.get();
    }

    public String getBenefit() {
        return benefit_id.get();
    }

    public String getJob() {
        return job_id.get();
    }

    public String getAdress() {
        return adress_id.get();
    }

    public String getFname() {
        return fname.get();
    }

    public String getTermination() {
        return termination_date.get();
    }

    public String getPhone() {
        return private_phone.get();
    }

    public String getManager() {
        return manager_id.get();
    }

    public String getStatus() {
        return status.get();
    }

    public String getNumber() {
        return ss_number.get();
    }

    public String getDate() {
        return start_date.get();
    }

    public String getLname() {
        return lname.get();
    }

    public String getSex() {
        return sex.get();
    }

    public String getEmail() {
        return email.get();
    }

    public String getEmployee() {
        return employee_id.get();
    }

    public String getBirth() {
        return birth_date.get();
    }

    //Setters
    public void setDepartment(String value) {
        department_id.set(value);
    }

    public void setBenefit(String value) {
        benefit_id.set(value);
    }

    public void setJob(String value) {
        job_id.set(value);
    }

    public void setAdress(String value) {
        adress_id.set(value);
    }

    public void setFname(String value) {
        fname.set(value);
    }

    public void setLname(String value) {
        lname.set(value);
    }

    public void setTermination(String value) {
        termination_date.set(value);
    }

    public void setPhone(String value) {
        private_phone.set(value);
    }

    public void setManager(String value) {
        manager_id.set(value);
    }

    public void setStatus(String value) {
        status.set(value);
    }

    public void setNumber(String value) {
        ss_number.set(value);
    }

    public void setDate(String value) {
        start_date.set(value);
    }

    public void setSex(String value) {
        sex.set(value);
    }

    public void setEmail(String value) {
        email.set(value);
    }

    public void setBirth(String value) {
        birth_date.set(value);
    }

    public void setEmployee(String value) {
        employee_id.set(value);
    }

    //Property Value
    public StringProperty DepartmentProp() {
        return department_id;
    }

    public StringProperty BenefitProp() {
        return benefit_id;
    }

    public StringProperty JobProp() {
        return job_id;
    }

    public StringProperty AdressProp() {
        return adress_id;
    }

    public StringProperty FnameProp() {
        return fname;
    }

    public StringProperty LnameProp() {
        return lname;
    }

    public StringProperty TerminationProp() {
        return termination_date;
    }

    public StringProperty PhoneProp() {
        return private_phone;
    }

    public StringProperty EmployeeProp() {
        return employee_id;
    }

    public StringProperty ManagerProp() {
        return manager_id;
    }

    public StringProperty StatusProp() {
        return status;
    }

    public StringProperty BirthProp() {
        return birth_date;
    }

    public StringProperty DateProp() {
        return start_date;
    }

    public StringProperty NumberProp() {
        return ss_number;
    }

    public StringProperty SexProp() {
        return sex;
    }

    public StringProperty EmailProp() {
        return email;
    }

}
