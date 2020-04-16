package Game;

import InteractableObject.InteractableObject;
import InteractableObject.Robot.Robot;
import InteractableObject.Wall;

public class NormalBoard extends GameState {

    public NormalBoard(int boardRowSize, int boardColumnSize){
        InteractableObject[][] holdBoard = new InteractableObject[boardRowSize][boardColumnSize];
        holdBoard[holdBoard.length -1][holdBoard[0].length /2] = new Robot();
        outSideEdgesWalls(holdBoard);
        super.setBoard(holdBoard);
    }
    @Override
    public void victory() {
        System.out.println("Victory");
    }
    @Override
    public void failure() {
        System.out.println("Failure");
    }
    @Override
    public void Update() {}

    private void outSideEdgesWalls(InteractableObject[][] holdBoard){
        for (int r = 0; r < holdBoard.length; r++){
            holdBoard[r][0] = new Wall();
            holdBoard[r][holdBoard[0].length -1] = new Wall();
        }
        for (int c = 0; c < holdBoard[0].length; c++){
            holdBoard[0][c] = new Wall();
            holdBoard[holdBoard[0].length-1][c] = new Wall();
        }

    }
}
