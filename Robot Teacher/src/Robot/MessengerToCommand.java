package Robot;

public interface MessengerToCommand {
    void triggerTurnLeft();
    void triggerTurnRight();
    void triggerWalk();
    Boolean triggerIsChair();
    Boolean triggerIsWall();
}
