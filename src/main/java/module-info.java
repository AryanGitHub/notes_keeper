module building.notes_keeper {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;

    opens building.notes_keeper to javafx.fxml;
    exports building.notes_keeper;
}