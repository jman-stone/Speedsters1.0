package com.example.speedsters1_0;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;


public class HelloController {



    public TextField PasswordTextBox;
    public TextField UserNameTextBox;

    public TextField NewPasswordTextBox;
    public TextField NewUserNameTextBox;
    public TextField NameTextBox;
    public TextField EmailTextBox;
    public TextField PhoneNumberTextBox;
    public Button SignInButton;
    public Button CreateAccountButton;
    public Label UsersNameLabel;
    public ImageView McDonaldsPic;
    public Button FriesCartButton;
    public Button BigMacCartButton;
    public Button SodaCartButton;
    public Button IceCreamCartButton;
    public AnchorPane McDonaldsMenu;
    public Label CartTotal;
    public AnchorPane AccountPane;
    Account baseAccountList = new Account(null , null, null, null, null);
    Account newAccount;// = new Account(null, null, null, null, null);
    //AccountList accountList = new AccountList();
    String username;
    String password;
    String Name;
    String Email;
    String PhoneNumber;

    //ArrayList<Account> AccountList = new ArrayList<>();
    HelloController controller(){

        PasswordTextBox.setVisible(false);
        UserNameTextBox.setVisible(false);
        NewPasswordTextBox.setVisible(false);
        NewUserNameTextBox.setVisible(false);
        NameTextBox.setVisible(false);
        EmailTextBox.setVisible(false);
        PhoneNumberTextBox.setVisible(false);
        return this;
    }

    @FXML
    public void start() {


    }

    //sign in view button
    @FXML
    public void onSignInClick(ActionEvent actionEvent) {
        AccountPane.setVisible(true);
        //Scanner scan = new Scanner(System.in);
        //reveal username and password fields instead of all this
        PasswordTextBox.setVisible(true);
        UserNameTextBox.setVisible(true);
        SignInButton.setVisible(true);
        NameTextBox.setVisible(false);
        EmailTextBox.setVisible(false);
        PhoneNumberTextBox.setVisible(false);
        NewPasswordTextBox.setVisible(false);
        NewUserNameTextBox.setVisible(false);
        CreateAccountButton.setVisible(false);
        McDonaldsMenu.setVisible(false);
        System.out.println("Please enter your username");
        //String username = scan.nextLine();
        System.out.println("Please enter your password");
        //String password = scan.nextLine();

    }

    @FXML
    public void onNewUserClick(ActionEvent actionEvent) {
        AccountPane.setVisible(true);
        PasswordTextBox.setVisible(false);
        UserNameTextBox.setVisible(false);
        SignInButton.setVisible(false);
        NameTextBox.setVisible(true);
        EmailTextBox.setVisible(true);
        PhoneNumberTextBox.setVisible(true);
        NewPasswordTextBox.setVisible(true);
        NewUserNameTextBox.setVisible(true);
        CreateAccountButton.setVisible(true);
        McDonaldsMenu.setVisible(false);


    }
    @FXML
    public void onCartClick(ActionEvent actionEvent) {
    }
    @FXML
    public void onAmericanCuisineClick(ActionEvent actionEvent) {
    }
    @FXML
    public void onItalianCuisineClick(ActionEvent actionEvent) {
    }
    @FXML
    public void onMexicanCuisineClick(ActionEvent actionEvent) {
    }
    @FXML
    public void onSeafoodCuisineClick(ActionEvent actionEvent) {
    }
    @FXML
    public void onRestaurantsListClicked(ActionEvent actionEvent) {
    }


    //These work to create a generic account
    //Sign in conformation button
    @FXML
    public void onSignInInfoEntered(ActionEvent actionEvent) {
        //username = UserNameTextBox.getText();
        //password = PasswordTextBox.getText();
        if(baseAccountList.verifyCredentials(UserNameTextBox.getText(), PasswordTextBox.getText())){
            System.out.println("Sign-in successful! Welcome " + UserNameTextBox.getText());
            UsersNameLabel.setText(baseAccountList.getAccountByCredentials(UserNameTextBox.getText(), PasswordTextBox.getText()).getName());
            PasswordTextBox.setVisible(false);
            UserNameTextBox.setVisible(false);
            SignInButton.setVisible(false);
            AccountPane.setVisible(false);
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    //createAccount button
    @FXML
    public void onCreateAccountInfoEntered(ActionEvent actionEvent) {
        newAccount = new Account(NameTextBox.getText(), NewPasswordTextBox.getText(), NewUserNameTextBox.getText(), EmailTextBox.getText(), PhoneNumberTextBox.getText());

        if(baseAccountList.verifyCredentials(newAccount.getUsername(), newAccount.getPassword())){
            System.out.println("Username already exists. Please try again.");
        } else {
            System.out.println("Account created!");
            baseAccountList.addAccount(newAccount);
            System.out.println(baseAccountList.getAccountList().get(0).getName());
            UsersNameLabel.setText(baseAccountList.getAccountByCredentials(NewUserNameTextBox.getText(), NewPasswordTextBox.getText()).getName());
            NameTextBox.setVisible(false);
            EmailTextBox.setVisible(false);
            PhoneNumberTextBox.setVisible(false);
            NewPasswordTextBox.setVisible(false);
            NewUserNameTextBox.setVisible(false);
            CreateAccountButton.setVisible(false);
            AccountPane.setVisible(false);
        }
    }

    public void onMcDonaldsClicked(MouseEvent mouseEvent) {
        McDonaldsMenu.setVisible(true);
        AccountPane.setVisible(false);
    }

    public double cartTotal = 0;

    //$4.50
    public void onFriesClicked(ActionEvent actionEvent) {
        cartTotal += 4.50;
        CartTotal.setText(cartTotal+"");
    }

    //$6.50
    public void onBigMacClicked(ActionEvent actionEvent) {
        cartTotal += 6.50;
        CartTotal.setText(cartTotal+"");
    }

    //$2.00
    public void onSodaClicked(ActionEvent actionEvent) {
        cartTotal += 2.00;
        CartTotal.setText(cartTotal+"");
    }

    //$3.50
    public void onIceCreamClicked(ActionEvent actionEvent) {
        cartTotal += 3.50;
        CartTotal.setText(cartTotal+"");
    }
}