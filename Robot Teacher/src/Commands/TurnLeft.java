package Commands;


import Robot.MessengerToCommand;

public class TurnLeft implements Commandable {
    MessengerToCommand messengerToCommand;

    @Override
    public void execute() {
        messengerToCommand.triggerTurnLeft();
    }
}
