package todolist.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import todolist.TodoListApp;

public class LoginController {
	
	@FXML
	private TextField usernameTextField, passwordTextField;
	@FXML
	private CheckBox showPasswordCheckBox;
	@FXML
	private Label errorLabel;
	
	public void login() throws Exception {
		String username = usernameTextField.getText();
		String password = passwordTextField.getText();
		if(username.toLowerCase().equals("test")
				&& password.equals("test")) {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/todolist/view/Todo.fxml"));
					Parent root = fxmlLoader.load();
					
					Scene scene = new Scene(root, 500, 500);
					TodoListApp.mainStage.setScene(scene);
				} else {
				errorLabel.setText("Wrong credentials.");
				}
	}
	
	public void register() {
	}

}
