package Algoprep;

public class QuickSort {
    public static int rearrange(int a[], int s, int e) {
        int p1 = s + 1;
        int p2 = e;
        while (p1 <= p2) {
            if (a[p1] <= a[s]) {
                p1++;
            } else if (a[p2] > a[s]) {
                p2--;
            } else {
                int temp = a[p1];
                a[p1] = a[p2];
                a[p2] = temp;
                p1++;
                p2--;
            }
        }

        int temp = a[s];
        a[s] = a[p2];
        a[p2] = temp;
        return p2;
    }

    public static void quickSort(int a[], int s, int e) {
        if (s < e) {
            int p = rearrange(a, s, e);
            quickSort(a, s, p - 1);
            quickSort(a, p + 1, e);
        }
    }
    public static void main(String[] args) {
        int a[] = {12, 34, 11, 5, 7, 10, 3, 70};
        quickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
