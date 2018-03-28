/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outdoorparadise;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author mlk_s
 */
public class FXMLOrderDetailsController implements Initializable {

    @FXML
    private TableView<?> tabelOrderDetails;
    @FXML
    private TableColumn<?, ?> kolomDetail;
    @FXML
    private TableColumn<?, ?> kolomHead;
    @FXML
    private TableColumn<?, ?> kolomQuan;
    @FXML
    private TableColumn<?, ?> kolomPrice;
    @FXML
    private Label label;
    @FXML
    private Button btnLoad;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadDataFromDatabase(ActionEvent event) {
    }
    
}
