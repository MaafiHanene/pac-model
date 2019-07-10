package agent_paletter;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Presentation {
	
	private HBox hBox;
	private Button buttonAugmenter;
	private Button buttonDiminuer;
	private Button buttonReset;
	
	Controller ctrl;
	
	public Presentation()
	{
		hBox = new HBox();
		
		
		buttonAugmenter = new Button("Augmenter");
		
		buttonDiminuer = new Button("Diminuer");
		
		buttonReset = new Button("Reset");
		
		hBox.getChildren().add(buttonAugmenter);
		hBox.getChildren().add(buttonDiminuer);
		hBox.getChildren().add(buttonReset);
		
		this.buttonAugmenter.setOnAction(new EventHandler<ActionEvent>() {
         	 @Override
              public void handle(ActionEvent e) {
                
         		ctrl.sendMessage(1);
         	 }
         });
		
		this.buttonDiminuer.setOnAction(new EventHandler<ActionEvent>() {
        	 @Override
             public void handle(ActionEvent e) {
               
        		ctrl.sendMessage(2);
        	 }
        });
		
		this.buttonReset.setOnAction(new EventHandler<ActionEvent>() {
       	 @Override
            public void handle(ActionEvent e) {
              
       		ctrl.sendMessage(3);
       	 }
       });
	}
	
	
	
	
	public HBox gethBox() {
		return hBox;
	}




	public void sethBox(HBox hBox) {
		this.hBox = hBox;
	}




	public Button getButtonAugmenter() {
		return buttonAugmenter;
	}




	public void setButtonAugmenter(Button buttonAugmenter) {
		this.buttonAugmenter = buttonAugmenter;
	}




	public Button getButtonDiminuer() {
		return buttonDiminuer;
	}




	public void setButtonDiminuer(Button buttonDiminuer) {
		this.buttonDiminuer = buttonDiminuer;
	}




	public Button getButtonReset() {
		return buttonReset;
	}




	public void setButtonReset(Button buttonReset) {
		this.buttonReset = buttonReset;
	}




	public Controller getCtrl() {
		return ctrl;
	}




	public void setCtrl(Controller ctrl)
    {
    	this.ctrl = ctrl;
    }
	
	

}
