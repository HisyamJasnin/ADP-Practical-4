module practical4 {
	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires transitive  javafx.graphics;
	
	opens todolist to javafx.fxml;
	opens todolist.controller to javafx.fxml;
	exports todolist;
	exports todolist.model;
	exports todolist.controller;
}