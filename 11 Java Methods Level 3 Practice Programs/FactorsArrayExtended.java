public class FactorsArrayExtended {

    public static int[] getFactors(int number) {
        int count = 0; for(int i=1;i<=number;i++) if(number%i==0) count++;
        int[] factors = new int[count]; int k=0;
        for(int i=1;i<=number;i++) if(number%i==0) factors[k++]=i;
        return factors;
    }

    public static int greatestFactor(int[] factors) {
        int max = factors;
        for(int f : factors) if(f > max) max = f;
        return max;
    }

    public static int sumFactors(int[] factors) {
        int sum = 0; for(int f : factors) sum += f;
        return sum;
    }

    public static int productFactors(int[] factors) {
        int prod = 1; for(int f : factors) prod *= f;
        return prod;
    }

    public static double productCubeFactors(int[] factors) {
        double prod = 1.0; for(int f : factors) prod *= Math.pow(f,3);
        return prod;
    }

    public static void main(String[] args) {
        // Call methods and display results
    }
}
