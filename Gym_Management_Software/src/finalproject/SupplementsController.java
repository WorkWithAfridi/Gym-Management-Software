/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Khond
 */
public class SupplementsController implements Initializable {

    @FXML
    private Label totalTaka;
    private int taka;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        taka=0;
        // TODO
    }    

    private void callScene(String source, ActionEvent event) throws IOException
    {
        Parent LogInParent = FXMLLoader.load(getClass().getResource(source));
        Scene LogInScene = new Scene(LogInParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(LogInScene);
        window.show();
    }    
    
    @FXML
    private void Home(ActionEvent event) throws IOException {
        callScene("HomeScreen.fxml", event);
    }

    @FXML
    private void LifeStyle(ActionEvent event)throws IOException {
        callScene("LifeStyle.fxml", event);
    }

    @FXML
    private void FitPlans(ActionEvent event)throws IOException {
        callScene("FitPlans.fxml", event);
    }

    @FXML
    private void Accessories_handleBAccuttonAction(ActionEvent event)throws IOException {
        callScene("Access.fxml", event);
    }

    @FXML
    private void Trainers(ActionEvent event)throws IOException {
        callScene("Trainers.fxml", event);
    }

    @FXML
    private void PersonalTrainers(ActionEvent event)throws IOException {
        callScene("PersonalTrainers.fxml", event);
    }

    @FXML
    private void NewArraivals(ActionEvent event)throws IOException {
        callScene("NewArraivals.fxml", event);
    }

    @FXML
    private void GymPass(ActionEvent event)throws IOException {
        callScene("GymPass.fxml", event);
    }

    @FXML
    private void FAQs(ActionEvent event)throws IOException {
        callScene("FAQs.fxml", event);
    }

    @FXML
    private void AboutUs(ActionEvent event)throws IOException {
        callScene("AboutUs.fxml", event);
    }

    @FXML
    private void Logout(ActionEvent event) throws IOException {
        callScene("LogIn.fxml", event);
    }

    @FXML
    private void RequestOrder(ActionEvent event) {
    }

    @FXML
    private void BN1(ActionEvent event) {
        taka+=2396;
    }

    @FXML
    private void BN2(ActionEvent event) {
        taka+=2877;
    }

    @FXML
    private void BN3(ActionEvent event) {
        taka+=2396;
    }

    @FXML
    private void BN4(ActionEvent event) {
        taka+=1996;
    }

    @FXML
    private void BN5(ActionEvent event) {
        taka+=2396;
    }

    @FXML
    private void BN6(ActionEvent event) {
        taka+=1996;
    }

    @FXML
    private void BN7(ActionEvent event) {
        taka+=3837;
    }

    @FXML
    private void checkOut(ActionEvent event) {
        if(taka==0)
        {
            System.out.println("Error");
        }
    }

    @FXML
    private void Reset(ActionEvent event) {
        taka=0;
        totalTaka.setText("");
    }

    @FXML
    private void ShowBill(ActionEvent event) {
        if(taka<1)
        {
            totalTaka.setText("Cart Empty...");
        }
        else
        {
            totalTaka.setText(Integer.toString(taka)+" Taka Only");
        }
    }
    
}
