module cn.czyx007.eas_gui {
    requires javafx.controls;
    requires javafx.fxml;


    opens cn.czyx007.eas_gui to javafx.fxml;
    exports cn.czyx007.eas_gui;
}