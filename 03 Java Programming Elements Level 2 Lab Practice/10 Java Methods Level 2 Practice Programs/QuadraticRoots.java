public class QuadraticRoots {

    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if(delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if(delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return new double[]{};
        }
    }

    public static void main(String[] args) {
        // Implement input for a, b, c and output roots
    }
}
