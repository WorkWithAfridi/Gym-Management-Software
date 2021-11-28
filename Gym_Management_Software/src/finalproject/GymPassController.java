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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Khond
 */
public class GymPassController implements Initializable {

    @FXML
    private TextField FristName;
    @FXML
    private TextField LastName;
    @FXML
    private TextField EmailA;
    @FXML
    private TextField BG;
    @FXML
    private TextField Age;
    @FXML
    private TextField PhoneNo;
    @FXML
    private TextField DOB;
    @FXML
    private RadioButton CashRB;
    @FXML
    private RadioButton CheckRB;
    @FXML
    private RadioButton CreditCardRB;
    @FXML
    private RadioButton OnlinePay;
    @FXML
    private Label TotalTaka;
    @FXML
    private Label InvalidCall;
    @FXML
    private RadioButton Bronze;
    @FXML
    private RadioButton Silver;
    @FXML
    private RadioButton Gold;
    @FXML
    private Label PassContent;
    @FXML
    private RadioButton Diamond;
    @FXML
    private RadioButton Premium;
    @FXML
    private RadioButton Exclusive;
    @FXML
    private RadioButton Trial;
    
    private int TotalTakaa,i;
    @FXML
    private Label DataSaved;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        TotalTakaa = 0;
        i=0;
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
    private void SignUpSave(ActionEvent event) {
        DataSaved.setText("Data has been saved!");
    }

    @FXML
    private void PaymentNext(ActionEvent event) {
    }

    @FXML
    private void BronzeAction(ActionEvent event) {
    }

    @FXML
    private void SilverAction(ActionEvent event) {
    }

    @FXML
    private void GoldAction(ActionEvent event) {
    }

    @FXML
    private void DiamondAction(ActionEvent event) {
    }

    @FXML
    private void PremiumAction(ActionEvent event) {
    }

    @FXML
    private void ExclusiveAction(ActionEvent event) {
    }

    @FXML
    private void TrialAction(ActionEvent event) {
    }

    @FXML
    private void SelectPassNext(ActionEvent event) {
        if(Trial.isSelected())
        {
            i++;
            TotalTakaa=0;
            TotalTakaa+=0;
        }
        if(Bronze.isSelected())
        {
            i++;
            TotalTakaa=0;
            TotalTakaa+=2000;
        }
        if(Silver.isSelected())
        {
            i++;
            TotalTakaa=0;
            TotalTakaa+=3000;
        }
        if(Gold.isSelected())
        {
            i++;
            TotalTakaa=0;
            TotalTakaa+=5000;
        }
        if(Diamond.isSelected())
        {
            i++;
            TotalTakaa=0;
            TotalTakaa+=10000;
        }
        if(Premium.isSelected())
        {
            i++;
            TotalTakaa=0;
            TotalTakaa+=25000;
        }
        if(Exclusive.isSelected())
        {
            i++;
            TotalTakaa=0;
            TotalTakaa+=50000;
        }
        if(i>1 || i<=0)
        {
            TotalTaka.setText("Invalid Input!");
            PassContent.setText("Too many OR NO PASS has been selected. \n"
                              + "Please, press #Reset Data.\n"
                              + "And select only one PASS!\n");
        }
        if(i==1)
        {
            TotalTaka.setText(String.valueOf(TotalTakaa)+ "//- taka.");
        }
    }

    @FXML
    private void ResetData(ActionEvent event) {
        TotalTaka.setText("");
        TotalTakaa=0;
        i=0;
        PassContent.setText("");
    }
        
}
