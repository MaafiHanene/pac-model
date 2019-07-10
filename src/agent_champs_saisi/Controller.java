package agent_champs_saisi;

import agent_pere.Abstraction;
import app.ControleurFils;

public class Controller extends ControleurFils {
	
	Presentation present;
	agent_pere.Controller ctrlPere;
	Abstraction temperature;
	
	
	
	public Controller(Presentation present, Abstraction temperature) {
		
		this.present = present;
		this.temperature = temperature;
		
	}
	
	@Override
	public void sendMessage() {
		
		
	}
	
	
	@Override
	public void receiveMessage(int value) {
		this.temperature.setData(value);
		this.present.update(value);
		
	}

	public Presentation getPresent() {
		return present;
	}

	public void setPresent(Presentation present) {
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
