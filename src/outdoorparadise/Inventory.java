package outdoorparadise;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * ladenBtn
 *
 * @author mlk_s
 */
public class Inventory {

    private final StringProperty year;
    private final StringProperty count;
    private final StringProperty month;
    private final StringProperty product_id;

    public Inventory(String year, String count, String month, String product_id) {
        this.year = new SimpleStringProperty(year);
        this.count = new SimpleStringProperty(count);
        this.month = new SimpleStringProperty(month);
        this.product_id = new SimpleStringProperty(product_id);

    }

    //Gettets  
    public String getYear() {
        return year.get();
    }

    public String getCount() {
        return count.get();
    }

    public String getMonth() {
        return month.get();
    }

    public String getProduct() {
        return product_id.get();
    }

    //Setters
    public void setYear(String value) {
        year.set(value);
    }

    public void setCount(String value) {
        count.set(value);
    }

    public void setMonth(String value) {
        month.set(value);
    }

    public void setProduct(String value) {
        product_id.set(value);
    }

    //Property Value
    public StringProperty Excursion_idProp() {
        return year;
    }

    public StringProperty TypeProp() {
        return count;
    }

    public StringProperty MonthProp() {
        return month;
    }

    public StringProperty Product_idProp(){
    return product_id;}
}
