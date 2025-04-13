package com.example.speedsters1_0;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
    Account baseAccountList = new Account();
    Account newAccount = new Account();
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
    @FXML
    public void onUserNameEntered(KeyEvent inputMethodEvent) {
        username = UserNameTextBox.getText();
    }
    @FXML
    public void onPasswordEntered(InputMethodEvent inputMethodEvent) {
        password = PasswordTextBox.getText();
    }
    @FXML
    public void onNameEntered(InputMethodEvent inputMethodEvent) {
        Name = NameTextBox.getText();
        newAccount.changeName(Name);
    }
    @FXML
    public void onEmailEntered(InputMethodEvent inputMethodEvent) {
        Email = EmailTextBox.getText();
        newAccount.updateEmail(Email);
    }
    @FXML
    public void onPhoneNumberEntered(InputMethodEvent inputMethodEvent) {
        PhoneNumber = PhoneNumberTextBox.getText();
        newAccount.updatePhoneNum(PhoneNumber);
    }
    @FXML
    public void onNewPasswordEntered(InputMethodEvent inputMethodEvent) {
        password = NewPasswordTextBox.getText();
        newAccount.changePW(password);
    }
    @FXML
    public void onNewUserNameEntered(InputMethodEvent inputMethodEvent) {
        username = NewUserNameTextBox.getText();
        newAccount.changeUN(username);
    }

    //These work to create a generic account
    @FXML
    public void onSignInInfoEntered(ActionEvent actionEvent) {
        username = UserNameTextBox.getText();
        password = PasswordTextBox.getText();
        if(baseAccountList.verifyCredentials(username, password)){
            System.out.println("Sign-in successful! Welcome " + username);

        } else {
            System.out.println("Invalid username or password.");
        }
    }

    @FXML
    public void onCreateAccountInfoEntered(ActionEvent actionEvent) {
        newAccount.changeUN(NewUserNameTextBox.getText());
        newAccount.changePW(NewPasswordTextBox.getText());
        //username = NewUserNameTextBox.getText();
        //password = NewPasswordTextBox.getText();
        newAccount.changeName(NameTextBox.getText());
        newAccount.updateEmail(EmailTextBox.getText());
        newAccount.updatePhoneNum(PhoneNumberTextBox.getText());
        //Name = NameTextBox.getText();
        //Email = EmailTextBox.getText();
        //PhoneNumber = PhoneNumberTextBox.getText();
        if(baseAccountList.verifyCredentials(newAccount.UserName, newAccount.Password)){
            System.out.println("Username already exists. Please try again.");
        } else {
            System.out.println("Account created!");
            baseAccountList.addAccount(newAccount);
            System.out.println(baseAccountList.getAccountList().get(0).Name);
        }
    }
}