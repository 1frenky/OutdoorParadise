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
import java.util.logging.Level;
import java.util.logging.Logger;
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
 *
 * @author mlk_s
 */
public class FXMLAddressController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TableView<Address> tableAddress;
    @FXML
    private TableColumn<Address, String> kolomAdd;
    @FXML
    private TableColumn<Address, String> kolomStreet;
    @FXML
    private TableColumn<Address, String> kolomState;
    @FXML
    private TableColumn<Address, String> kolomZip;
    @FXML
    private TableColumn<Address, String> kolomAffix;
    @FXML
    private TableColumn<Address, String> kolomCountry_id;
    @FXML
    private TableColumn<Address, String> kolomCity;
    @FXML
    private Button ladenBtn;

    //Initializor
    private ObservableList<Address> data;
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
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM op.address;");
            while (rs.next()) {

                data.add(new Address(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }

        kolomAdd.setCellValueFactory(new PropertyValueFactory<>("address_id"));
        kolomStreet.setCellValueFactory(new PropertyValueFactory<>("street"));
        kolomState.setCellValueFactory(new PropertyValueFactory<>("state"));
        kolomZip.setCellValueFactory(new PropertyValueFactory<>("zip"));
        kolomAffix.setCellValueFactory(new PropertyValueFactory<>("affix"));
        kolomCountry_id.setCellValueFactory(new PropertyValueFactory<>("country_id"));
        kolomCity.setCellValueFactory(new PropertyValueFactory<>("city"));
        
        tableAddress.setItems(null);
        tableAddress.setItems(data);
    }

}
