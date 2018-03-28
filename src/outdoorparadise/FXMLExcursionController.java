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
public class FXMLExcursionController implements Initializable {

    @FXML
    private TableView<Excursion> tabelExcursion;
    @FXML
    private TableColumn<Excursion ,  String> kolomEx;
    @FXML
    private TableColumn<Excursion ,  String> kolomType;
    @FXML
    private TableColumn<Excursion ,  String> kolomGuide;
    @FXML
    private TableColumn<Excursion ,  String> kolomBooking;
    @FXML
    private Label label;
    @FXML
    private Button btnLoad;

   //Initializor
    private ObservableList<Excursion> data;
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
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM op.excursion;");
            while (rs.next()) {

                data.add(new Excursion(rs.getString(1), rs.getString(2), rs.getString(3) , rs.getString(4)));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }

        kolomEx.setCellValueFactory(new PropertyValueFactory<>("excursion_id"));
        kolomType.setCellValueFactory(new PropertyValueFactory<>("type"));
        kolomGuide.setCellValueFactory(new PropertyValueFactory<>("guide"));
         kolomBooking.setCellValueFactory(new PropertyValueFactory<>("booking_id"));
        

        tabelExcursion.setItems(null);
        tabelExcursion.setItems(data);
    }

}
