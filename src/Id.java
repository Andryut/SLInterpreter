import java.util.HashMap;

public class Id {
    private String type;
    private String name;
    private HashMap<String, Object> structure;

    public Id(String name) {
        this.name = name;
        this.structure = new HashMap<>();
    }

    public void put(String name, Object value) {
        structure.put(name, value);
    }

    public Object get(String name) {
        return structure.get(name);
    }

    @Override
    public String toString() {
        return "Register{" +
                "name='" + name + '\'' +
                ", structure=" + structure +
                '}';
    }
}
