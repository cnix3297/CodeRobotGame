package Commands.Boolean;

import InteractableObject.Robot.IMessengerToCommand;

public enum RobotActionBoolean {
    isChair("isChair"),
    isWall("isWall");

    private String value;


    RobotActionBoolean(String isWall) {
    }

    IMessengerToCommand IMessengerToCommand;
    public boolean getIsTrue(){
        switch (value){
            case "isChair": return IMessengerToCommand.triggerIsChair();
            case "isWall" : return IMessengerToCommand.triggerIsWall();
            default: return false;
        }
    }
}
