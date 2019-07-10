package agent_pere;

import javafx.geometry.Insets;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.chart.XYChart;


public class Presentation {
	
		private Controller ctrlPere;
		private StackPane pane = new StackPane();
	 	private int nbModif = 0;
		final NumberAxis xAxis = new NumberAxis();
	    final NumberAxis yAxis = new NumberAxis();
	    final LineChart<Number,Number> lineChart = 
                new LineChart<Number,Number>(xAxis,yAxis);
	    
	    private XYChart.Series series = new XYChart.Series();
	    
	    public Presentation() {
	    	
	    	xAxis.setLabel("Modif");
	    	yAxis.setLabel("Temp");
	        lineChart.getData().add(series);

	    	pane.getChildren().add(lineChart);
	    	
	    	
		}


		

	    public StackPane getPane() {
	    	return this.pane;
	    }
	    
	    
	    public void setCtrl(Controller ctrl)
	    {
	    	this.ctrlPere = ctrl;
	    }
	    
	    public void addTuple(int y) {
	    	
	    	series.getData().add(new XYChart.Data(nbModif++, y));
	    	
	    }
	    
	
		

}
