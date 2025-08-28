public class NumberCheckerSpecial {

    public static boolean isPerfect(int number) {
        int sum = 0;
        for(int i=1; i<number; i++)
            if(number%i==0) sum+=i;
        return sum == number;
    }

    public static boolean isAbundant(int number) {
        int sum = 0;
        for(int i=1; i<number; i++)
            if(number%i==0) sum+=i;
        return sum > number;
    }

    public static boolean isDeficient(int number) {
        int sum = 0;
        for(int i=1; i<number; i++)
            if(number%i==0) sum+=i;
        return sum < number;
    }

    public static boolean isStrong(int number) {
        int sum = 0, temp = number;
        while(temp > 0) {
            int f = 1, digit = temp % 10;
            for(int i=2; i<=digit; i++) f *= i;
            sum += f; temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        // Call methods and display results
    }
}
