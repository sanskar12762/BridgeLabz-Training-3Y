public class NumberAnalysis {

    public boolean isPositive(int number) {
        return number > 0;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int compare(int number1, int number2) {
        if(number1 > number2) return 1;
        if(number1 == number2) return 0;
        return -1;
    }

    public static void main(String[] args) {
        // Implement logic for array of 5 numbers, analysis and comparison
    }
}
