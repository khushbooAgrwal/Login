package sample;

import database.DatabaseConnection;
import database.UserValueFetcher;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
        DatabaseConnection connection = new DatabaseConnection();
        connection.createConnection();
        UserValueFetcher userValueFetcher = new UserValueFetcher();
        System.out.println(userValueFetcher.fetchUser(
                "khushboo.agrawal_cs.da19@gla.ac.in",
                connection.getConnection()
        ));
    }
}
