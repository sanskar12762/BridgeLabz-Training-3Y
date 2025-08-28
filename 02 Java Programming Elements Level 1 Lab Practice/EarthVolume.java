public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;                          // radius in km
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);

        // Conversion factor: 1 km³ = 0.2399127586 mi³
        double volumeMi3 = volumeKm3 * 0.2399127586;

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                           " and cubic miles is " + volumeMi3);
    }
}
