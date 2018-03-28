package outdoorparadise;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**ladenBtn
 *
 * @author mlk_s
 */
public class Department {

    private final StringProperty department_id;
    private final StringProperty employee_id;
    private final StringProperty department_name;
  
   

    public Department(String department_id , String employee_id, String department_name ){
        this.department_id = new SimpleStringProperty(department_id );
        this.employee_id = new SimpleStringProperty(employee_id);
        this.department_name = new SimpleStringProperty(department_name);
     
        
    }

    //Gettets  
    public String getDepartment() {
        return department_id.get();
    }

    public String getEmployee() {
        return employee_id.get();
    }

    public String getDepName() {
        return department_name.get();
    }




    //Setters
    public void setDepartment(String value) {
        department_id.set(value);
    }

    public void setEmployee(String value) {
        employee_id.set(value);
    }

    public void setDepName(String value) {
        department_name.set(value);
    }

 

  
    //Property Value
      public StringProperty Department_idProp() {
        return department_id;
    }

    public StringProperty Employee_idProp() {
        return employee_id;
    }

    public StringProperty Department_nameProp () {
        return department_name;
    }

  
 

    
}