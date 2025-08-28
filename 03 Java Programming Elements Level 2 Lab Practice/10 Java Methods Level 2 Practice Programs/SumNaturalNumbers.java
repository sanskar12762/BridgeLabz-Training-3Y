public class SumNaturalNumbers {

    // Recursive method to find sum of n natural numbers
    public static int sumRecursive(int n) {
        if(n == 0) return 0;
        return n + sumRecursive(n-1);
    }

    // Formula method
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        // Implement user input and result comparison
    }
}
