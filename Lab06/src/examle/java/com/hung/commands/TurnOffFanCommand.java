package examle.java.com.hung.commands;

import examle.java.com.hung.devices.Fan;

public class TurnOffFanCommand implements Command{
	private Fan fan;

	public TurnOffFanCommand(Fan fan) {
		super();
		this.fan = fan;
	}
	
	@Override
	public void execute() {
		fan.turnOff();
	}
	
	@Override
	public void undo() {
		fan.turnOn();
	}
	
	@Override
	public void redo() {
		fan.turnOff();
	}
}
