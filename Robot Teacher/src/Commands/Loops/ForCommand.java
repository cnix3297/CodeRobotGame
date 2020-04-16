package Commands.Loops;

import Commands.Boolean.BooleanExpressionCnix;
import Commands.Command;

import java.util.ArrayList;

public class ForCommand extends Command {
    private ArrayList<Command> listOfCommands;
    private int start;
    private int increment;
    private BooleanExpressionCnix until;

    public ForCommand(){}
    ForCommand(ArrayList<Command> listOfCommands, int start, int increment, BooleanExpressionCnix until){
        this.listOfCommands = listOfCommands;
        this.start = start;
        this.increment = increment;
        this.until = until;
    }
    public ArrayList<Command> getListOfCommands() {
        return listOfCommands;
    }

    public void setListOfCommands(ArrayList<Command> listOfCommands) {
        this.listOfCommands = listOfCommands;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getIncrement() {
        return increment;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }

    public BooleanExpressionCnix getUntil() {
        return until;
    }

    public void setUntil(BooleanExpressionCnix until) {
        this.until = until;
    }
    @Override
    public void execute() {
        for (int i = start; until.returnEvaluation(); start = start + increment){
            for (Command command:
                 listOfCommands) {
                command.execute();
            }
        }
    }
}
