package Algoprep;

public class SortEvenOdd {

    public static int [] sortNumber(int nums[])
    {
        int n = nums.length;
        int[] result = new int[n];

        int evenIndex = 0;
        int oddIndex = 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex] = num;
                evenIndex += 2;
            } else {
                result[oddIndex] = num;
                oddIndex += 2;
            }
        }

        return result;

    }


    public static void main(String[] args) {
        int a[]={12,4,5,2,7,910,36};
        int ans[]=sortNumber(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
