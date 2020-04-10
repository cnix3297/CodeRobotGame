package Commands.Boolean;

public enum LogicalOperator {

    OR("OR"),
    AND("AND"),
    NOT("NOT");

    private String operator;

    LogicalOperator(String operator) {
        this.operator = operator;
    }


}
