
import java.util.Scanner;
public class YoungestTallestFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        int[] heights = new int[3];
        for(int i = 0; i < 3; i++) {
            System.out.println("Enter age and height for friend " + (i + 1));
            ages[i] = sc.nextInt();
            heights[i] = sc.nextInt();
        }
        int youngest = ages[0];
        int tallest = heights[0];
        for(int i = 1; i < 3; i++) {
            if(ages[i] < youngest)
                youngest = ages[i];
            if(heights[i] > tallest)
                tallest = heights[i];
        }
        System.out.println("Youngest friend age: " + youngest);
        System.out.println("Tallest friend height: " + tallest);
        sc.close();
    }
}
