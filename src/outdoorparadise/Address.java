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
public class Address {

    private final StringProperty address_id;
    private final StringProperty street;
    private final StringProperty state;
    private final StringProperty city;
    private final StringProperty zip;
    private final StringProperty affix;
    private final StringProperty country_id;

    public Address(String address_id, String street, String state, String city, String zip, String affix, String country_id) {
        this.address_id = new SimpleStringProperty(address_id);
        this.street = new SimpleStringProperty(street);
        this.state = new SimpleStringProperty(state);
        this.city = new SimpleStringProperty(city);
        this.zip = new SimpleStringProperty(zip);
        this.affix = new SimpleStringProperty(affix);
        this.country_id = new SimpleStringProperty(country_id);
    }

    //Gettets  
    public String getAddress_id() {
        return address_id.get();
    }

    public String getStreet() {
        return street.get();
    }

    public String getState() {
        return state.get();
    }

    public String getCity() {
        return city.get();
    }

    public String getZip() {
        return zip.get();
    }

    public String getAffix() {
        return affix.get();
    }

    public String getCountry_id() {
        return country_id.get();
    }

    //Setters
    public void setAddress_id(String value) {
        address_id.set(value);
    }

    public void setStreet(String value) {
        street.set(value);
    }

    public void setState(String value) {
        state.set(value);
    }

    public void setCity(String value) {
        city.set(value);
    }

    public void setZip(String value) {
        zip.set(value);
    }

    public void setAffix(String value) {
        affix.set(value);
    }

    public void setCountry_id(String value) {
        country_id.set(value);
    }
    
    //Property Value
      public StringProperty Address_idProp() {
        return address_id;
    }

    public StringProperty StreetProp() {
        return street;
    }

    public StringProperty StateProp () {
        return state;
    }

    public StringProperty CityProp() {
        return city;
    }

    public StringProperty ZipProp() {
        return zip;
    }

    public StringProperty AffixProp() {
        return affix;
    }

    public StringProperty Country_idProp() {
        return country_id;
    }

    
}
