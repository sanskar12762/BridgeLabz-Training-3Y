
import java.util.Scanner;
public class BMIMultiDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int persons = sc.nextInt();
        double[][] personData = new double[persons][3]; // weight, height, bmi
        String[] weightStatus = new String[persons];
        for(int i=0; i<persons; i++) {
            System.out.println("Enter weight(kg) and height(cm) for person " + (i+1));
            double weight=0, height=0;
            while(true) {
                weight = sc.nextDouble();
                height = sc.nextDouble();
                if(weight > 0 && height > 0) break;
                System.out.println("Invalid input. Please enter positive numbers.");
            }
            personData[i][0] = weight;
            personData[i][1] = height;
            double heightM = height / 100;
            double bmi = weight / (heightM * heightM);
            personData[i][2] = bmi;
            if(bmi < 18.5) weightStatus[i] = "Underweight";
            else if(bmi < 25) weightStatus[i] = "Normal";
            else if(bmi < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }
        for(int i=0; i<persons; i++) {
            System.out.printf("Person %d - Weight: %.2f, Height: %.2f, BMI: %.2f, Status: %s
", i+1, personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
        sc.close();
    }
}
