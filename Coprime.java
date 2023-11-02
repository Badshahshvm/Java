package Algoprep;

public class Coprime {


    public static void coprPrimePair(int n)
    {
        for(int i=0;i<n/2;i++)
        {
            System.out.println(((2*i+1)+" "+(2*i+2)));
        }

    }

    public static void main(String[] args) {
        coprPrimePair(10);
    }
}
