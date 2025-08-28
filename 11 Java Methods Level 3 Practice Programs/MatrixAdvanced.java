public class MatrixAdvanced {

    public static int[][] createRandomMatrix(int rows,int cols){
        int[][] m = new int[rows][cols];
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                m[i][j]=(int)(Math.random()*90)+10;
        return m;
    }

    public static int[][] transpose(int[][] m){
        int r=m.length, c=m.length;
        int[][] t=new int[c][r];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                t[j][i]=m[i][j];
        return t;
    }

    public static int determinant2x2(int[][] m){
        return m*m[1][1]-m[1]*m[1];
    }

    public static int determinant3x3(int[][] m){
        return m*(m[1][1]*m-m[1]*m[1])
            -m[1]*(m[1]*m-m[1]*m)
            +m*(m[1]*m[1]-m[1][1]*m);
    }

    // Placeholder for 2x2/3x3 inverse
    public static void main(String[] args) {
        // Implement and display results
    }
}
