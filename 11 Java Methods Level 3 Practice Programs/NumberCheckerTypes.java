public class NumberCheckerTypes {

    public static boolean isPrime(int number) {
        if(number <= 1) return false;
        for(int i=2; i<=Math.sqrt(number); i++)
            if(number % i == 0) return false;
        return true;
    }

    public static boolean isNeon(int number) {
        int sq = number*number, sum=0;
        while(sq>0) { sum += sq%10; sq /= 10; }
        return sum == number;
    }

    public static boolean isSpy(int number) {
        int sum=0, prod=1, temp=number;
        while(temp>0) {
            int d = temp%10; sum+=d; prod*=d; temp/=10;
        }
        return sum==prod;
    }

    public static boolean isAutomorphic(int number) {
        String n = String.valueOf(number), sq = String.valueOf(number*number);
        return sq.endsWith(n);
    }

    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        // Call methods and display results
    }
}
