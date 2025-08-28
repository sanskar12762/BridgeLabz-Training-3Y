public class SalaryBonusCalculator {

    public static int[][] generateSalaryService(int employeeCount) {
        int[][] arr = new int[employeeCount];
        for(int i=0; i<employeeCount; i++) {
            arr[i] = (int)(Math.random()*90000)+10000; // salary
            arr[i][1] = (int)(Math.random()*30)+1; // years
        }
        return arr;
    }

    public static double[][] calcNewSalaryBonus(int[][] salaryService) {
        double[][] out = new double[salaryService.length];
        for(int i=0;i<salaryService.length;i++) {
            double bonus = salaryService[i][1]>5 ? salaryService[i]*0.05 : salaryService[i]*0.02;
            out[i] = salaryService[i]; // old
            out[i][1] = salaryService[i]+bonus; // new
            out[i] = bonus;
        }
        return out;
    }

    public static void main(String[] args) {
        // Calculate and print tabular results
    }
}
