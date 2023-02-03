public class Location extends Point2D {

    private String name;

    Location(String name, double x, double y) {
        super(x, y);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
