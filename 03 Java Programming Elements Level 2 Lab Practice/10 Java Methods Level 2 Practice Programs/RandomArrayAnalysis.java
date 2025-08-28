public class RandomArrayAnalysis {

    public int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }
        return arr;
    }

    public double[] findAverageMinMax(int[] numbers) {
        int min = numbers, max = numbers, sum = 0;
        for(int n : numbers) {
            if(n < min) min = n;
            if(n > max) max = n;
            sum += n;
        }
        double avg = sum / (double)numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        // Generate array, find average/min/max and display
    }
}
