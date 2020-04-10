package Commands;


import Robot.MessengerToCommand;


public class TurnRight implements Commandable {
    MessengerToCommand messengerToCommand;

    @Override
    public void execute() {
        messengerToCommand.triggerTurnRight();
    }
}
