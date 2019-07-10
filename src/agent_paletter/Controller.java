package agent_paletter;

import agent_champs_saisi.Presentation;
import agent_pere.Abstraction;
import app.ControleurFils;

public class Controller extends ControleurFils {
	
	agent_paletter.Presentation present;
	agent_pere.Controller ctrlPere;
	Abstraction temperature;
	

	
	public Controller(agent_paletter.Presentation pPalette, Abstraction temperature) {
		
		this.present = pPalette;
		this.temperature = temperature;
		
	}
	
	@Override
	public void sendMessage(int option) {
		
	 this.ctrlPere.updatee(option);
		
	}
	
	
	@Override
	public void receiveMessage(int value) {
		
		this.temperature.setData(value);
	}

	public agent_paletter.Presentation getPresent() {
		return present;
	}

	public void setPresent(agent_paletter.Presentation present) {
		this.present = present;
	}

	public agent_pere.Controller getCtrlPere() {
		return ctrlPere;
	}

	public void setCtrlPere(agent_pere.Controller ctrlPere) {
		this.ctrlPere = ctrlPere;
	}

	public Abstraction getTemperature() {
		return temperature;
	}

	public void setTemperature(Abstraction temperature) {
		this.temperature = temperature;
	}

	
	
}
