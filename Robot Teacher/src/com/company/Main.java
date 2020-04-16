package com.company;

import Commands.Command;
import Game.NormalBoard;
import InteractableObject.Chair.Chair;
import InteractableObject.InteractableObject;
import InteractableObject.Robot.Robot;
import InteractableObject.Wall;
import Compiler.Compiler;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        NormalBoard normalBoard = new NormalBoard(8,8);
        ArrayList<String> commands= new ArrayList<>();
        commands.add("Turn Left");
        ArrayList<Command> listOfCommands = new Compiler(commands).compile();
        for (Command command:
             listOfCommands) {
            command.execute();
        }
        InteractableObject[][] boardToPrint = normalBoard.getBoard();
        printBoard(boardToPrint);

    }

    public static void printBoard(InteractableObject[][] boardToPrint){
        for (int r = 0; r < boardToPrint.length; r++) {
            for (int c = 0; c < boardToPrint[0].length; c++) {
                if (boardToPrint[r][c].getClass().equals(Chair.class)){
                    System.out.print("C \t");
                }else if (boardToPrint[r][c].getClass().equals(Wall.class)){
                    System.out.print("W \t");
                }else if (boardToPrint[r][c].getClass().equals(Robot.class)){
                    System.out.print(((Robot) boardToPrint[r][c]).getDirectionFacing() + "\t");
                    }
                else System.out.print("  \t");
                }
            System.out.println();

                }

            }
        }


