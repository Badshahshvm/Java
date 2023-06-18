package Java;

public class SpiralMatrix {
    public static void spiralMatrix2D(int a[][],int r, int c)
    {
        int topRow=0, bottomRow=r-1, rightCol=c-1, leftCol=0;
        int te=0;
        while(te<r*c)
        {
            for(int i=leftCol;i<=rightCol && te <r*c;i++)
            {
                System.out.print(a[topRow][i]+" ");
                te++;
            }
            topRow++;
            for(int j=topRow;j<=bottomRow && te<r*c;j++)
            {
                System.out.print(a[j][rightCol]+" ");
                te++;
            }
            rightCol--;
            for(int t=rightCol;t>=leftCol && te<r*c;t--)
            {
                System.out.print(a[bottomRow][t]+" ");
                te++;
            }
            bottomRow--;
            for(int s=bottomRow;s>=topRow && te<r*c;s--)
            {
                System.out.print(a[s][leftCol]+"  ");
                te++;
            }
            leftCol++;
        }
    }
    public static void main(String[] args)
    {
        int a[][]={{1,2,3},{4,5,6},{8,9,10}};
        spiralMatrix2D(a,3,3);
    }
}
