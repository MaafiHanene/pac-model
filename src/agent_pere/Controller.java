package agent_pere;

import app.ControleurPere;

public class Controller extends ControleurPere {
	
	Presentation present;
	Abstraction temperature;
	agent_champs_saisi.Controller ctrlChSaisi;
	agent_paletter.Controller ctrlPalette;
	
	public Controller(Presentation present, Abstraction temperature) {
		this.present = present;
		this.temperature = temperature;	
	}
	
	
	
	public Presentation getPresent() {
		return present;
	}



	public void setPresent(Presentation present) {
		this.present = present;
	}



	public Abstraction getTemperature() {
		return temperature;
	}



	public void setTemperature(Abstraction temperature) {
		this.temperature = temperature;
	}



	public agent_champs_saisi.Controller getCtrlChSaisi() {
		return ctrlChSaisi;
	}



	public void setCtrlChSaisi(agent_champs_saisi.Controller ctrlChSaisi) {
		this.ctrlChSaisi = ctrlChSaisi;
	}



	public agent_paletter.Controller getCtrlPalette() {
		return ctrlPalette;
	}



	public void setCtrlPalette(agent_paletter.Controller ctrlPalette) {
		this.ctrlPalette = ctrlPalette;
	}

	@Override
	public void updatee(int option) {
		
		switch(option) {
			case 1://Augmenter
				this.temperature.augmenter();
				this.present.addTuple(this.temperature.getDate());
				this.ctrlChSaisi.receiveMessage(this.temperature.getDate());
				this.ctrlPalette.receiveMessage(this.temperature.getDate());
				this.present.addTuple(this.temperature.getDate());
				break;
				
			case 2://Diminuer
				this.temperature.diminuer();
				this.present.addTuple(this.temperature.getDate());
				this.ctrlChSaisi.receiveMessage(this.temperature.getDate());
				this.ctrlPalette.receiveMessage(this.temperature.getDate());
				this.present.addTuple(this.temperature.getDate());
				break;
				
			case 3://Reset
				this.temperature.reset();
				this.present.addTuple(this.temperature.getDate());
				this.ctrlChSaisi.receiveMessage(this.temperature.getDate());
				this.ctrlPalette.receiveMessage(this.temperature.getDate());
				this.present.addTuple(this.temperature.getDate());
				break;
		}
		
	}
	
	

	
	
 
}
