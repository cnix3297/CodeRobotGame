package Commands;

import java.util.ArrayList;

public abstract class Command implements ICommandable {



    @Override
    abstract public void execute();

}
