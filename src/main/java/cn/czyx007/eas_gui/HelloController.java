package cn.czyx007.eas_gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

public class HelloController {
    @FXML PasswordField password;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onLoginButtonClick() {
        welcomeText.setText("尝试登录");
    }

    @FXML
    protected void onRegistryButtonClick() {
        welcomeText.setText("输入的密码为：" + password.getText());
    }
}