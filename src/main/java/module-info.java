module gui.databaseguitest {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;

    requires com.dlsc.formsfx;

    opens gui.databaseguitest to javafx.fxml;
    exports gui.databaseguitest;
}