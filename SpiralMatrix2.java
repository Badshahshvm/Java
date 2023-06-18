package Java;

public class SpiralMatrix2 {


    public static int[][] generateMatrix(int n)
    {
        int [][] a=new int[n][n];
        int topRow=0,bottomRow=n-1, rightCol=n-1, leftCol=0;
        int curr=1;
        while(curr<=n*n)
        {
            for(int i=leftCol;i<=rightCol && curr<=n*n;i++)
            {
                a[topRow][i]=curr;
                curr++;
            }
            topRow++;
            for(int j=topRow;j<=bottomRow && curr<=n*n;j++)
            {
                a[j][rightCol]=curr;
                curr++;
            }rightCol--;
            for(int s=rightCol;s>=leftCol && curr<=n*n;s--)
            {
                a[bottomRow][s]=curr;
                curr++;
            }
            bottomRow--;
            for(int t=bottomRow;t>=topRow && curr<=n*n; t--)
            {
                a[t][leftCol]=curr;
                curr++;
            }
            leftCol++;
        }
        return a;
    }
    public static void printArray(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int s[][]=generateMatrix(5);
        printArray(s);
    }
}
