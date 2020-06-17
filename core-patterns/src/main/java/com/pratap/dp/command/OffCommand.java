package com.pratap.dp.command;
/**
 * Perform OFF command on Television
 * @author Pratap Narayan
 *
 */
public class OffCommand implements Command {

	Television television;
	
	public OffCommand(Television television) {
		this.television = television;
	}
	@Override
	public void execute() {

		television.off();
		
	}

}
