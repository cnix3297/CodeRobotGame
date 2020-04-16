package InteractableObject.Chair;
import Game.IGameFunctions;
import InteractableObject.*;

public class Chair extends InteractableObject {

    IGameFunctions IGameFunctions;

    @Override
    public void interact() {
        IGameFunctions.failure();

    }

    @Override
    public void sit() {
        IGameFunctions.victory();
    }
}