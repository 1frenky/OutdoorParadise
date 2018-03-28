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
public class FXMLDepartmentController implements Initializable {

    @FXML
    private TableView<Department> tabelDepartment;
    @FXML
    private TableColumn<Department, String> kolomDepID;
    @FXML
    private TableColumn<Department, String> kolomEmp;
    @FXML
    private TableColumn<Department, String> kolomDepName;
    @FXML
    private Label label;
    @FXML
    private Button btnLoad;
 //Initializor
    private ObservableList<Department> data;
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
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM op.department;");
            while (rs.next()) {

                data.add(new Department(rs.getString(1), rs.getString(2), rs.getString(3)));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }

        kolomDepID.setCellValueFactory(new PropertyValueFactory<>("department_id"));
        kolomEmp.setCellValueFactory(new PropertyValueFactory<>("employee_id"));
        kolomDepName.setCellValueFactory(new PropertyValueFactory<>("department_name"));
        

        tabelDepartment.setItems(null);
        tabelDepartment.setItems(data);
    }

}
