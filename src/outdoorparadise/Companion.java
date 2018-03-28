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
public class Companion {

    private final StringProperty lname;
    private final StringProperty fname;
    private final StringProperty booking_id;
    private final StringProperty sex;
    private final StringProperty companion_id;
    private final StringProperty birth_date;

    public Companion(String tour_id, String individual_id, String booking_id, String excursion_id, String companion_id, String birth_date) {
        this.lname = new SimpleStringProperty(tour_id);
        this.fname = new SimpleStringProperty(individual_id);
        this.booking_id = new SimpleStringProperty(booking_id);
        this.sex = new SimpleStringProperty(excursion_id);
        this.companion_id = new SimpleStringProperty(companion_id);
        this.birth_date = new SimpleStringProperty(birth_date);

    }

    //Gettets  
    public String getLname() {
        return lname.get();
    }

    public String getFname() {
        return fname.get();
    }

    public String getBooking() {
        return booking_id.get();
    }

    public String getSex() {
        return sex.get();
    }

    public String getCompanion() {
        return companion_id.get();
    }
    
      public String getBirth() {
        return birth_date.get();
    }

    //Setters
    public void setLname(String value) {
        lname.set(value);
    }

    public void setFname(String value) {
        fname.set(value);
    }

    public void setBooking(String value) {
        booking_id.set(value);
    }

    public void setSex(String value) {
        sex.set(value);
    }

    public void setCompanion(String value) {
        companion_id.set(value);
    }
    
    public void setBirth(String value) {
        birth_date.set(value);
    }

    //Property Value
    public StringProperty LnameProp() {
        return lname;
    }

    public StringProperty FnameProp() {
        return fname;
    }

    public StringProperty BookingProp() {
        return booking_id;
    }

    public StringProperty SexProp() {
        return sex;
    }

    public StringProperty CompanionProp() {
        return companion_id;
    }

    public StringProperty BirthDateProp() {
        return birth_date;
    }
}
