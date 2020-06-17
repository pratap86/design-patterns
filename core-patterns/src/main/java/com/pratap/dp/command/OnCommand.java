package com.pratap.dp.command;
/**
 * Perform ON command on Television
 * @author Pratap Narayan
 *
 */
public class OnCommand implements Command {

	Television television;
	
	public OnCommand(Television television) {
		this.television = television;
	}
	@Override
	public void execute() {

		television.on();
		
	}

}
