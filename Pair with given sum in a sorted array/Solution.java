class Solution{
    
  
    int Countpair(int arr[], int n, int x)
    {
        // Complete the function
        int lp=0;
        int rp=arr.length-1;
        int ans=0;
        while(lp<rp){
            if(arr[lp]+arr[rp]==x){
                ans++;
                lp++;
                rp--;
            }
            else if(arr[lp]+arr[rp]<x){
                lp++;
            } else {
                rp--;
            }
        }
        if(ans>0) 
            return ans;
        else return -1;
    }
  
    
}
