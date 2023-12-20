package gui.databaseguitest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GestionUsers extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("users-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 785, 401);
        stage.setTitle("Journey Wise");
        stage.setScene(scene);
        stage.show();
    }
}
