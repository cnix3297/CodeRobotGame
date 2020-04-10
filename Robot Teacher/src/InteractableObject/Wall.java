package InteractableObject;

import Game.GameFunctions;

public class Wall extends InteractableObject {
    GameFunctions gameFunctions;

    @Override
    public void interact() {
        gameFunctions.failure();
    }

    @Override
    public void sit() {
        gameFunctions.failure();
    }
}
