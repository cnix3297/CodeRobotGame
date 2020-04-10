package Game;

import java.awt.*;

public class ErrorChecker {


    public ErrorChecker(){}

    public Boolean isInBounds(Point isThisPointInBounds, Point boardSize){
        if (isThisPointInBounds.x >= boardSize.x) return false;
        if (isThisPointInBounds.y >= boardSize.y) return false;
        if (isThisPointInBounds.x < 0) return false;
        if (isThisPointInBounds.y < 0) return false;
        return true;
    }
}
