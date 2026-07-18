class Solution {
    public int findGCD(int[] arr) {
        int great=0;
        // int arr[]={0,2,5,6,9,10};
        Arrays.sort(arr);
        int min=arr[0],max=arr[arr.length-1];
        if(min!=0&&max!=0){
            for(int i=1;i<=min;i++){
                if(min%i==0&&max%i==0){
                    if(i>great) great=i;
                    
                }
            }
        }
        return great;
    }
}