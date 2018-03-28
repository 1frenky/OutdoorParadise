package outdoorparadise;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * ladenBtn
 *
 * @author mlk_s
 */
public class Excursion {

    private final StringProperty excursion_id;
    private final StringProperty type;
    private final StringProperty guide;
    private final StringProperty booking_id;

    public Excursion(String excursion_id, String type, String guide, String booking_id) {
        this.excursion_id = new SimpleStringProperty(excursion_id);
        this.type = new SimpleStringProperty(type);
        this.guide = new SimpleStringProperty(guide);
        this.booking_id = new SimpleStringProperty(booking_id);

    }

    //Gettets  
    public String getExcursion() {
        return excursion_id.get();
    }

    public String getType() {
        return type.get();
    }

    public String getGuide() {
        return guide.get();
    }

    public String getBooking() {
        return booking_id.get();
    }

    //Setters
    public void setExcursion(String value) {
        excursion_id.set(value);
    }

    public void setType(String value) {
        type.set(value);
    }

    public void setGuide(String value) {
        guide.set(value);
    }

    public void setBooking(String value) {
        booking_id.set(value);
    }

    //Property Value
    public StringProperty Excursion_idProp() {
        return excursion_id;
    }

    public StringProperty TypeProp() {
        return type;
    }

    public StringProperty GuideProp() {
        return guide;
    }

    public StringProperty Booking_idProp(){
    return booking_id;}
}
