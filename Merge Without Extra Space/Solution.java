class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        long arr3[] = new long[n+m];
        int i = 0, j = 0, k = 0;
        while (i<n && j <m)
        {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        while (i < n)
            arr3[k++] = arr1[i++];
        while (j < m)
            arr3[k++] = arr2[j++];
        for(int x=0;x<n;x++){
            arr1[x]=arr3[x];
        }
        for(int x=0;x<m;x++){
            arr2[x]=arr3[n+x];
        }
    }
}
