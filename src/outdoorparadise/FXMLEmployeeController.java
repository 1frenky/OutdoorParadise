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
public class FXMLEmployeeController implements Initializable {

    @FXML
    private TableView<Employee> tabelEmployee;
    @FXML
    private TableColumn<Employee, String> kolomEmp;
    @FXML
    private TableColumn<Employee, String> kolomManager;
    @FXML
    private TableColumn<Employee, String> kolomDepartment;
    @FXML
    private TableColumn<Employee, String> kolomBenefit;
    @FXML
    private TableColumn<Employee, String> kolomJob;
    @FXML
    private TableColumn<Employee, String> kolomAdress;
    @FXML
    private TableColumn<Employee, String> kolomFname;
    @FXML
    private TableColumn<Employee, String> kolomLname;
    @FXML
    private TableColumn<Employee, String> kolomPhone;
    @FXML
    private TableColumn<Employee, String> kolomStatus;
    @FXML
    private TableColumn<Employee, String> kolomNumber;
    @FXML
    private TableColumn<Employee, String> kolomDate;
    @FXML
    private TableColumn<Employee, String> kolomTerm;
    @FXML
    private TableColumn<Employee, String> kolomBirth;
    @FXML
    private TableColumn<Employee, String> kolomSex;
    @FXML
    private TableColumn<Employee, String> kolomEmail;
    @FXML
    private Button ladenBtn;
    @FXML
    private Label labelEmp;

  //Initializor
    private ObservableList<Employee> data;
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
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM op.employee;");
            while (rs.next()) {

                data.add(new Employee(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),
                rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16)));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }

       kolomEmp.setCellValueFactory(new PropertyValueFactory<>("employee_id"));
        kolomManager.setCellValueFactory(new PropertyValueFactory<>("manager_id"));
        kolomDepartment.setCellValueFactory(new PropertyValueFactory<>("department_id"));
        kolomBenefit.setCellValueFactory(new PropertyValueFactory<>("benefit_id"));
        
        kolomJob.setCellValueFactory(new PropertyValueFactory<>("job_id"));
        
        kolomAdress.setCellValueFactory(new PropertyValueFactory<>("adress_id"));
        kolomFname.setCellValueFactory(new PropertyValueFactory<>("fname"));
        kolomLname.setCellValueFactory(new PropertyValueFactory<>("lname"));
        kolomPhone.setCellValueFactory(new PropertyValueFactory<>("private_phone"));
        kolomStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        kolomNumber.setCellValueFactory(new PropertyValueFactory<>("ss_number"));
        kolomDate.setCellValueFactory(new PropertyValueFactory<>("start_date"));
        kolomTerm.setCellValueFactory(new PropertyValueFactory<>("termination_id"));
        kolomBirth.setCellValueFactory(new PropertyValueFactory<>("birth_date"));
        kolomSex.setCellValueFactory(new PropertyValueFactory<>("sex"));
         kolomEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
       
      
        

        tabelEmployee.setItems(null);
        tabelEmployee.setItems(data);
    }

}

