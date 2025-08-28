public class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;      // Total pens
        int students = 3;        // Total students

        // Using Division and Modulus
        int pensPerStudent = totalPens / students;   // Quotient → pens each student gets
        int remainingPens = totalPens % students;    // Remainder → pens not distributed

        System.out.println("The Pen Per Student is " + pensPerStudent 
                           + " and the remaining pen not distributed is " + remainingPens);
    }
}
