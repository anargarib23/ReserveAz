package states;

import java.util.Scanner;

import machine.Machine;

public class LoginState extends MachineState {
	
	public LoginState(Machine machine) {
		super(machine);
	}

	@Override
	public void displayStateConsole() { 
		System.out.printf("0. RELOAD\n1. LOGIN\n2. EXIT\n>> ");
	}

	@Override
	public void listen() { //to-do: handle scanner closing. Handle input mismatch
		Scanner scanner = new Scanner(System.in);
		choice = scanner.nextInt();
	}

	@Override
	public void execute() {
		switch(choice) {
		case 0:
			reloadState();
			break;
		case 1:
			startLogin();
			break;
		case 2:
			machine.stop();
			break;
		}
		
	}
	
	private void startLogin() { //Error handling should be applied
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		String number = scanner.next();
		
		System.out.println("Enter your password: ");
		String password = scanner.next();
		
		
	}
	
	@Override
	protected void reloadState() {
		machine.state = new LoginState(machine);
	}
	

}
