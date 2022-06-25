package cn.czyx007.eas_gui;

import cn.czyx007.eas_gui.bean.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

/**
 * @author : 张宇轩
 * @createTime : 2022/6/25 - 15:37
 */
public class StudentMainController {
    static Student student;

    @FXML Text showStudentId;
    @FXML Text showStudentName;
    @FXML Text showStudentDepartment;
    @FXML Text showStudentGrade;

    public void onMainViewButtonClick() {
        showStudentId.setText(student.getId());
        showStudentName.setText(student.getName());
        showStudentDepartment.setText(student.getDepartment());

        String grade = "";
        switch (student.getGrade()){
            case 1:
                grade = "大一";
                break;
            case 2:
                grade = "大二";
                break;
            case 3:
                grade = "大三";
                break;
            case 4:
                grade = "大四";
                break;
            default: grade = "测试";
        }
        showStudentGrade.setText(grade);
    }
}
