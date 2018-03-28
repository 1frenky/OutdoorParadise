package outdoorparadise;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**ladenBtn
 *
 * @author mlk_s
 */
public class OrderDetails {

    private final StringProperty order_detail_id;
    private final StringProperty order_header_id;
    private final StringProperty quantity; 
    private final StringProperty unit_sale_price;
  
   

    public OrderDetails(String order_detail_id , String order_header_id, String quantity , String unit_sale_price){
        this.order_detail_id = new SimpleStringProperty(order_detail_id );
        this.order_header_id = new SimpleStringProperty(order_header_id);
        this.quantity = new SimpleStringProperty(quantity);
      this.unit_sale_price = new SimpleStringProperty(unit_sale_price);
        
    }

    //Gettets  
    public String getOrderDetail() {
        return order_detail_id.get();
    }

    public String getOrderHeader() {
        return order_header_id.get();
    }

    public String getQuantity() {
        return quantity.get();
    }
    public String getPrice(){
        return unit_sale_price.get();
    }



    //Setters
    public void setOrderDetail(String value) {
        order_detail_id.set(value);
    }

    public void setOrderHeader(String value) {
        order_header_id.set(value);
    }

    public void setQuantity(String value) {
        quantity.set(value);
    }

    public void setPrice(String value){
        unit_sale_price.set(value);
    }
 

  
    //Property Value
      public StringProperty Order_detail_idProp() {
        return order_detail_id;
    }

    public StringProperty Order_header_idProp() {
        return order_header_id;
    }

    public StringProperty QuantityProp () {
        return quantity;
    }

    public StringProperty Unit_sale_priceProp(){
    return unit_sale_price;}
  
    
 

    
}