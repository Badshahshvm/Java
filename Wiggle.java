package Algoprep;

public class Wiggle {
    public static void wiggleSort(int nums[])
    {
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            if(i%2==0)
            {
                if(nums[i]>nums[i+1])
                {
                    int temp=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                }

            }
            else
            {
                if(nums[i]<nums[i+1])
                {
                    int temp=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int a[]={1,5,1,1,6,4};
        wiggleSort(a);

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
