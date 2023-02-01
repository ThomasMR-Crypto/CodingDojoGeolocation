package application.three.geolocation;

public class AnglePair {
    private int u, m;

    public AnglePair(int u, int m) {
        this.u = u;
        this.m = m;
    }

    public int getU() {
        return u;
    }

    public int getM() {
        return m;
    }

    @Override
    public String toString() {
        return "Point{" +
                "u=" + u +
                ", m=" + m +
                '}';
    }
}