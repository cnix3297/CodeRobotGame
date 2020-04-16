package Commands;


import InteractableObject.Robot.IMessengerToCommand;

public class TurnLeftCommand extends Command {
    IMessengerToCommand IMessengerToCommand;

    @Override
    public void execute() {
        IMessengerToCommand.triggerTurnLeft();
    }
}
