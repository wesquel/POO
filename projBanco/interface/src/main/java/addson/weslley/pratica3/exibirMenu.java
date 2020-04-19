package addson.weslley.pratica3;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;


public class exibirMenu extends Application{
    private double xOffset;
    private double yOffset;

    public void start(Stage primeiroStagio) throws Exception {

        FXMLLoader loader = new FXMLLoader(new File("C:\\Users\\wesqu\\projBanco\\interface\\src\\main\\java\\addson\\weslley\\pratica3\\exibirMenu.fxml").toURI().toURL());
        Parent root = loader.load();
        //Metodos para mover aplicação.
        root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                xOffset = mouseEvent.getSceneX();
                yOffset = mouseEvent.getSceneY();
            }
        });
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                primeiroStagio.setX(mouseEvent.getScreenX() - xOffset);
                primeiroStagio.setY(mouseEvent.getScreenY() - yOffset);
            }
        });

        primeiroStagio.initStyle(StageStyle.TRANSPARENT);
        primeiroStagio.setTitle("Helo World.");
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        primeiroStagio.setScene(scene);
        primeiroStagio.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
