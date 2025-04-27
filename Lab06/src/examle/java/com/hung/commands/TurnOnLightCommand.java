package examle.java.com.hung.commands;

import examle.java.com.hung.devices.Light;

public class TurnOnLightCommand implements Command{
	private Light light;

	public TurnOnLightCommand(Light light) {
		super();
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.turnOn();
	}
	
	@Override
	public void undo() {
		light.turnOff();
	}
	
	@Override
	public void redo() {
		light.turnOn();
	}
}
