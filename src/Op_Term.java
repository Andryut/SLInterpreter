public class Op_Term<T> {
    private String op;
    private Object op_term;

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public Op_Term() {
    }

    public Op_Term(String op, Object op_term) {
        this.op = op;
        this.op_term = op_term;
    }

    public Object getOp_term() {
        return op_term;
    }

    public void setOp_term(Object op_term) {
        this.op_term = op_term;
    }

    @Override
    public String toString() {
        return "Expresion{" +
                "op=" + op +
                ", op_term=" + op_term +
                '}';
    }
}