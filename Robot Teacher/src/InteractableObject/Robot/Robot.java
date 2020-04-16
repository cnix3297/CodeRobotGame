package InteractableObject.Robot;


import Game.IGetObjectFromBoard;
import InteractableObject.*;
import Commands.ICommandToRobotGetCoordinates;
import Commands.ICommandToRobotPushCoordinates;
import Game.IGetSizeOfGrid;
import InteractableObject.Chair.Chair;

import java.awt.*;

public class Robot extends InteractableObject implements IBasicMovement, IFrontSensor, IMessengerToCommand {

    public int getDirectionFacing() {
        return directionFacing;
    }

    public void setDirectionFacing(int directionFacing) {
        this.directionFacing = directionFacing;
    }

    private int directionFacing;
    ICommandToRobotGetCoordinates getCoordinates;
    ICommandToRobotPushCoordinates ICommandToRobotPushCoordinates;
    IGetSizeOfGrid IGetSizeOfGrid;
    IGetObjectFromBoard IGetObjectFromBoardInterface;

    public Robot(){
        directionFacing = 0;

    }

    public Robot(Robot robot){
        this.directionFacing = robot.directionFacing;
    }


    //methods to grab information from the board class
    private Point recieveRobotCoordinatesOnBoard(){
        return getCoordinates.getRobotCoordinates();
    }
    private void updateCoordinatesOnBoard(Point point){
        ICommandToRobotPushCoordinates.pushCoordinates(point);
    }
    private Point recieveBoardCoordinatesOnBoard() {return IGetSizeOfGrid.getSizeOfGrid();}

    @Override
    public void walk() {
        Point point = recieveRobotCoordinatesOnBoard();
        switch (directionFacing){
            case 0:
                point.x = point.x - 1;
                updateCoordinatesOnBoard(point);
                break;
            case 1:
                point.y = point.y + 1;
                updateCoordinatesOnBoard(point);
                break;
            case 2:
                point.x = point.x + 1;
                updateCoordinatesOnBoard(point);
                break;
            case 3:
                point.y = point.y -1;
                updateCoordinatesOnBoard(point);
                break;
        }
    }

    @Override
    public void turnLeft() {
        directionFacing = (directionFacing - 1) % 4;
    }

    @Override
    public void turnRight() {
        directionFacing = (directionFacing + 1) % 4;
    }

    @Override
    public Object activateFrontSensor() {
        Point robotLocation = recieveRobotCoordinatesOnBoard();
        switch (directionFacing){
            case 0:
                return IGetObjectFromBoardInterface.getObjectFromBoard(new Point(robotLocation.x -1,robotLocation.y));
            case 1:
                return IGetObjectFromBoardInterface.getObjectFromBoard(new Point(robotLocation.x,robotLocation.y + 1));
            case 2:
                return IGetObjectFromBoardInterface.getObjectFromBoard(new Point(robotLocation.x + 1,robotLocation.y));
            case 3:
                return IGetObjectFromBoardInterface.getObjectFromBoard(new Point(robotLocation.x,robotLocation.y - 1));
        }
        return null;
    }

    public boolean isChair() {
            if (activateFrontSensor().getClass() == Chair.class)
                return true;
            else
                return false;
    }


    public boolean isWall() {
        if (activateFrontSensor().getClass() == Wall.class)
            return true;
        else
            return false;
    }


    //Code to interact with Commands
    @Override
    public void triggerTurnLeft() {
        turnLeft();
    }

    @Override
    public void triggerTurnRight() {
        turnRight();
    }

    @Override
    public void triggerWalk() {
        walk();
    }

    @Override
    public Boolean triggerIsChair() {
        return isChair();
    }

    @Override
    public Boolean triggerIsWall() {
        return  isWall();
    }

    @Override
    public void interact() {}

    @Override
    public void sit() {}
}
