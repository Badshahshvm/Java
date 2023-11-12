package Algoprep;

public class SortOneTwoZero {
    public static void sort(int nums[])
    {
        int ones=0;
        int twos=0;
        int zeros=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zeros++;
            }
            else if(nums[i]==1)
            {
                ones++;
            }
            else{
                twos++;
            }
        }

        int i=0;
        while(zeros>0)
        {
            nums[i++]=0;
            zeros--;
        }
        while(ones>0)
        {
            nums[i++]=1;
            ones--;
        }
        while(twos>0)
        {
            nums[i++]=2;
            twos--;
        }
        
    }

    public static void main(String[] args) {
        int a[]={0,0,2,2,1,2,1,2,1,0,2,0,1};

        sort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
