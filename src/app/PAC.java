package app;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PAC extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			primaryStage.setTitle("Line Chart Sample");
			
			StackPane root = new StackPane();
			
			agent_pere.Presentation presentPere = new agent_pere.Presentation();
			agent_pere.Abstraction temp = new agent_pere.Abstraction();
			agent_pere.Controller cPere = new agent_pere.Controller(presentPere, temp);
			presentPere.setCtrl(cPere);
			
			agent_champs_saisi.Presentation pChSaisi = new agent_champs_saisi.Presentation();
			agent_champs_saisi.Controller cChSaisi = new agent_champs_saisi.Controller(pChSaisi, cPere.getTemperature() );
			cChSaisi.setCtrlPere(cPere);
			cPere.setCtrlChSaisi(cChSaisi);
			
			agent_paletter.Presentation pPalette = new agent_paletter.Presentation();
			agent_paletter.Controller cPalette = new agent_paletter.Controller(pPalette, cPere.getTemperature());
			cPalette.setCtrlPere(cPere);
			pPalette.setCtrl(cPalette);
			cPere.setCtrlPalette(cPalette);
			
			root.getChildren().add(presentPere.getPane());
			root.getChildren().add(pChSaisi.getvBox());
			root.getChildren().add(pPalette.gethBox());
			
			Scene scene  = new Scene(root,800,600);
	        
	       
			primaryStage.setScene(scene);
	        primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}