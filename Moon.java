/**
 * The Moon class represents a moon in a 2D space.
 */
public class Moon {
    private double distance;
    private double angle;
    private double diameter;
    private String color;

    /**
     * Constructs a new Moon object with the specified parameters.
     *
     * @param distance The distance of the moon from the center.
     * @param angle    The initial angle of the moon.
     * @param diameter The diameter of the moon.
     * @param color    The color of the moon.
     */
    public Moon(double distance, double angle, double diameter, String color) {
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.color = color;
    }

    /**
     * Gets the distance of the moon from the center.
     *
     * @return The distance of the moon.
     */
    public double getDistance() {
        return distance;
    }

    /**
     * Gets the current angle of the moon.
     *
     * @return The current angle of the moon.
     */
    public double getAngle() {
        return angle;
    }

    /**
     * Gets the diameter of the moon.
     *
     * @return The diameter of the moon.
     */
    public double getDiameter() {
        return diameter;
    }

    /**
     * Gets the color of the moon.
     *
     * @return The color of the moon.
     */
    public String getColor() {
        return color;
    }

    /**
     * Updates the angle of the moon by the specified increment.
     *
     * @param increment The increment by which to update the angle.
     */
    public void updateAngle(double increment) {
        angle += increment;
    }
}
