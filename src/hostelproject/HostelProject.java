/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelproject;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 *
 * @author Pranav
 */
public class HostelProject extends Application
{
    static Scene scene;
    static Statement statement;

    @Override
    public void start(Stage stage) throws SQLException, IOException
    {
        Parent root = (Parent)FXMLLoader.load(getClass().getResource("/hostelproject/MainScene.fxml"));
        scene = new Scene(root);
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        Image ico=new Image("file:///C:/Users/Aditya/Documents/NetBeansProjects/hostelproject/src/hostelproject/media/net.");
        stage.setTitle("DBA Hostel");
        stage.getIcons().add(ico);
        stage.setX(bounds.getMinX());
        stage.setY(bounds.getMinY());
        stage.setWidth(bounds.getWidth());
        stage.setHeight(bounds.getHeight());
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }    
}