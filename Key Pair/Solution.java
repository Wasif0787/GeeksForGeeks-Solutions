class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        Arrays.sort(arr);
        int lp=0;
        int rp=arr.length-1;
        while(lp!=rp){
            if(arr[lp]+arr[rp]==x){
                return true;
            }
            if(arr[lp]+arr[rp]<=x){
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }
}
