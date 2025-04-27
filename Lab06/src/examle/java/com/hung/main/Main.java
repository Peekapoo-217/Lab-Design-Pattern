package examle.java.com.hung.main;

import java.util.Scanner;

import examle.java.com.hung.commands.TurnOffAirConditionerCommand;
import examle.java.com.hung.commands.TurnOffFanCommand;
import examle.java.com.hung.commands.TurnOffLightCommand;
import examle.java.com.hung.commands.TurnOnAirConditionerCommand;
import examle.java.com.hung.commands.TurnOnFanCommand;
import examle.java.com.hung.commands.TurnOnLightCommand;
import examle.java.com.hung.devices.AirConditioner;
import examle.java.com.hung.devices.Fan;
import examle.java.com.hung.devices.Light;
import examle.java.com.hung.remotes.RemoteControl;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Light light = new Light();
		Fan fan = new Fan();
		AirConditioner ac = new AirConditioner();
		RemoteControl remote = new RemoteControl();

		boolean running = true;

		while (running) {
			System.out.println("\nSelect command:");
			System.out.println("1. Turn ON Light");
			System.out.println("2. Turn OFF Light");
			System.out.println("3. Turn ON Fan");
			System.out.println("4. Turn OFF Fan");
			System.out.println("5. Execute all commands");
			System.out.println("6. Exit");
			System.out.println("7. Turn ON AirConditioner");
			System.out.println("8. Turn OFF AirConditioner");
			System.out.println("9. Redo last command");
			System.out.println("10. Undo last command");

			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				remote.addCommand(new TurnOnLightCommand(light));
				break;
			case 2:
				remote.addCommand(new TurnOffLightCommand(light));
				break;
			case 3:
				remote.addCommand(new TurnOnFanCommand(fan));
				break;
			case 4:
				remote.addCommand(new TurnOffFanCommand(fan));
				break;
			case 5:
				remote.executeCommand();
				break;
			case 6:
				running = false;
				break;
			case 7:
				remote.addCommand(new TurnOnAirConditionerCommand(ac));
				break;
			case 8:
				remote.addCommand(new TurnOffAirConditionerCommand(ac));
				break;

			case 9:
				remote.redoLastCommand();
				break;
			case 10:
				remote.undoLastCommand();
				break;

			default:
				System.out.println("Invalid choice. Please select again.");
			}
		}

		scanner.close();
	}
}
