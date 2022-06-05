import java.util.List;

public class Complement {
    private String type;
    private List items;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List getItems() {
        return items;
    }

    public void setItems(List items) {
        this.items = items;
    }

    public Complement(String type, List items) {
        this.type = type;
        this.items = items;
    }

    public Complement() {
    }

    @Override
    public String toString() {
        return "Complement{" +
                "type='" + type + '\'' +
                ", items=" + items +
                '}';
    }
}
