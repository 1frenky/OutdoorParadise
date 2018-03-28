/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outdoorparadise;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author mlk_s
 */
public class FXMLInventoryController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Button btnLoad;
    @FXML
    private TableView<Inventory> tabelInventory;
    @FXML
    private TableColumn<Inventory, String> kolomYear;
    @FXML
    private TableColumn<Inventory, String> kolomCount;
    @FXML
    private TableColumn<Inventory, String> kolomMonth;
    @FXML
    private TableColumn<Inventory, String> kolomProduct;

   //Initializor
    private ObservableList<Inventory> data;
    private DbConnection dc;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dc = new DbConnection();
    }

    @FXML
    private void loadDataFromDatabase(ActionEvent event) {

        try {
            Connection conn = dc.Connect();
            data = FXCollections.observableArrayList();

            //Execte query en shiz
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM op.inventory_levels;");
            while (rs.next()) {

                data.add(new Inventory(rs.getString(1), rs.getString(2), rs.getString(3) , rs.getString(4)));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }

        kolomYear.setCellValueFactory(new PropertyValueFactory<>("year"));
        kolomCount.setCellValueFactory(new PropertyValueFactory<>("count"));
        kolomMonth.setCellValueFactory(new PropertyValueFactory<>("month"));
         kolomProduct.setCellValueFactory(new PropertyValueFactory<>("product_id"));
        

        tabelInventory.setItems(null);
        tabelInventory.setItems(data);
    }

}
