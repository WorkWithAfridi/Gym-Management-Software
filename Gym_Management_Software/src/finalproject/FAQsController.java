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
public class FAQsController implements Initializable {

    @FXML
    private Label FAQOutput;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
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
    private void FAQ1(ActionEvent event){
        FAQOutput.setText("VOiD Gym and Fitness has been around since 2002.\n"
                        + "We have gone from strength to strength in that time and now pride ourselves in being one of the largest fitness brand in Bangladesh.\n" +
                          "We have years of combined fitness experience across all of our staff, so our great range of products and pricing is backed with fantastic fitness knowledge.");
    }

    @FXML
    private void FAQ2(ActionEvent event){
        FAQOutput.setText("We are confident that we have the most competitive advertised prices in Bangladesh however, if you see a cheaper advertised price send us an email with the details. \n"
                        + "We have a ‘Price Match Request’ feature on every product page otherwise you can speak to someone directly on 0174149976X.\n" +
                          "Our staff have extensive knowledge in the area of fitness, so they can offer a more suitable (better, smaller, cheaper, stronger etc.) suggestion to suit your specific needs. \n"
                        + "Many other competitors do not have the range or knowledge that we do, and they will simply try to sell you into the product they have the most stock of! \n "
                        + "At VOiD Gym and Fitness, we can also save you on freight due to the high volumes of stock that we send out every day.");
    }

    @FXML
    private void FAQ3(ActionEvent event) {
        FAQOutput.setText("Yes we do.\n"
                        + "If you contact us from a Defence Force (or ambulance, police, fire) email address, we can arrange a special discount for you. \n"
                        + "The discount will vary depending on the products, so make sure you have a chat with our friendly staff.");
    }

    @FXML
    private void FAQ4(ActionEvent event) {
        FAQOutput.setText("Yes, we do. \n"
                        + "We use XYZPay ,123Solution ,RocketPay, FlexiRent and FlexiCommercial, however these may not be available for use during specific promos.\n"
                        + "If you need help finding the right financing option for you, call 0170380534X to speak with one of our sales consultants.\n"
                        + "But please note that VOiD Gym and Fitness reserve the right to refuse finance for promotional offers.");
    }

    @FXML
    private void FAQ5(ActionEvent event) {
        FAQOutput.setText("In addition to financing and payment plans, you can pay using your credit card, paypal or direct deposit.\n" +
                          "Our website is protected with high-grade 256-bit encryption. \n"
                        + "This means that when you are entering any personal details (such as creating an account) or going through the steps in the checkout all your information will be secure! \n"
                        + "If you are still not comfortable with giving details over the internet, we can also accept your credit card details over the phone.\n" +
                          "If you'd like to pay by direct deposit. Our bank details are as follows:\n" +
                          "Name: VOiD Gym and Fitness Ltd.\n" +
                          "Bank: ZXY910. \n" +
                          "BSB: 017-527. \n" +
                          "Account: 1820461.\n" +
                          "Please use your name or order number as the description as this makes it easier and quicker to identify your payment and have your plan placed.");
    }

    @FXML
    private void FAQ6(ActionEvent event){
        FAQOutput.setText("Gym And Fitness has a physical store on the Gold Coast! If you would like to come into our head office, we are located in XYZABC.\n" +
                          "Unlike many other \"online only\" fitness clubs, many who operate out of home, we are a well established Bangladeshi owned company, \n"
                        + "with around 40 staff and over 100 years of fitness experience between us! :) ");
    }

    @FXML
    private void FAQ7(ActionEvent event)  {
        FAQOutput.setText("Promotions and coupon codes can not be used in conjunction with any other offer or on finance. \n"
                        + " All promotions and coupons exclude Assault Fitness products, Concept 2 and WattBikes. \n"
                        + "Please be aware that Gym and Fitness reserve the right to make the final decision.");
    }

    @FXML
    private void FAQ8(ActionEvent event) {
        FAQOutput.setText("Yes, we do.\n "
                        + "Children ages 5 years - 11 years (up to their 12th birthday) may be admitted into Kids’ Club. \n"
                        + "What is the maximum time that each child may participate in Kids’ Club each day?\n" +
                          "The maximum is 2 hours per day.\n"
                        + " However, the child can be checked into Kids’ Club more than once in the same day. \n"
                        + "But the combined time that a child can be watched by 24 Hour Fitness team members cannot exceed two hours in any day.");
    }


    @FXML
    private void FAQ9(ActionEvent event){
        FAQOutput.setText("Joining online is easy and convenient.\n"
                        + "You can check the current price for any of our memberships by visiting our Membership page and following the instructions. \n"
                        + "Or, you can visit out club and talk to the team members about the membership options that's right for you.");
    }

    @FXML
    private void FAQ10(ActionEvent event){
        FAQOutput.setText("We offer a few different options for upgrading your membership online:\n" +
                          "\n" +
                          "Monthly Payment Memberships can be upgraded to an All-Club Sport, Super-Sport or Ultra-Sport level membership.\n" +
                          "Limited Term memberships can be upgraded/converted to any membership option available at your selected club.\n" +
                          "To upgrade online, use the \"Add to My Membership\" link or the \"Additional Services\" link on our website. \n"
                        + "Or you can visit your local club to learn more.\n" +
                          "\n" +
                          "Prepaid Membership upgrades or transferring a Monthly Payment One-Club membership to another club cannot be done online. \n"
                        + "Please visit your club for more details.");
    }
    
}
