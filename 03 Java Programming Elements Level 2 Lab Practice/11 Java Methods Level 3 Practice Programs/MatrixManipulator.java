public class MatrixManipulator {

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] m = new int[rows][cols];
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                m[i][j]=(int)(Math.random()*90)+10;
        return m;
    }

    public static int[][] addMatrices(int[][] a,int[][] b){
        int r=a.length, c=a.length;
        int[][] res=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                res[i][j]=a[i][j]+b[i][j];
        return res;
    }

    public static int[][] subtractMatrices(int[][] a,int[][] b){
        int r=a.length, c=a.length;
        int[][] res=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                res[i][j]=a[i][j]-b[i][j];
        return res;
    }

    public static int[][] multiplyMatrices(int[][] a,int[][] b){
        int r=a.length, c=b.length;
        int[][] res=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                for(int k=0;k<a.length;k++)
                    res[i][j]+=a[i][k]*b[k][j];
        return res;
    }

    public static void main(String[] args) {
        // Implement and display operations
    }
}
