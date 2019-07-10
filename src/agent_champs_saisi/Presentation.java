package agent_champs_saisi;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class Presentation extends VBox {
	private VBox vBox;
	private Label label;
	private TextArea textArea;
	
	public Presentation()
	{	
		
		vBox = new VBox();
	
		this.label = new Label("Température");
		this.textArea = new TextArea();
		textArea.setLayoutX(30);
		textArea.setLayoutY(70);
		textArea.setEditable(false); 
		
		vBox.getChildren().add(label); 
		vBox.getChildren().add(textArea); 
			
	}
	
	
	
	
	
	public VBox getvBox() {
		return vBox;
	}



	public void setvBox(VBox vBox) {
		this.vBox = vBox;
	}



	public Label getLabel() {
		return label;
	}



	public void setLabel(Label label) {
		this.label = label;
	}



	public TextArea getTextArea() {
		return textArea;
	}



	public void setTextArea(TextArea textArea) {
		this.textArea = textArea;
	}



	public void update(int value) {
		textArea.setText(Integer.toString(value));
	}

}
