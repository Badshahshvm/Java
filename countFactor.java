package Algoprep;

public class countFactor {
    public static int countF(int n)
    {
        int count=0;
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                if(i!=n/i)
                {
                    count=count+2;
                }
                else {
                    count++;
                }

            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int ans=countF(15);
        System.out.println(ans);
    }
}
