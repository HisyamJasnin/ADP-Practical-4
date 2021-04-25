package todolist.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LoginController {
	
	@FXML
	private TextField usernameTextField, passwordTextField;
	@FXML
	private CheckBox showPasswordCheckBox;
	@FXML
	private Label errorLabel;
	
	public void login() {
		String username = usernameTextField.getText();
		String password = passwordTextField.getText();
		if(username.toLowerCase().equals("test")
				&& password.equals("test")) {
				errorLabel.setText("Able to login");
				} else {
				errorLabel.setText("Wrong credentials.");
				}
	}
	
	public void register() {
	}

}
