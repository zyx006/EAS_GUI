module cn.czyx007.eas_gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens cn.czyx007.eas_gui to javafx.fxml;
    exports cn.czyx007.eas_gui;
}