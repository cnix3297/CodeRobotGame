package InteractableObject.Robot;

public interface IMessengerToCommand {
    void triggerTurnLeft();
    void triggerTurnRight();
    void triggerWalk();
    Boolean triggerIsChair();
    Boolean triggerIsWall();
}
