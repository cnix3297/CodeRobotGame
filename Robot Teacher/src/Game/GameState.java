package Game;

import Commands.CommandToRobotGetCoordinates;
import Commands.CommandToRobotPushCoordinates;
import Robot.*;
import java.awt.Point;


abstract class GameState implements CommandToRobotPushCoordinates, CommandToRobotGetCoordinates, GameFunctions, GetObjectFromBoard, GetSizeOfGrid, Update {
    Object[][] board;
    ErrorChecker errorChecker;

    @Override
    abstract public void victory();

    @Override
    abstract public void failure();

    @Override
    abstract public void Update();

    @Override
    public Object getObjectFromBoard(Point point) {
        return board[point.x][point.y];
    }

    @Override
    public Point getSizeOfGrid() {
        return new Point(board.length, board[0].length);
    }

    @Override
    public Point getRobotCoordinates() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j].getClass().equals(Robot.class)) return new Point(i,j);
            }
        }
        return null;
    }

    @Override
    public void pushCoordinates(Point point) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j].getClass().equals(Robot.class)) board[i][i] = null;
            }
        }
        board[point.x][point.y] = new Robot();
    }
    }


