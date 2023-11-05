package Algoprep;

public class SingleNumber {
    public static int unique(int a[])
    {
        int n=a.length;
        if(a[0]!=a[1])
        {
            return a[0];
        }

        if(a[n-1]!=a[n-2])
        {
            return a[n-1];
        }

        int s=2;
        int e=n-3;
        while(s<=e)
        {
            int m=(s+e)/2;
            if(a[m]!=a[m-1] && a[m]!=a[m+1])
            {
                return a[m];
            }

            if(a[m]==a[m-1])
            {
                m--;
            }
            if(m%2==0)
            {
                s=m+1;
            }
            else {
                e=m-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={ 2,2,5,7,7,8,8};
        int ans=unique(a);
        System.out.println(ans);

    }
}
