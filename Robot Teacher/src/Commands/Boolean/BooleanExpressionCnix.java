package Commands.Boolean;

import javax.swing.*;

//This class can only handle 1 operator with a left and right. It cannot handle complex Boolean Expressions
//Can handle not. In the Layout "![Expression] || [Expression]"
public class BooleanExpressionCnix {
    String booleanExpression;
    String leftSide;
    String operator;
    String rightSide;

    public BooleanExpressionCnix(String string) {
        booleanExpression = string;

        String[] hold = string.split(" ");
        if (hold.length > 1) {
            leftSide = hold[0];
            operator = hold[1];
            rightSide = hold[2];
        }
    }

    public boolean returnEvaluation(){

        if (leftSide != null) {
            switch (operator) {
                case "OR":
                    return (evaluate(leftSide) || evaluate(rightSide));
                case "AND":
                    return (evaluate(leftSide) && evaluate(rightSide));
                default:
                    return false;
            }
        }else{
            return evaluate(booleanExpression);
        }
    }

    private boolean evaluate(String evaluation) {
        if (evaluation.charAt(0) == '!') {
            evaluation = evaluation.substring(1);
            return RobotActionBoolean.valueOf(evaluation).getIsTrue();
        }else {
            return RobotActionBoolean.valueOf(evaluation).getIsTrue();
        }


    }

}
