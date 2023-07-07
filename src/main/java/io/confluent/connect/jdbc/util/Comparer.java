package io.confluent.connect.jdbc.util;

import java.sql.Timestamp;

public class Comparer {
    private final Object leftOperand;

    public Comparer(Object leftOperand) {
        this.leftOperand = leftOperand;
    }

    public boolean before(Object rightOperand) throws IllegalArgumentException {
        if (leftOperand instanceof Timestamp && rightOperand instanceof Timestamp) {
            Timestamp lVal = (Timestamp) leftOperand;
            Timestamp rVal = (Timestamp) rightOperand;

            return lVal.before(rVal);
        } else if (leftOperand instanceof byte[] && rightOperand instanceof byte[]) {
            byte[] lVal = (byte[]) leftOperand;
            byte[] rVal = (byte[]) rightOperand;
        }

        throw new IllegalArgumentException("Both operands should share same type");
    }
}