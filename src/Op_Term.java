public class Op_Term<T> {
    private T op;
    private T term;

    public Op_Term() {
    }

    public Op_Term(T op, T term) {
        this.op = op;
        this.term = term;
    }

    public T getOp() {
        return op;
    }

    public void setOp(T op) {
        this.op = op;
    }

    public T getTerm() {
        return term;
    }

    public void setTerm(T term) {
        this.term = term;
    }

    @Override
    public String toString() {
        return "Expresion{" +
                "op=" + op +
                ", term=" + term +
                '}';
    }
}