package agent_pere;

public class Abstraction {
	
	private int temperature = 0;
	
	public void augmenter() {
		temperature = temperature + 10;
		
	}
	
	public void diminuer() {
		temperature = temperature - 10;
	}
	
	public void reset() {
		temperature = 0;
	}

	public int getDate() {
		return temperature;
	}

	public void setData(int temperature) {
		this.temperature = temperature;
	}

	
}
