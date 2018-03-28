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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author mlk_s
 */
public class FXMLBookingController implements Initializable {

    @FXML
    private TableView<Booking> tabelBooking;
    @FXML
    private TableColumn<Booking, String> kolomIndiv;
    @FXML
    private TableColumn<Booking, String> kolomBooking;
    @FXML
    private TableColumn<Booking, String> kolomEx;
    @FXML
    private TableColumn<Booking, String> kolomComp;
    @FXML
    private TableColumn<Booking, String> kolomTour;
    @FXML
    private Button ladenBtn;

     //Initializor
    private ObservableList<Booking> data;
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
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM op.booking;");
            while (rs.next()) {

                data.add (new Booking(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }

        kolomTour.setCellValueFactory(new PropertyValueFactory<>("tour_id"));
        kolomIndiv.setCellValueFactory(new PropertyValueFactory<>("individual_id"));
        kolomBooking.setCellValueFactory(new PropertyValueFactory<>("booking_id"));
        kolomEx.setCellValueFactory(new PropertyValueFactory<>("excursion_id"));
        kolomComp.setCellValueFactory(new PropertyValueFactory<>("companion_id"));
        ;
        
        tabelBooking.setItems(null);
        tabelBooking.setItems(data);
    }

}
