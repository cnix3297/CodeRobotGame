package Compiler;

import Commands.Boolean.BooleanExpressionCnix;
import Commands.Command;
import Commands.IfElse.IfElseCommand;
import Commands.Loops.ForCommand;
import Commands.Loops.WhileCommand;
import Commands.TurnLeftCommand;
import Commands.TurnRightCommand;
import Commands.WalkCommand;

import java.util.ArrayList;

public class Compiler {
    int currentCount = 0;
    ArrayList<String> listOfLines;
    public Compiler(ArrayList<String> listOfLines){this.listOfLines = listOfLines;}


    public ArrayList<Command> compile(){
                ArrayList<Command> listOfCommands = new ArrayList<>();
                for (int i; !listOfLines.get(currentCount).equals("END"); currentCount++){
                    i = currentCount;
                    KeyWords keyWords = KeyWords.ifContains(listOfLines.get(i));
                    switch (keyWords.tag.toString()){
                        case  "Turn Left":
                            listOfCommands.add(new TurnLeftCommand());
                            break;
                        case "Turn Right":
                            listOfCommands.add(new TurnRightCommand());
                            break;
                        case "Walk":
                            listOfCommands.add(new WalkCommand());
                            break;
                        case "If":
                            IfElseCommand hold = new IfElseCommand();
                            currentCount++;
                            hold.setBooleanExpression(new BooleanExpressionCnix(listOfLines.get(currentCount)));
                            currentCount++;
                            hold.setListOfCommands(compile());
                            if (listOfLines.get(currentCount).equals("else")){
                                IfElseCommand elseCommand = new IfElseCommand();
                                currentCount++;
                                elseCommand.setBooleanExpression(new BooleanExpressionCnix("null"));
                                elseCommand.setListOfCommands(compile());
                                hold.setAnElse(elseCommand);
                            }
                            listOfCommands.add(hold);
                            break;
                        case "For":
                            ForCommand forCommand = new ForCommand();
                            currentCount++;
                            forCommand.setStart(Integer.parseInt(listOfLines.get(i)));
                            currentCount++;
                            forCommand.setIncrement(Integer.parseInt(listOfLines.get(i)));
                            currentCount++;
                            forCommand.setUntil(new BooleanExpressionCnix(listOfLines.get(i)));
                            currentCount++;
                            forCommand.setListOfCommands(compile());
                            listOfCommands.add(forCommand);
                            break;
                        case "While":
                            WhileCommand whileCommand = new WhileCommand();
                            currentCount++;
                            whileCommand.setBooleanExpression(new BooleanExpressionCnix(listOfLines.get(currentCount)));
                            currentCount++;
                            whileCommand.setListOfCommands(compile());
                            listOfCommands.add(whileCommand);
                            break;
                        case "END":
                            return listOfCommands;
                        case "Else":
                            return listOfCommands;

                    }
                }
                return null;
    }




}
