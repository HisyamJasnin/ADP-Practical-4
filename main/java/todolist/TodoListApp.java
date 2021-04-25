package todolist;

import javafx.application.Application;
import javafx.stage.Stage;

public class TodoListApp extends Application {
	
	public void start(Stage arg0) throws Exception{
		arg0.setTitle("Todo List App");
		arg0.setResizable(false);
		arg0.sizeToScene();
		arg0.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
