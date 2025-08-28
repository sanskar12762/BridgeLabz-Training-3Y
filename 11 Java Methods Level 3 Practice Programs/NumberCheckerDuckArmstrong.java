public class NumberCheckerDuckArmstrong {

    public static int countDigits(int number) {
        return (int)Math.floor(Math.log10(number) + 1);
    }

    public static int[] getDigits(int number, int count) {
        int[] digits = new int[count]; int temp = number;
        for(int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10; temp /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for(int d : digits) if(d == 0) return true;
        return false;
    }

    public static boolean isArmstrongNumber(int number, int[] digits) {
        int sum = 0, count = digits.length;
        for(int d : digits) sum += Math.pow(d, count);
        return sum == number;
    }

    public static int[] largestTwo(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for(int d : digits) {
            if(d > max1) { max2 = max1; max1 = d; }
            else if(d > max2 && d != max1) max2 = d;
        }
        return new int[]{max1, max2};
    }

    public static int[] smallestTwo(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for(int d : digits) {
            if(d < min1) { min2 = min1; min1 = d; }
            else if(d < min2 && d != min1) min2 = d;
        }
        return new int[]{min1, min2};
    }

    public static void main(String[] args) {
        // Call methods and display results
    }
}
