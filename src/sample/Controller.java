package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import javax.swing.*;

public class Controller {
    @FXML
    private ImageView imagegla;

    @FXML
    private Label Emaillabel;

    @FXML
    private Label label;

    @FXML
    private Label passwordlabel;

    @FXML
    private TextField Emailtextfield;

    @FXML
    private PasswordField passwordtextfield;

    @FXML
    private Button loginbutton;

    @FXML
    void login(ActionEvent event) {

        String Email = Emailtextfield.getText();
        String password = passwordtextfield.getText();
        if (Email.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(null, "Email or password is blank ");
        }
    }


}
