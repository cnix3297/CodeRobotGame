package Commands;


import InteractableObject.Robot.IMessengerToCommand;

public class WalkCommand extends Command {
    IMessengerToCommand IMessengerToCommand;
    @Override
    public void execute() {
        IMessengerToCommand.triggerWalk();
    }
}
