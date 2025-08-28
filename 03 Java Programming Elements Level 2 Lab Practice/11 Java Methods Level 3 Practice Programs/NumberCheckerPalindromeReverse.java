public class NumberCheckerPalindromeReverse {

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

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for(int i=0; i<arr.length; i++) rev[i] = arr[arr.length-1-i];
        return rev;
    }

    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length) return false;
        for(int i=0; i<arr1.length; i++) if(arr1[i]!=arr2[i]) return false;
        return true;
    }

    public static boolean isPalindrome(int[] digits) {
        return arraysEqual(digits, reverseArray(digits));
    }

    public static boolean isDuckNumber(int[] digits) {
        for(int d : digits) if(d == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        // Call methods and display results
    }
}
