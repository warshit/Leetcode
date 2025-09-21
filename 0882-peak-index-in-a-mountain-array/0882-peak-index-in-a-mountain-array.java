class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if(arr.length==3) return 1;
        int l=0,h=arr.length-1;
        while(l<h){
            int mid=(l+h)/2;
            if(arr[mid]<arr[mid+1]) l=mid+1;
            else h=mid;
        }
        return l;
    }
}