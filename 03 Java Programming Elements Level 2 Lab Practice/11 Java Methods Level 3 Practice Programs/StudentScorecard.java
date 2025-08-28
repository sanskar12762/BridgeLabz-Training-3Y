public class StudentScorecard {

    public static int[][] generatePCMScores(int n) {
        int[][] arr = new int[n];
        for(int i=0;i<n;i++)
            for(int j=0;j<3;j++)
                arr[i][j] = (int)(Math.random()*90)+10;
        return arr;
    }

    public static double[][] calcTotalAvgPercent(int[][] scores) {
        double[][] out = new double[scores.length];
        for(int i=0;i<scores.length;i++) {
            int total = scores[i]+scores[i][1]+scores[i];
            out[i]=total;
            out[i][1]=total/3.0;
            out[i]=Math.round((total/3.0)*100)/100.0;
        }
        return out;
    }

    public static void main(String[] args) {
        // Print tabular scorecard
    }
}
