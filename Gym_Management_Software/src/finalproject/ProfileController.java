/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;
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
public class ProfileController implements Initializable {

    @FXML
    private Label WelcomeMsg;
    @FXML
    private Label NoticeMsg;
    @FXML
    private Label QuoteTextField;
    
    private String UserId;
    
    private String Email;
    private String Password;
    private String UserName;
    private String DOB;
    private String Weight;
    private String BG;
    @FXML
    private Label RefreshMsg;
    @FXML
    private Label DisplayUserID;
    @FXML
    private Label DNT;
    @FXML
    private Label XEA;
    @FXML
    private Label XPW;
    @FXML
    private Label XUID;
    @FXML
    private Label XUN;
    @FXML
    private Label XDOB;
    @FXML
    private Label XW;
    @FXML
    private Label XBG;
    
    public void getId(String id) throws FileNotFoundException
    {
        UserId = id;
    }
    
    private void setInfo() throws FileNotFoundException
    {
        File file = new File(UserId+".txt");
        Scanner x = new Scanner(file);
        Email = x.nextLine();
        Password = x.nextLine();
        String garbage = x.nextLine();
        UserName = x.nextLine();
        DOB = x.nextLine();
        Weight = x.nextLine();
        BG = x.nextLine();
        x.close();
        XEA.setText(Email);
        XPW.setText(Password);
        XUID.setText(UserId);
        XUN.setText(UserName);
        XDOB.setText(DOB);
        XW.setText(Weight);
        XBG.setText(BG);
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        try 
        {
            File x = new File("LogInID.txt");
            Scanner s = new  Scanner(x);
            UserId = s.nextLine();
            setInfo();
            WelcomeMsg.setText("Welcome back **"+UserName+"**.");
            RefreshMsg.setText("");
            NoticeMsg.setText("NOTICE UPDATED: VOiD Gym & Fitness will reamin close on 11/22/33.");
            DisplayUserID.setText("USER ID: "+UserId);
            s.close();
            
        } 
        catch (FileNotFoundException ex) 
        {
            System.out.println("Error!");
        }
        
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        DNT.setText("Date & Time: "+dateFormat.format(cal.getTime()));
        
        Random rand = new Random();
        int randX = rand.nextInt(10);
        if(randX==0)
        {
            QuoteTextField.setText("Quote for the day:"+
                                   "IT ALWAYS SEEMS " +
                                   "IMPOSSIBLE, " +
                                   "UNTIL ITS DONE!" );
        }
        if(randX==1)
        {
            QuoteTextField.setText("Quote for the day: "+
                                   "PUSH HARDER " +
                                   "THAN " +
                                   "YESTERDAY " +
                                   "IF YOU WANT " +
                                   "A DIFFERENT " +
                                   "TOMMORROW.");
        }
        if(randX==2)
        {
            QuoteTextField.setText("Quote for the day: "+
                                   "FIND YOUR" +
                                   "COMFORT ZONE" +
                                   "THEN LEAVE IT.");
        }
        if(randX==3)
        {
            QuoteTextField.setText("Quote for the day: " +"EXCUSES " +
                                   "ARE USELESS " +
                                   "RESULTS " +
                                   "ARE PRICELESS.");
        }
        if(randX==4)
        {
            QuoteTextField.setText("Quote for the day: " +"NOTHING " +
                                   "WILL " +
                                   "WORK, " +
                                   "UNLESS YOU " +
                                   "DO!!");
        }
        if(randX==5)
        {
            QuoteTextField.setText("Quote for the day: "+"FALL IN LOVE " +
                                   "WITH TAKING " +
                                   "CARE OF " +
                                   "YOURSELF. " +
                                   "MIND. BODY. " +
                                   "SPIRIT. ");
        }
        if(randX==6)
        {
            QuoteTextField.setText("Quote for the day: "+"YOUR " +
                                   "ONLY " +
                                   "LIMIT " +
                                   "IS YOU!! ");
        }
        if(randX==7)
        {
            QuoteTextField.setText("Quote for the day: "+ "WINNERS " +
                                   "TRAIN " +
                                   "LOSERS " +
                                   "COMPLAIN.");
        }
        if(randX==8)
        {
            QuoteTextField.setText("Quote for the day: "+"IF YOU'RE " +
                                   "TIRED OF " +
                                   "STARTING OVER," +
                                   "STOP GIVING UP!!");
        }
        if(randX==9)
        {
            QuoteTextField.setText("Quote for the day: " +"DOUBT ME " +
                                   "HATE ME. " +
                                   "YOU'RE THE " +
                                   "INSPIRATION " +
                                   "I NEED!!");
        }
        if(randX==10)
        {
            QuoteTextField.setText("Quote for the day: "+"DO IT " +
                                   "NOW " +
                                   "BECAUSE THEY " +
                                   "SAID " +
                                   "YOU COULDN'T!!");
        }
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
    private void GetEssentials(ActionEvent event) throws IOException {
        callScene("GymPass.fxml", event);
    }

    @FXML
    private void StartBuilding(ActionEvent event) {
    }

    @FXML
    private void CardioButton(ActionEvent event) {
    }

    @FXML
    private void StrengthTrainingButton(ActionEvent event) throws IOException {
        callScene("PersonalTrainers.fxml", event);
    }

    @FXML
    private void AccessorisButton(ActionEvent event) throws IOException {
        callScene("Access.fxml", event);
    }

    @FXML
    private void Market(ActionEvent event) throws IOException {
        callScene("Market.fxml", event);
    }

    @FXML
    private void ShopNow(ActionEvent event) throws IOException {
        callScene("Market.fxml", event);
    }

    @FXML
    private void Refresh(ActionEvent event) throws FileNotFoundException {
        setInfo();
        WelcomeMsg.setText("Welcome back **"+UserName+"**.");
        RefreshMsg.setText("");
        NoticeMsg.setText("NOTICE UPDATED: VOiD Gym & Fitness will reamin close on 11/22/33.");
        
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        DNT.setText("Date & Time: "+dateFormat.format(cal.getTime()));
    }

    @FXML
    private void Profile1(ActionEvent event) {
    }

    @FXML
    private void Profile2(ActionEvent event) {
        Profile1(event);
    }

    @FXML
    private void CallHome(ActionEvent event) throws IOException {
        callScene("HomeScreen.fxml", event);
    }

    @FXML
    private void CLose(ActionEvent event) throws IOException {
        callScene("HomeScreen.fxml", event);
    }
    
}
