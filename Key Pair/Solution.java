class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<n;i++){

            int val = arr[i];

            if(hs.contains(x-val)){

                return true;

            }else{

          hs.add(val);

            }

        }

          return false;
    }
}
