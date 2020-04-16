package Commands;


import InteractableObject.Robot.IMessengerToCommand;


public class TurnRightCommand extends Command {
    IMessengerToCommand IMessengerToCommand;

    @Override
    public void execute() {
        IMessengerToCommand.triggerTurnRight();
    }
}
