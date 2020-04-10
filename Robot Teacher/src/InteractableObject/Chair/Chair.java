package InteractableObject.Chair;
import Game.GameFunctions;
import InteractableObject.*;

public class Chair extends InteractableObject {

    GameFunctions gameFunctions;

    @Override
    public void interact() {
        gameFunctions.failure();

    }

    @Override
    public void sit() {
        gameFunctions.victory();
    }
}