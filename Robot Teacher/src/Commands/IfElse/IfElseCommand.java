package Commands.IfElse;

import Commands.Boolean.BooleanExpressionCnix;
import Commands.Command;

import java.util.ArrayList;

public class IfElseCommand extends Command {



    BooleanExpressionCnix booleanExpression;
    IfElseCommand anElse;
    ArrayList<Command> listOfCommands;


    public IfElseCommand(){}
    public IfElseCommand(ArrayList<Command> listOfCommands, BooleanExpressionCnix booleanExpression, IfElseCommand anElse){
        this.listOfCommands = listOfCommands;
        this.booleanExpression = booleanExpression;
        this.anElse = anElse;

    }
    public BooleanExpressionCnix getBooleanExpression() {
        return booleanExpression;
    }

    public void setBooleanExpression(BooleanExpressionCnix booleanExpression) {
        this.booleanExpression = booleanExpression;
    }

    public IfElseCommand getAnElse() {
        return anElse;
    }

    public void setAnElse(IfElseCommand anElse) {
        this.anElse = anElse;
    }

    public ArrayList<Command> getListOfCommands() {
        return listOfCommands;
    }

    public void setListOfCommands(ArrayList<Command> listOfCommands) {
        this.listOfCommands = listOfCommands;
    }
    @Override
    public void execute() {
        if (booleanExpression.returnEvaluation()){
            for (Command command:
                 listOfCommands) {
                command.execute();
            }
        }else if (anElse != null && anElse.booleanExpression.returnEvaluation()){
            anElse.execute();
        }
    }
}
