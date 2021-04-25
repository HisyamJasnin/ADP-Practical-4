package todolist;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TodoListApp extends Application {
	
	public void start(Stage arg0) throws Exception{
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("view/Login.fxml"));
		Parent root = fxmlLoader.load();
				
		Scene scene = new Scene(root, 500, 500);
		arg0.setScene(scene);
		
		arg0.setTitle("Todo List App");
		arg0.setResizable(false);
		arg0.sizeToScene();
		arg0.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
