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
public class FXMLJobsController implements Initializable {

    @FXML
    private TableView<Jobs> tabelJobs;
    @FXML
    private TableColumn<Jobs, String> kolomJob;
    @FXML
    private TableColumn<Jobs, String> kolomNumb;
    @FXML
    private TableColumn<Jobs, String> kolomTitle;
    @FXML
    private TableColumn<Jobs, String> kolomMin;
    @FXML
    private TableColumn<Jobs, String> kolomMax;
    @FXML
    private Label label;
    @FXML
    private Button btnLoad;

   //Initializor
    private ObservableList<Jobs> data;
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
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM op.jobs;");
            while (rs.next()) {

                data.add(new Jobs(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }

        kolomJob.setCellValueFactory(new PropertyValueFactory<>("job_id"));
        kolomNumb.setCellValueFactory(new PropertyValueFactory<>("job_number"));
        kolomTitle.setCellValueFactory(new PropertyValueFactory<>("job_title"));
        kolomMin.setCellValueFactory(new PropertyValueFactory<>("min_salary"));
        kolomMax.setCellValueFactory(new PropertyValueFactory<>("max_salary"));
       
        

        tabelJobs.setItems(null);
        tabelJobs.setItems(data);
    }

}
