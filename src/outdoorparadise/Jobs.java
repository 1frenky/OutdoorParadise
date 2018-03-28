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
public class Jobs {

    private final StringProperty job_id;
    private final StringProperty job_number;
    private final StringProperty job_title;
    private final StringProperty min_salary;
    private final StringProperty max_salary;
  

    public Jobs(String job_id, String job_number, String job_title, String min_salary, String max_salary) {
        this.job_id = new SimpleStringProperty(job_id);
        this.job_number = new SimpleStringProperty(job_number);
        this.job_title = new SimpleStringProperty(job_title);
        this.min_salary = new SimpleStringProperty(min_salary);
        this.max_salary = new SimpleStringProperty(max_salary);
        

    }

    //Gettets  
    public String getJob() {
        return job_id.get();
    }

    public String getJobNum() {
        return job_number.get();
    }

    public String getJobTitle() {
        return job_title.get();
    }

    public String getMinSal() {
        return min_salary.get();
    }

    public String getMaxSal() {
        return max_salary.get();
    }
    
  

    //Setters
    public void setJob(String value) {
        job_id.set(value);
    }

    public void setJobNum(String value) {
        job_number.set(value);
    }

    public void setJobTitle(String value) {
        job_title.set(value);
    }

    public void setMinSal(String value) {
        min_salary.set(value);
    }

    public void setMaxSal(String value) {
        max_salary.set(value);
    }
    
    

    //Property Value
    public StringProperty JobIDProp() {
        return job_id;
    }

    public StringProperty JobNumProp() {
        return job_number;
    }

    public StringProperty JobTitleProp() {
        return job_title;
    }

    public StringProperty MinSalaryProp() {
        return min_salary;
    }

    public StringProperty MaxSalaryProp() {
        return max_salary;
    }

    
}
