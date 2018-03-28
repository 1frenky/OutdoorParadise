/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outdoorparadise;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author mlk_s
 */
public class FXMLHomePageController implements Initializable {

    @FXML
    private Button btnAdress;
    @FXML
    private Button btnBooking;
    @FXML
    private Button btnCompanion;
    @FXML
    private Button btnDepartment;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void openAdress(ActionEvent event) {
        
        try {
            FXMLLoader fxmlLoad = new FXMLLoader(getClass().getResource("FXMLAddress.fxml"));
            Parent root1 = (Parent) fxmlLoad.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException ex) {
            System.out.println("Cant Load");
        }
        
    }

    @FXML
    private void openBooking(ActionEvent event) {
           
        try {
            FXMLLoader fxmlLoad = new FXMLLoader(getClass().getResource("FXMLBooking.fxml"));
            Parent root1 = (Parent) fxmlLoad.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException ex) {
            System.out.println("Cant Load");
        }
    }

    @FXML
    private void openCompanion(ActionEvent event) {
        
         try {
            FXMLLoader fxmlLoad = new FXMLLoader(getClass().getResource("FXMLCompanion.fxml"));
            Parent root1 = (Parent) fxmlLoad.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException ex) {
            System.out.println("Cant Load");
        }
    }

    @FXML
    private void openDepartment(ActionEvent event) {
        
         try {
            FXMLLoader fxmlLoad = new FXMLLoader(getClass().getResource("FXMLDepartment.fxml"));
            Parent root1 = (Parent) fxmlLoad.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException ex) {
            System.out.println("Cant Load");
        }
    }
    
    @FXML
    private void openEmployee(ActionEvent event) {
        
         try {
            FXMLLoader fxmlLoad = new FXMLLoader(getClass().getResource("FXMLEmployee.fxml"));
            Parent root1 = (Parent) fxmlLoad.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException ex) {
            System.out.println("Cant Load");
        }
    }
    @FXML
    private void openExcursion(ActionEvent event) {
        
         try {
            FXMLLoader fxmlLoad = new FXMLLoader(getClass().getResource("FXMLExcursion.fxml"));
            Parent root1 = (Parent) fxmlLoad.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException ex) {
            System.out.println("Cant Load");
        }
    }
    
    @FXML
    private void openInventory(ActionEvent event) {
        
         try {
            FXMLLoader fxmlLoad = new FXMLLoader(getClass().getResource("FXMLInventory.fxml"));
            Parent root1 = (Parent) fxmlLoad.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException ex) {
            System.out.println("Cant Load");
        }
    }
    
    @FXML
    private void openJobs(ActionEvent event) {
        
         try {
            FXMLLoader fxmlLoad = new FXMLLoader(getClass().getResource("FXMLJobs.fxml"));
            Parent root1 = (Parent) fxmlLoad.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException ex) {
            System.out.println("Cant Load");
        }
    }
    
    @FXML
    private void openOrderDetails(ActionEvent event) {
        
         try {
            FXMLLoader fxmlLoad = new FXMLLoader(getClass().getResource("FXMLOrderDetails.fxml"));
            Parent root1 = (Parent) fxmlLoad.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException ex) {
            System.out.println("Cant Load");
        }
    }
    
    @FXML
    private void openOrderHeader(ActionEvent event) {
        
         try {
            FXMLLoader fxmlLoad = new FXMLLoader(getClass().getResource("FXMLOrderHeader.fxml"));
            Parent root1 = (Parent) fxmlLoad.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException ex) {
            System.out.println("Cant Load");
        }
    }
    
    @FXML
    private void openPrivate(ActionEvent event) {
        
         try {
            FXMLLoader fxmlLoad = new FXMLLoader(getClass().getResource("FXMLPrivate.fxml"));
            Parent root1 = (Parent) fxmlLoad.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException ex) {
            System.out.println("Cant Load");
        }
    }
}
