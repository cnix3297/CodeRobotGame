package InteractableObject;

import Game.IGameFunctions;

public class Wall extends InteractableObject {
    IGameFunctions IGameFunctions;

    @Override
    public void interact() {
        IGameFunctions.failure();
    }

    @Override
    public void sit() {
        IGameFunctions.failure();
    }
}
