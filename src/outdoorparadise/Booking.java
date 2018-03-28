/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outdoorparadise;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**ladenBtn
 *
 * @author mlk_s
 */
public class Booking {

    private final StringProperty tour_id;
    private final StringProperty individual_id;
    private final StringProperty booking_id;
    private final StringProperty excursion_id;
    private final StringProperty companion_id;
   

    public Booking(String tour_id , String individual_id, String booking_id, String excursion_id, String companion_id ){
        this.tour_id = new SimpleStringProperty(tour_id );
        this.individual_id = new SimpleStringProperty(individual_id);
        this.booking_id = new SimpleStringProperty(booking_id);
        this.excursion_id = new SimpleStringProperty(excursion_id);
        this.companion_id = new SimpleStringProperty(companion_id);
        
    }

    //Gettets  
    public String getAddress_id() {
        return tour_id.get();
    }

    public String getStreet() {
        return individual_id.get();
    }

    public String getState() {
        return booking_id.get();
    }

    public String getCity() {
        return excursion_id.get();
    }

    public String getZip() {
        return companion_id.get();
    }


    //Setters
    public void setAddress_id(String value) {
        tour_id.set(value);
    }

    public void setStreet(String value) {
        individual_id.set(value);
    }

    public void setState(String value) {
        booking_id.set(value);
    }

    public void setCity(String value) {
        excursion_id.set(value);
    }

    public void setZip(String value) {
        companion_id.set(value);
    }

  
    //Property Value
      public StringProperty Address_idProp() {
        return tour_id;
    }

    public StringProperty StreetProp() {
        return individual_id;
    }

    public StringProperty StateProp () {
        return booking_id;
    }

    public StringProperty CityProp() {
        return excursion_id;
    }

    public StringProperty ZipProp() {
        return companion_id;
    }

 

    
}
