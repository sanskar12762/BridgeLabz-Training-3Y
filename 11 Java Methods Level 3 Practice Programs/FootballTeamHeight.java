public class FootballTeamHeight {

    public static int sumArray(int[] heights) {
        int sum = 0; for(int h : heights) sum += h;
        return sum;
    }

    public static double meanHeight(int[] heights) {
        return sumArray(heights) / (double)heights.length;
    }

    public static int shortestHeight(int[] heights) {
        int min = heights;
        for(int h : heights) if(h < min) min = h;
        return min;
    }

    public static int tallestHeight(int[] heights) {
        int max = heights;
        for(int h : heights) if(h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        // Generate random heights, call methods and display results
    }
}
