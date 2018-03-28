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
public class FXMLCompanionController implements Initializable {

    @FXML
    private TableView<Companion> tabelCompanion;
    @FXML
    private TableColumn<Companion, String> kolomComp;
    @FXML
    private TableColumn<Companion, String> kolomFname;
    @FXML
    private TableColumn<Companion, String> kolomLname;
    @FXML
    private TableColumn<Companion, String> kolomBirth;
    @FXML
    private TableColumn<Companion, String> kolomSex;
    @FXML
    private TableColumn<Companion, String> kolomBooking;
    @FXML
    private Button ladenBtn;
    @FXML
    private Label label;
    //Initializor
    private ObservableList<Companion> data;
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
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM op.companion;");
            while (rs.next()) {

                data.add(new Companion(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }

        kolomComp.setCellValueFactory(new PropertyValueFactory<>("companion_id"));
        kolomFname.setCellValueFactory(new PropertyValueFactory<>("fname"));
        kolomLname.setCellValueFactory(new PropertyValueFactory<>("lname"));
        kolomBirth.setCellValueFactory(new PropertyValueFactory<>("birth_date"));

        kolomSex.setCellValueFactory(new PropertyValueFactory<>("sex"));
        kolomBooking.setCellValueFactory(new PropertyValueFactory<>("booking_id"));
        

        tabelCompanion.setItems(null);
        tabelCompanion.setItems(data);
    }

}
