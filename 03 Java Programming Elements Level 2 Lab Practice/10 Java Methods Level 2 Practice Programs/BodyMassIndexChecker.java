public class BodyMassIndexChecker {

    public static double calculateBMI(double weightKg, double heightCm) {
        double heightM = heightCm / 100.0;
        return weightKg / (heightM * heightM);
    }

    public static String bmiStatus(double bmi) {
        if(bmi < 18.5) return "Underweight";
        if(bmi < 25) return "Normal";
        if(bmi < 30) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        // For 10 people, collect height/weight and display BMI/status
    }
}
