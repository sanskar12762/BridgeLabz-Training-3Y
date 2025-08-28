public class NumberCheckerHarshadFreq {

    public static int countDigits(int number) {
        return (int)Math.floor(Math.log10(number)+1);
    }

    public static int[] getDigits(int number, int count) {
        int[] digits = new int[count]; int temp = number;
        for(int i = count-1; i>=0; i--) {
            digits[i] = temp % 10; temp /= 10;
        }
        return digits;
    }

    public static int sumDigits(int[] digits) {
        int sum = 0; for(int d : digits) sum += d;
        return sum;
    }

    public static int sumSquares(int[] digits) {
        int sum = 0; for(int d : digits) sum += Math.pow(d,2);
        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        return number % sumDigits(digits) == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int freq[] = new int;
        for(int d : digits) freq[d]++;
        int[][] freqArr = new int;
        for(int i = 0; i < 10; i++) {
            freqArr[i] = i; freqArr[i][1] = freq[i];
        }
        return freqArr;
    }

    public static void main(String[] args) {
        // Call methods and display results
    }
}
