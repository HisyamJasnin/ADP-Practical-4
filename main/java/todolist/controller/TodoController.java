package todolist.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class TodoController {
	@FXML
	VBox todolistVBox;
	@FXML
	TextField todoTextField;
	@FXML
	Label errorLabel;
	
	public void add() throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/todolist/view/SingleTodo.fxml"));
				HBox newTodo = fxmlLoader.load();
				SingleTodoController singleTodoController = fxmlLoader.getController();
				if(singleTodoController.addTodo(todoTextField.getText(), todolistVBox)) {
					
					todolistVBox.getChildren().add(newTodo);
					todoTextField.clear();
				} else {
					
				}
				
	}
}
