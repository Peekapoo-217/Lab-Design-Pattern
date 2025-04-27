package examle.java.com.hung.commands;

import examle.java.com.hung.devices.AirConditioner;

public class TurnOnAirConditionerCommand implements Command{
	private AirConditioner airconditioner;

	public TurnOnAirConditionerCommand(AirConditioner airconditioner) {
		super();
		this.airconditioner = airconditioner;
	}
	
	@Override
	public void execute() {
		airconditioner.turnOn();
	}
	
	@Override
	public void undo() {
		airconditioner.turnOff();
	}
	
	@Override
	public void redo() {
		airconditioner.turnOn();
	}
}
