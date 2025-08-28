
import java.util.Scanner;
public class BMIForPersons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int persons = sc.nextInt();
        double[] weight = new double[persons];
        double[] height = new double[persons];
        double[] bmi = new double[persons];
        String[] status = new String[persons];
        for(int i = 0; i < persons; i++) {
            System.out.println("Enter weight(kg) and height(cm) for person " + (i+1));
            weight[i] = sc.nextDouble();
            height[i] = sc.nextDouble();
            double heightM = height[i] / 100;
            bmi[i] = weight[i] / (heightM * heightM);
            if(bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if(bmi[i] < 25) {
                status[i] = "Normal";
            } else if(bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        for(int i = 0; i < persons; i++) {
            System.out.printf("Person %d - Weight: %.2f, Height: %.2f, BMI: %.2f, Status: %s
", i+1, weight[i], height[i], bmi[i], status[i]);
        }
        sc.close();
    }
}
