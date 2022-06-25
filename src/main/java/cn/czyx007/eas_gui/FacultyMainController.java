package cn.czyx007.eas_gui;

import cn.czyx007.eas_gui.bean.Faculty;
import cn.czyx007.eas_gui.bean.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

/**
 * @author : 张宇轩
 * @createTime : 2022/6/25 - 15:16
 */
public class FacultyMainController {
    static Faculty faculty;

    @FXML
    private Label showInfo;

    public void onMainViewButtonClick() {
        showInfo.setText("职工号：" + faculty.getId() + "\n" +
                         "姓名：" + faculty.getName() + "\n" +
                         "性别：" + faculty.getSex() + "\n" +
                         "出生年月日：" + faculty.getBirth() + "\n" +
                         "部门/所在系：" + faculty.getDepartment() + "\n" +
                         "职称：" + faculty.getTitle());
    }

    public void changePassword() {
    }
}
