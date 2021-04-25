package todolist.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;

public class SingleTodoController {
	VBox parentNode;
	
	@FXML
	Label todoLabel;
	
	public void delete(ActionEvent e) {
		Button deleteButton = (Button) e.getSource();
		HBox singleTodo = (HBox) deleteButton.getParent();
		parentNode.getChildren().remove(singleTodo);
	}
	
	public boolean addTodo(String todo, VBox parentNode) {
		this.parentNode = parentNode;
		todoLabel.setText(todo);
		return true;
	}

}
