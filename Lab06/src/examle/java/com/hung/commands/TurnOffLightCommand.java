package examle.java.com.hung.commands;

import examle.java.com.hung.devices.Light;

public class TurnOffLightCommand implements Command{
	private Light light;

	public TurnOffLightCommand(Light light) {
		super();
		this.light = light;
	}
	
	@Override
	public void execute(){
		light.turnOff();
	}
	
	@Override
	public void undo() {
		light.turnOn();
	}
	
	@Override
	public void redo() {
		light.turnOff();
	}
}
