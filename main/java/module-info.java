module ADPpractical4 {
	requires javafx.base;
	 requires javafx.controls;
	 requires javafx.fxml;
	 requires transitive javafx.graphics;

	 opens todolist to javafx.fxml;
	 exports todolist;
}