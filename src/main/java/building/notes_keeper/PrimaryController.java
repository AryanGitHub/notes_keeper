package building.notes_keeper;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;

public class PrimaryController implements Initializable {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    @FXML 
    TabPane nav;
    @FXML 
    AnchorPane tt;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DatewiseNoteListTab.fxml"));
		FXMLLoader fxmlLoader2 = new FXMLLoader(getClass().getResource("NoteDisplay.fxml"));
		
		Tab t = null;
	
		try {
			t = fxmlLoader.load();
			Node node = fxmlLoader2.load();
			tt.getChildren().add( node);
			tt.setTopAnchor(node, 0.0);
	        tt.setBottomAnchor(node, 0.0);
	        tt.setLeftAnchor(node, 0.0);
	        tt.setRightAnchor(node, 0.0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		nav.getTabs().add(t);
		
		
	}
    
}
