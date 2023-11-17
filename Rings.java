import java.awt.Color;

/**
 * The Rings class represents a set of concentric rings in a 2D space.
 */
public class Rings {
    private double distance;
    private double innerRadius;
    private double outerRadius;
    private String color;

    /**
     * Constructs a new Rings object with the specified parameters.
     *
     * @param distance    The distance of the ring from the center.
     * @param innerRadius The inner radius of the ring.
     * @param outerRadius The outer radius of the ring.
     * @param color       The color of the ring.
     */
    public Rings(double distance, double innerRadius, double outerRadius, String color) {
        this.distance = distance;
        this.innerRadius = innerRadius;
        this.outerRadius = outerRadius;
        this.color = color;
    }

    /**
     * Gets the distance of the ring from the center.
     *
     * @return The distance of the ring.
     */
    public double getDistance() {
        return distance;
    }

    /**
     * Gets the inner radius of the ring.
     *
     * @return The inner radius of the ring.
     */
    public double getInnerRadius() {
        return innerRadius;
    }

    /**
     * Gets the outer radius of the ring.
     *
     * @return The outer radius of the ring.
     */
    public double getOuterRadius() {
        return outerRadius;
    }

    /**
     * Gets the color of the ring.
     *
     * @return The color of the ring.
     */
    public String getColor() {
        return color;
    }
}
