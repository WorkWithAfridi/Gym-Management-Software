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
public class AboutUsController implements Initializable {

    @FXML
    private Label AboutUs;
    @FXML
    private Label OurStory;
    @FXML
    private Label OurTeam;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        AboutUs.setText("A little fit goes a long way, when you manage to fit in your workout. \n"
                      + " At VOiD Gym & Fitness, we’re here to provide the motivation you need to kick off the covers and kick into gear. \n"
                      + "We put opportunities and tools at your fingertips – such as studio and cycle classes, on-demand workouts, magazines and signature training programs.\n"
                      + " – to get you started on the right track and keep you moving forward.\n"
                      + "\n"
                      + "Our locations are open when and where you want them, so you can turn the time you have into an energizing and rewarding part of your day.");
        OurStory.setText("VOiD Gym and Fitness was founded in 2018 as a family owned and operated business. \n"
                       + "The Gym and Fitness founders didn’t want it to be just another gym equipment retailer. \n"
                       + " - they wanted to be the best in the industry and set their minds on doing so! \n"
                       + "Since founded, VOiD Gym & Fitness has grown into one of Bangladesh’s largest online fitness and training club having helped over 50,000 customers.\n"
                       + "Live longer, Happier and Healthier lives. \n");
        OurTeam.setText("Here at Gym and Fitness, we have a team of approximately forty awesome superstars and we owe our success to each and every single one of them!\n"
                      + "Because we hire for culture first and foremost, we have some pretty awesome people working with us.\n"
                      + "Who hustle everyday just to give you a positive customer experience.\n"
                      + "You can find them in areas such as sales, marketing and ecommerce, customer service, warehousing, finance, human resources and management.\n"
                      + "If you think you’re kind of a big deal and interested in joining our team, please send us an email with your resume and a little bit about yourself. :) ");
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
    
}
