
import java.util.Scanner;
public class ChocolateDistribution {
    public static int[] distributeChocolates(int chocolates, int children) {
        int perChild = chocolates / children;
        int remainder = chocolates % children;
        return new int[]{perChild, remainder};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        int[] result = distributeChocolates(chocolates, children);
        System.out.println("Each child gets " + result[0] + " chocolates, remainder is " + result[1]);
        sc.close();
    }
}
