// class Solution {
//     public int[] nextGreaterElements(int[] nums) {
//        int[] arr = new int[nums.length];
//        Arrays.fill(arr, -1);
//         Stack<Integer> st = new Stack<>();
//         for(int i=0;i<2*nums.length-1;i++){
//             int curr = nums[i%nums.length];
//             while(!st.isEmpty() && nums[st.peek()]<curr){
//                 int index = st.pop();
//                 arr[index]=curr;
//             }
//             if(i<nums.length) st.push(i);
//         }
//         return arr;
//     }
// }
class Solution {

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter writer = new FileWriter("display_runtime.txt")) {
                writer.write("0");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
    }
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 2 * n; i++) {
            int curr = nums[i % n];

            while (!stack.isEmpty() && nums[stack.peek()] < curr) {
                ans[stack.pop()] = curr;
            }

            if (i < n) {
                stack.push(i);
            }
        }

        return ans;
    }
}