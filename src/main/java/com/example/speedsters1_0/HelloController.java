package com.example.speedsters1_0;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;


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
        System.out.println("Please enter your username");
        //String username = scan.nextLine();
        System.out.println("Please enter your password");
        //String password = scan.nextLine();

        //SignInButton.getOnAction();
//        if(SignInButton.isPressed()&&baseAccountList.verifyCredentials(username, password)){
//            System.out.println("Sign-in successful! Welcome " + username);
//
//        } else {
//            System.out.println("Invalid username or password.");
//        }

//        Account blankAccount = new Account();
//        if (blankAccount.verifyCredentials(username, password)) {
//            System.out.println("Sign-in successful! Welcome " + username);
//        } else {
//            System.out.println("Invalid username or password.");
//        }
    }

    @FXML
    public void onNewUserClick(ActionEvent actionEvent) {
        PasswordTextBox.setVisible(false);
        UserNameTextBox.setVisible(false);
        NameTextBox.setVisible(true);
        EmailTextBox.setVisible(true);
        PhoneNumberTextBox.setVisible(true);
        NewPasswordTextBox.setVisible(true);
        NewUserNameTextBox.setVisible(true);
        CreateAccountButton.setVisible(true);

//        if(CreateAccountButton.isPressed()&&baseAccountList.verifyCredentials(username, password)){
//            System.out.println("Username already exists. Please try again.");
//        } else {
//            System.out.println("Account created!");
//            baseAccountList.addAccount(newAccount);
//        }
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

    //I don't think these do anything
//    @FXML
//    public void onUserNameEntered(KeyEvent inputMethodEvent) {
//        username = UserNameTextBox.getText();
//    }
//    @FXML
//    public void onPasswordEntered(InputMethodEvent inputMethodEvent) {
//        password = PasswordTextBox.getText();
//    }
//    @FXML
//    public void onNameEntered(InputMethodEvent inputMethodEvent) {
//        Name = NameTextBox.getText();
//        newAccount.changeName(Name);
//    }
//    @FXML
//    public void onEmailEntered(InputMethodEvent inputMethodEvent) {
//        Email = EmailTextBox.getText();
//        newAccount.updateEmail(Email);
//    }
//    @FXML
//    public void onPhoneNumberEntered(InputMethodEvent inputMethodEvent) {
//        PhoneNumber = PhoneNumberTextBox.getText();
//        newAccount.updatePhoneNum(PhoneNumber);
//    }
//    @FXML
//    public void onNewPasswordEntered(InputMethodEvent inputMethodEvent) {
//        password = NewPasswordTextBox.getText();
//        newAccount.changePW(password);
//    }
//    @FXML
//    public void onNewUserNameEntered(InputMethodEvent inputMethodEvent) {
//        username = NewUserNameTextBox.getText();
//        newAccount.changeUN(username);
//    }

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
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    //createAccount button
    @FXML
    public void onCreateAccountInfoEntered(ActionEvent actionEvent) {
        newAccount = new Account(NameTextBox.getText(), NewPasswordTextBox.getText(), NewUserNameTextBox.getText(), EmailTextBox.getText(), PhoneNumberTextBox.getText());
//        newAccount.changeUN(NewUserNameTextBox.getText());
//        newAccount.changePW(NewPasswordTextBox.getText());
//        newAccount.changeName(NameTextBox.getText());
//        newAccount.changeEmail(EmailTextBox.getText());
//        newAccount.changePhoneNumber(PhoneNumberTextBox.getText());

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
        }
    }
}