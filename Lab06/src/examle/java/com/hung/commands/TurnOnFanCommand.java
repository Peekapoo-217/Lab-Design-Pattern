package examle.java.com.hung.commands;

import examle.java.com.hung.devices.Fan;

public class TurnOnFanCommand implements Command{
	private Fan fan;

	public TurnOnFanCommand(Fan fan) {
		super();
		this.fan = fan;
	}
	
	@Override
	public void execute() {
		fan.turnOn();
	}
	
	@Override
	public void undo() {
		fan.turnOff();
	}
	
	@Override
	public void redo() {
		fan.turnOn();
	}
}
