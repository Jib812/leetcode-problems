class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        int si = 0 ;
        int a = 0,b=0,c= 0;
        
        while (a <m && b <n){
            
        if(nums1[a]<nums2[b]){
            arr[c++]=nums1[a++];
        }
        else {
            arr[c++]=nums2[b++];
        }
        }
        
        while(a<m){
            arr[c++]=nums1[a++];
        }

        while(b <n){
            arr[c++]=nums2[b++];
        }

        for(int i =0 ; i< m+n ; i++){
            nums1[i]=arr[i];
        }
    }
}