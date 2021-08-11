package automat.modules.logging;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Logger {

  private static Logger INSTANCE;

  // TODO: linked list
  private final ArrayList<Log> logs;
  private ObservableList<Log> observableList;
//  private LoggingController controller;

  public static Logger getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new Logger();
    }
    return INSTANCE;
  }

  private Logger() {
    logs = new ArrayList<>();
    observableList = FXCollections.observableList(logs);
    observableList.addListener(new ListChangeListener() {

      @Override
      public void onChanged(ListChangeListener.Change change) {
        System.out.println("Detected a change! ");
      }
    });
  }

//  public void setLoggingController(LoggingController controller) {
//    this.controller = controller;
//  }

  public void addLog(String message) {
    addLog("", message);
  }

  public void addLog(String category, String message) {
    logs.add(new Log(category, message));
    for (Log l : logs) {
      System.out.println(l.category.concat(l.message));
//      controller.addMessage(l.message);
    }
  }

  private class Log {

    public String category;
    public String message;

    // TODO: there is better word then category
    public Log(String category, String message) {

      this.category = category;
      this.message = message;
    }
  }
}
