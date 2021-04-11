package org.example.hellodb;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class HelloDB extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("DB driver: " + getDBDriverName());
        label.setFont(Font.font(24));
        StackPane pane = new StackPane(label);
        Scene scene = new Scene(pane, 800, 240);
        stage.setScene(scene);
        stage.show();
    }

    private String getDBDriverName() {
        String url = System.getProperty("db.url", "");
        if(url.isBlank()) throw new IllegalArgumentException("System property 'db.url' is not set");
        String user = System.getProperty("db.user", "");
        String password = System.getProperty("db.password", "");
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            return conn.getMetaData().getDriverName();
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
