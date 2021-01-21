package states;

import machine.Machine;

public abstract class MachineState {
	protected Machine machine;
	protected int choice;
	
	public MachineState(Machine machine) {
		this.machine = machine;
	}

	/**
	 * Displays state elements (choices) on the console.
	 */
	public abstract void displayStateConsole();
	
	/**
	 * Listens to user input and reads it with scanner
	 */
	public abstract void listen();
	
	/**
	 * Performs an operation based on the user input. 
	 */
	public abstract void execute();
	
	/**
	 * Refreshes the state.
	 */
	protected abstract void reloadState();
}
