/**
 * The AsteroidBelt class represents a belt of asteroids in a 2D space.
 */
public class AsteroidBelt {
    private double distance;
    private double angle;
    private int numberOfAsteroids;
    private double asteroidDiameter;
    private String asteroidColor;

    /**
     * Constructs a new AsteroidBelt object with the specified parameters.
     *
     * @param distance          The distance of the asteroid belt from the center.
     * @param angle             The initial angle of the asteroid belt.
     * @param numberOfAsteroids The number of asteroids in the belt.
     * @param asteroidDiameter  The diameter of each asteroid.
     * @param asteroidColor     The color of the asteroids.
     */
    public AsteroidBelt(double distance, double angle, int numberOfAsteroids, double asteroidDiameter,
            String asteroidColor) {
        this.distance = distance;
        this.angle = angle;
        this.numberOfAsteroids = numberOfAsteroids;
        this.asteroidDiameter = asteroidDiameter;
        this.asteroidColor = asteroidColor;
    }

    /**
     * Gets the distance of the asteroid belt from the center.
     *
     * @return The distance of the asteroid belt.
     */
    public double getDistance() {
        return distance;
    }

    /**
     * Gets the current angle of the asteroid belt.
     *
     * @return The current angle of the asteroid belt.
     */
    public double getAngle() {
        return angle;
    }

    /**
     * Gets the number of asteroids in the belt.
     *
     * @return The number of asteroids.
     */
    public int getNumberOfAsteroids() {
        return numberOfAsteroids;
    }

    /**
     * Gets the diameter of each asteroid.
     *
     * @return The diameter of each asteroid.
     */
    public double getAsteroidDiameter() {
        return asteroidDiameter;
    }

    /**
     * Gets the color of the asteroids.
     *
     * @return The color of the asteroids.
     */
    public String getAsteroidColor() {
        return asteroidColor;
    }

    /**
     * Updates the angle of the asteroid belt by the specified increment.
     *
     * @param increment The increment by which to update the angle.
     */
    public void updateAngle(double increment) {
        angle += increment;
    }
}
