import java.awt.Color;

/**
 * The Planet class is the main method and creates a solar system simulation
 * with various celestial
 * bodies.
 */
public class planet {
        /**
         * The main method creates and runs the solar system simulation.
         *
         * @param args Command-line arguments (not used in this program).
         */
        public static void main(String[] args) {
                SolarSystem solarSystem = new SolarSystem(2000, 1000);
                // Define properties for celestial bodies
                double mercuryDistance = 60;
                double mercuryAngle = 0;
                double mercuryDiameter = 10;
                String mercuryColor = "GRAY";
                double venusDistance = 80;
                double venusAngle = 20;
                double venusDiameter = 20;
                String venusColor = "WHITE";
                double earthDistance = 120;
                double earthAngle = 80;
                double earthDiameter = 20;
                String earthColor = "BLUE";
                double marsDistance = 160;
                double marsAngle = 100;
                double marsDiameter = 15;
                String marsColor = "RED";
                double jupiterDistance = 290;
                double jupiterAngle = 50;
                double jupiterDiameter = 60;
                String jupiterColor = "ORANGE";
                double saturnDistance = 420;
                double saturnAngle = 20;
                double saturnDiameter = 50;
                String saturnColor = "PINK";
                double uranusDistance = 525;
                double uranusAngle = 50;
                double uranusDiameter = 35;
                String uranusColor = "GREEN";
                double neptuneDistance = 600;
                double neptuneAngle = 80;
                double neptuneDiameter = 30;
                String neptuneColor = "CYAN";
                double jupiterRingInnerRadius = jupiterDiameter + 1;
                double uranusRingInnerRadius = uranusDiameter + 5;
                String PlanetRingColor = jupiterColor;
                double saturnRingInnerRadius = saturnDiameter + 1;
                String saturnRingColor = "PINK";
                String uranusRingColor = "GREEN";
                AsteroidBelt asteroidBelt = new AsteroidBelt(200, 150, 15, 3, "WHITE");
                while (true) {
                        solarSystem.setBackground(Color.BLACK); // Correct the method name and use Color.BLACK
                        solarSystem.drawSolarObject(0, 0, 90, "YELLOW");
                        solarSystem.drawSolarObjectAbout(mercuryDistance, mercuryAngle, mercuryDiameter, mercuryColor,
                                        0, 0);
                        solarSystem.drawSolarObjectAbout(venusDistance, venusAngle, venusDiameter, venusColor, 0, 0);
                        solarSystem.drawSolarObjectAbout(earthDistance, earthAngle, earthDiameter, earthColor, 0, 0);
                        solarSystem.drawSolarObjectAbout(marsDistance, marsAngle, marsDiameter, marsColor, 0, 0);
                        solarSystem.drawSolarObjectAbout(jupiterDistance, jupiterAngle, jupiterDiameter, jupiterColor,
                                        0, 0);
                        solarSystem.drawSolarObjectAbout(saturnDistance, saturnAngle, saturnDiameter, saturnColor, 0,
                                        0);
                        solarSystem.drawSolarObjectAbout(uranusDistance, uranusAngle, uranusDiameter, uranusColor, 0,
                                        0);
                        solarSystem.drawSolarObjectAbout(neptuneDistance, neptuneAngle, neptuneDiameter, neptuneColor,
                                        0, 0);
                        // Draw moons for each Planet
                        Moon moonOfEarth = new Moon(15, earthAngle + 180, 5, "WHITE");
                        solarSystem.drawSolarObjectAbout(moonOfEarth.getDistance(), moonOfEarth.getAngle(),
                                        moonOfEarth.getDiameter(), moonOfEarth.getColor(), earthDistance, earthAngle);
                        Moon moonOfmars = new Moon(15, marsAngle + 180, 5, "WHITE");
                        solarSystem.drawSolarObjectAbout(moonOfmars.getDistance(), moonOfmars.getAngle(),
                                        moonOfmars.getDiameter(),
                                        moonOfmars.getColor(), marsDistance, marsAngle);
                        Moon secondmoonOfmars = new Moon(15, marsAngle + 100, 5, "WHITE");
                        solarSystem.drawSolarObjectAbout(secondmoonOfmars.getDistance(), secondmoonOfmars.getAngle(),
                                        secondmoonOfmars.getDiameter(), secondmoonOfmars.getColor(), marsDistance,
                                        marsAngle);
                        Moon moonOfjupiter = new Moon(45, jupiterAngle + 90, 5, "WHITE");
                        solarSystem.drawSolarObjectAbout(moonOfjupiter.getDistance(), moonOfjupiter.getAngle(),
                                        moonOfjupiter.getDiameter(), moonOfjupiter.getColor(), jupiterDistance,
                                        jupiterAngle);
                        Moon secondmoonOfjupiter = new Moon(45, jupiterAngle + 180, 5, "WHITE");
                        solarSystem.drawSolarObjectAbout(secondmoonOfjupiter.getDistance(),
                                        secondmoonOfjupiter.getAngle(),
                                        secondmoonOfjupiter.getDiameter(), secondmoonOfjupiter.getColor(),
                                        jupiterDistance, jupiterAngle);
                        Moon thirdmoonOfjupiter = new Moon(45, jupiterAngle + 270, 5, "WHITE");
                        solarSystem.drawSolarObjectAbout(thirdmoonOfjupiter.getDistance(),
                                        thirdmoonOfjupiter.getAngle(),
                                        thirdmoonOfjupiter.getDiameter(), thirdmoonOfjupiter.getColor(),
                                        jupiterDistance, jupiterAngle);
                        Moon fourthmoonOfjupiter = new Moon(45, jupiterAngle + 360, 5, "WHITE");
                        solarSystem.drawSolarObjectAbout(fourthmoonOfjupiter.getDistance(),
                                        fourthmoonOfjupiter.getAngle(),
                                        fourthmoonOfjupiter.getDiameter(), fourthmoonOfjupiter.getColor(),
                                        jupiterDistance, jupiterAngle);
                        Moon moonOfsaturn = new Moon(45, saturnAngle + 10, 5, "WHITE");
                        solarSystem.drawSolarObjectAbout(moonOfsaturn.getDistance(), moonOfsaturn.getAngle(),
                                        moonOfsaturn.getDiameter(), moonOfsaturn.getColor(), saturnDistance,
                                        saturnAngle);
                        Moon secondmoonOfsaturn = new Moon(45, saturnAngle + 50, 5, "WHITE");
                        solarSystem.drawSolarObjectAbout(secondmoonOfsaturn.getDistance(),
                                        secondmoonOfsaturn.getAngle(),
                                        secondmoonOfsaturn.getDiameter(), secondmoonOfsaturn.getColor(), saturnDistance,
                                        saturnAngle);
                        Moon thirdmoonOfsaturn = new Moon(45, saturnAngle + 100, 5, "WHITE");
                        solarSystem.drawSolarObjectAbout(thirdmoonOfsaturn.getDistance(), thirdmoonOfsaturn.getAngle(),
                                        thirdmoonOfsaturn.getDiameter(), thirdmoonOfsaturn.getColor(), saturnDistance,
                                        saturnAngle);
                        Moon fourthmoonOfsaturn = new Moon(45, saturnAngle + 150, 5, "WHITE");
                        solarSystem.drawSolarObjectAbout(fourthmoonOfsaturn.getDistance(),
                                        fourthmoonOfsaturn.getAngle(),
                                        moonOfsaturn.getDiameter(), moonOfsaturn.getColor(), saturnDistance,
                                        saturnAngle);
                        Moon fifthmoonOfsaturn = new Moon(45, saturnAngle + 200, 5, "WHITE");
                        solarSystem.drawSolarObjectAbout(fifthmoonOfsaturn.getDistance(), fifthmoonOfsaturn.getAngle(),
                                        fifthmoonOfsaturn.getDiameter(), fifthmoonOfsaturn.getColor(), saturnDistance,
                                        saturnAngle);
                        Moon sixthmoonOfsaturn = new Moon(45, saturnAngle + 250, 5, "WHITE");
                        solarSystem.drawSolarObjectAbout(sixthmoonOfsaturn.getDistance(), sixthmoonOfsaturn.getAngle(),
                                        sixthmoonOfsaturn.getDiameter(), sixthmoonOfsaturn.getColor(), saturnDistance,
                                        saturnAngle);
                        Moon seventhmoonOfsaturn = new Moon(45, saturnAngle + 300, 5, "WHITE");
                        solarSystem.drawSolarObjectAbout(seventhmoonOfsaturn.getDistance(),
                                        seventhmoonOfsaturn.getAngle(),
                                        seventhmoonOfsaturn.getDiameter(), seventhmoonOfsaturn.getColor(),
                                        saturnDistance, saturnAngle);
                        Moon moonOfuranus = new Moon(25, uranusAngle + 70, 5, "WHITE");
                        solarSystem.drawSolarObjectAbout(moonOfuranus.getDistance(), moonOfuranus.getAngle(),
                                        moonOfuranus.getDiameter(), moonOfuranus.getColor(), uranusDistance,
                                        uranusAngle);
                        Moon secondmoonOfuranus = new Moon(25, uranusAngle + 140, 5, "WHITE");
                        solarSystem.drawSolarObjectAbout(secondmoonOfuranus.getDistance(),
                                        secondmoonOfuranus.getAngle(),
                                        secondmoonOfuranus.getDiameter(), secondmoonOfuranus.getColor(), uranusDistance,
                                        uranusAngle);
                        Moon thirdmoonOfuranus = new Moon(25, uranusAngle + 210, 5, "WHITE");
                        solarSystem.drawSolarObjectAbout(thirdmoonOfuranus.getDistance(), thirdmoonOfuranus.getAngle(),
                                        thirdmoonOfuranus.getDiameter(), thirdmoonOfuranus.getColor(), uranusDistance,
                                        uranusAngle);
                        Moon fourthmoonOfuranus = new Moon(25, uranusAngle + 280, 5, "WHITE");
                        solarSystem.drawSolarObjectAbout(fourthmoonOfuranus.getDistance(),
                                        fourthmoonOfuranus.getAngle(),
                                        fourthmoonOfuranus.getDiameter(), fourthmoonOfuranus.getColor(), uranusDistance,
                                        uranusAngle);
                        Moon fifthmoonOfuranus = new Moon(25, uranusAngle + 350, 5, "WHITE");
                        solarSystem.drawSolarObjectAbout(fifthmoonOfuranus.getDistance(), fifthmoonOfuranus.getAngle(),
                                        fifthmoonOfuranus.getDiameter(), fifthmoonOfuranus.getColor(), uranusDistance,
                                        uranusAngle);
                        Moon moonOfneptune = new Moon(20, neptuneAngle + 200, 5, "WHITE");
                        solarSystem.drawSolarObjectAbout(moonOfneptune.getDistance(), moonOfneptune.getAngle(),
                                        moonOfneptune.getDiameter(), moonOfneptune.getColor(), neptuneDistance,
                                        neptuneAngle);
                        // Draw asteroids in the asteroid belt
                        for (int i = 0; i < asteroidBelt.getNumberOfAsteroids(); i++) {
                                double asteroidAngle = asteroidBelt.getAngle() + (i * 30); // Distribute asteroids
                                                                                           // evenly
                                solarSystem.drawSolarObjectAbout(
                                                asteroidBelt.getDistance(),
                                                asteroidAngle,
                                                asteroidBelt.getAsteroidDiameter(),
                                                asteroidBelt.getAsteroidColor(),
                                                0,
                                                0);
                        }
                        // Draw rings for Planets with rings (Saturn, Jupiter, Uranus)
                        double ringAngle = 0;
                        double ringDiameter = 2;
                        while (ringAngle < 360) {
                                solarSystem.drawSolarObjectAbout(saturnRingInnerRadius, saturnAngle + ringAngle,
                                                ringDiameter, saturnRingColor, saturnDistance, saturnAngle);
                                ringAngle += 5;
                                solarSystem.drawSolarObjectAbout(jupiterRingInnerRadius, jupiterAngle + ringAngle,
                                                ringDiameter, PlanetRingColor, jupiterDistance, jupiterAngle);

                                solarSystem.drawSolarObjectAbout(uranusRingInnerRadius, uranusAngle + ringAngle,
                                                ringDiameter, uranusRingColor, uranusDistance, uranusAngle);

                                ringAngle += 2;
                        }
                        ;
                        // Update angles for rotation
                        solarSystem.finishedDrawing();
                        venusAngle += 8;
                        mercuryAngle += 7;
                        earthAngle += 6;
                        marsAngle += 5;
                        jupiterAngle += 4;
                        saturnAngle += 3;
                        uranusAngle += 2;
                        neptuneAngle += 1;
                        asteroidBelt.updateAngle(2);
                }
        }
}