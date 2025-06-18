import java.util.List;

public class Tags {
    private int id;
    private String types;


    public Tags(int id, String types) {
        this.id = id;
        this.types = types;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return "Tags{" +
                "id=" + id +
                ", types='" + types + '\'' +
                '}';
    }
}
