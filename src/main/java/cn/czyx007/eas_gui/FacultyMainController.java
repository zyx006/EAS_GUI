package cn.czyx007.eas_gui;

import cn.czyx007.eas_gui.bean.Faculty;
import cn.czyx007.eas_gui.bean.Student;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

/**
 * @author : 张宇轩
 * @createTime : 2022/6/25 - 15:16
 */
public class FacultyMainController {
    static Faculty faculty;

    @FXML Text showFacultyId;
    @FXML Text showFacultyName;
    @FXML Text showFacultyDepartment;
    @FXML Text showFacultyTitle;

    public void onMainViewButtonClick() {
        showFacultyId.setText(faculty.getId());
        showFacultyName.setText(faculty.getName());
        showFacultyDepartment.setText(faculty.getDepartment());
        showFacultyTitle.setText(faculty.getTitle());
    }
}
