public class CollinearPointsChecker {

    public static boolean areCollinearSlope(int x1,int y1,int x2,int y2,int x3,int y3) {
        double ab = (double)(y2-y1)/(x2-x1);
        double bc = (double)(y3-y2)/(x3-x2);
        double ac = (double)(y3-y1)/(x3-x1);
        return ab == bc && bc == ac;
    }

    public static boolean areCollinearArea(int x1,int y1,int x2,int y2,int x3,int y3) {
        double area = 0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
        return area == 0;
    }

    public static void main(String[] args) {
        // Use sample points and implement input check
    }
}
