package Game;

import java.awt.*;

public class NormalBoard extends GameState {
    @Override
    public void victory() {
        System.out.println("Victory");
    }

    @Override
    public void failure() {
        System.out.println("Failure");
    }

    @Override
    public void Update() {

    }
}
