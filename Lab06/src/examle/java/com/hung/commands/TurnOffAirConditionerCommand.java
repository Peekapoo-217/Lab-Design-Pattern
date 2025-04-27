package examle.java.com.hung.commands;

import examle.java.com.hung.devices.AirConditioner;

public class TurnOffAirConditionerCommand implements Command{
	private AirConditioner airconditioner;

	public TurnOffAirConditionerCommand(AirConditioner airconditioner) {
		super();
		this.airconditioner = airconditioner;
	}
	
	@Override
	public void execute() {
		airconditioner.turnOff();
	}
	
	@Override
	public void undo() {
		airconditioner.turnOn();
	}
	
	@Override
	public void redo() {
		airconditioner.turnOff();
	}
}
