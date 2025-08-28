public class FriendsAgeHeight {

    public static int findYoungest(int[] ages) {
        int minIndex = 0;
        for(int i = 1; i < ages.length; i++) {
            if(ages[i] < ages[minIndex]) minIndex = i;
        }
        return minIndex;
    }

    public static int findTallest(double[] heights) {
        int maxIndex = 0;
        for(int i = 1; i < heights.length; i++) {
            if(heights[i] > heights[maxIndex]) maxIndex = i;
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        // Implement age/height input and apply methods
    }
}
