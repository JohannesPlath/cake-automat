package automat;

import automat.modules.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

/**
 * Tmp
 */
public class CakeAutomatApplication extends Application {

  /**
   * @param stage Foobar
   * @throws IOException na und?
   */
  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(CakeAutomatApplication.class.getResource("application-view.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 800, 600);
    stage.setTitle("Cakes");
    Image image = new Image(new File(Config.ICON).toURI().toString());
    stage.getIcons().add(image);
    stage.setScene(scene);
    stage.show();
    Logger.getInstance().addLog("Appstate","CakeAutomatApplication.start");
  }

  /**
   * @param args Furry
   */
  public static void main(String[] args) {
    launch();
  }
}