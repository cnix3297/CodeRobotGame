package Commands.Boolean;

import Robot.MessengerToCommand;

public enum RobotActionBoolean {
    isChair("isChair"),
    isWall("isWall");

    private String value;


    RobotActionBoolean(String isWall) {
    }

    MessengerToCommand messengerToCommand;
    public boolean getIsTrue(){

        switch (value){
            case "isChair": return messengerToCommand.triggerIsChair();
            case "isWall" : return messengerToCommand.triggerIsWall();
            default: return false;
        }
    }
}
