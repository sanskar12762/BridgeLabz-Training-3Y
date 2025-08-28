public class StudentVoteChecker {

    public boolean canStudentVote(int age) {
        if(age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        // Implement age input, checker logic and result display for 10 students
    }
}
