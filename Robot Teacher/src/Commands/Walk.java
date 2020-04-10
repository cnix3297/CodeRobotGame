package Commands;


import Robot.MessengerToCommand;

public class Walk implements Commandable {
    MessengerToCommand messengerToCommand;
    @Override
    public void execute() {
        messengerToCommand.triggerWalk();
    }
}
