package cn.czyx007.eas_gui;

import cn.czyx007.eas_gui.dao.impl.FacultyDAOImpl;
import cn.czyx007.eas_gui.dao.impl.StudentDAOImpl;
import cn.czyx007.eas_gui.dbc.JDBCUtils;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.Connection;

public class LoginController {
    @FXML TextField userId;
    @FXML PasswordField password;
    @FXML RadioButton radioButtonFaculty;
    @FXML RadioButton radioButtonStudent;

    @FXML
    private Label loginText;

    @FXML
    protected void onLoginButtonClick() {
        String id = userId.getText();
        String passwordText = password.getText();
        FacultyDAOImpl facultyDAO = new FacultyDAOImpl();
        StudentDAOImpl studentDAO = new StudentDAOImpl();

        Connection connection = null;
        try {
            connection = JDBCUtils.getConnection();
            if (radioButtonFaculty.isSelected()){
                Long res = facultyDAO.checkPassword(connection, id, passwordText);
                if (res == null || res == 0)
                    loginText.setText("登陆失败!请检查职工号和密码");
                else {
                    loginText.setText("登陆成功！");

                    FacultyMainController.faculty = facultyDAO.getFacultyById(connection,id);

                    Parent anotherRoot = FXMLLoader.load(LoginController.class.getResource("faculty-main-view.fxml"));
                    Stage anotherStage = new Stage();
                    anotherStage.setTitle("教职工信息管理系统");
                    anotherStage.setScene(new Scene(anotherRoot,320,240));
                    anotherStage.show();
                }
            }else if (radioButtonStudent.isSelected()){
                Long res = studentDAO.checkPassword(connection, id, passwordText);
                if (res == null || res == 0)
                    loginText.setText("登陆失败!请检查学号和密码");
                else {
                    loginText.setText("登陆成功！");

                    StudentMainController.student = studentDAO.getStudentById(connection,id);

                    Parent anotherRoot = FXMLLoader.load(LoginController.class.getResource("student-main-view.fxml"));
                    Stage anotherStage = new Stage();
                    anotherStage.setTitle("学生信息管理系统");
                    anotherStage.setScene(new Scene(anotherRoot,320,240));
                    anotherStage.show();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.closeResource(connection);
        }
    }
}