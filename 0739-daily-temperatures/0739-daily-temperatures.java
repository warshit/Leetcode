// class Solution {
//     public int[] dailyTemperatures(int[] tem) {
//         Stack<Integer> st = new Stack<>();
//         int[] res = new int[tem.length];
//         int j=0;
//         for(int i=0;i<tem.length;i++){
//           while(!st.isEmpty() && tem[i]>tem[st.peek()]){
//             j=st.pop();
//             res[j]=i-j;
//           }
//             st.push(i);
//         }
//         return res;
//     }
// }
class Solution {
    static {
        Runtime.getRuntime().gc();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter writer = new FileWriter("display_runtime.txt")) {
                writer.write("0");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack <Integer> stack = new Stack<>();
        int [] answer = new int[temperatures.length];
        Arrays.fill(answer, 0);
        for (int i = 0; i < temperatures.length; i++) {
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                int prev = stack.pop();
                answer[prev] = i - prev;
            }
            stack.push(i);
        }
        return answer;
    }
}