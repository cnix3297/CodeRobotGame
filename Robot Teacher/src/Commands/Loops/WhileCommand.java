package Commands.Loops;

import Commands.Boolean.BooleanExpressionCnix;
import Commands.Command;
import javafx.beans.binding.BooleanExpression;

import java.util.ArrayList;

public class WhileCommand extends Command {


    ArrayList<Command> listOfCommands;
    BooleanExpressionCnix booleanExpression;
    public ArrayList<Command> getListOfCommands() {
        return listOfCommands;
    }

    public void setListOfCommands(ArrayList<Command> listOfCommands) {
        this.listOfCommands = listOfCommands;
    }

    public BooleanExpressionCnix getBooleanExpression() {
        return booleanExpression;
    }

    public void setBooleanExpression(BooleanExpressionCnix booleanExpression) {
        this.booleanExpression = booleanExpression;
    }
    @Override
    public void execute() {
     while(booleanExpression.returnEvaluation()){
         for (Command command:
              listOfCommands) {
             command.execute();
         }
     }
    }
}
