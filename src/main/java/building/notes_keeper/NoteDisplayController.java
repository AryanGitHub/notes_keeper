package building.notes_keeper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class NoteDisplayController implements Initializable{
	

	@FXML
	AnchorPane NoteDisplayBackgroundPane;
	@FXML
	Label HeadingText;
	@FXML
	Label NoteText;
	@FXML 
	Rectangle Background;
	
	
	@FXML
	Hyperlink pin;
//	@FXML ImageView pinButtonImage;
	@FXML
	Hyperlink paint;
//	@FXML ImageView paintButtonImage;
	@FXML
	Hyperlink copy;
//	@FXML ImageView copyButtonImage;
	@FXML
	Hyperlink delete;
//	@FXML ImageView deleteButtonImage;
	@FXML
	Hyperlink more;
//	@FXML ImageView moreButtonImage;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Background.heightProperty().bind(NoteDisplayBackgroundPane.heightProperty());
		Background.widthProperty().bind(NoteDisplayBackgroundPane.widthProperty());
		NoteText.setText("This rder pais rder pais rder pais rder pais rder pais rder pais rder pais rder pais rder pais rder pais rder pais rder pais rder pais rder pane.");
	    try {
			setItconsOfNote();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void setItconsOfNote () throws FileNotFoundException {
		
		 File directory = new File("./src\\main\\resources\\img\\icons\\NoteDisplay\\");
		 String dir = directory.getAbsolutePath();
	     setIconForNode(pin, 20,dir+"\\pin.png"); 
    	 setIconForNode(paint, 20,dir+"\\paint.png");
         setIconForNode(delete, 20,dir+"\\trash.png");
         setIconForNode(more, 20,dir+"\\more.png"); 
       	 setIconForNode(copy,20,dir+"\\copy.png");
										 
		/*
		 * ImageView copyIcon = new ImageView (new Image (new FileInputStream
		 * (dir+"copy.png"))); copyIcon.setFitHeight(10); ImageView pinIcon = new
		 * ImageView (new Image (new FileInputStream (dir+"pin.png"))); ImageView
		 * paintIcon = new ImageView (new Image (new FileInputStream
		 * (dir+"paint.png"))); ImageView deleteIcon = new ImageView (new Image (new
		 * FileInputStream (dir+"trash.png"))); ImageView moreIcon = new ImageView (new
		 * Image (new FileInputStream (dir+"more.png")));
		 * 
		 * pin.setGraphic(pinIcon); copy.setGraphic(copyIcon);
		 * paint.setGraphic(paintIcon); delete.setGraphic(deleteIcon);
		 * more.setGraphic(moreIcon);
		 */
	}
	
	private void setIconForNode (Labeled l, double size , String imageLink) throws FileNotFoundException {
		ImageView Icon = new ImageView (new Image (new FileInputStream (imageLink))); 
		Icon.setFitHeight(size);
		Icon.setFitWidth(size);
		l.setGraphic(Icon);
	}
}