/*
 * GameCommand : Interface with functions to execute and undo commands
  */

package com.p532.brickout.intf;

public interface GameCommand {

	void executeCommand();
	void undo();
}
