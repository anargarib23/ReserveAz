package machine;

import states.MachineState;
import states.LoginState;

public class Machine {
	private boolean running;
	public MachineState state; //access modifier
	
	/**
	 * Initializes the Machine properties according to the given configuration data.
	 */
	public void init() {
		state = new LoginState(this);
	}
	
	/**
	 * Launches the Machine.
	 */
	public void launch() {
		running = true;
		run();
	}
	
	/**
	 * Runs the states.
	 */
	public void run() {
		while(running) {
			state.displayStateConsole();
			state.listen();
			state.execute();
		}
	}
	
	/**
	 * Stops the Machine.
	 */
	public void stop() {
		running = false;
	}
}
