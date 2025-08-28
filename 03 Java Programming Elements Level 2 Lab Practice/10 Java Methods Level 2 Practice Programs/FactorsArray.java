public class FactorsArray {

    // Static method to find factors of a number and return them as an array
    public static int[] getFactors(int number) {
        int count = 0;
        // Count the factors
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        // Store the factors
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) factors[index++] = i;
        }
        return factors;
    }

    // Method to sum the factors
    public static int sumFactors(int[] factors) {
        int sum = 0;
        for(int f : factors) sum += f;
        return sum;
    }

    // Method to product of the factors
    public static int productFactors(int[] factors) {
        int prod = 1;
        for(int f : factors) prod *= f;
        return prod;
    }

    // Method to sum of squares of factors
    public static int sumSquaresFactors(int[] factors) {
        int sum = 0;
        for(int f : factors) sum += Math.pow(f, 2);
        return sum;
    }

    public static void main(String[] args) {
        // Implement user input logic here
    }
}
