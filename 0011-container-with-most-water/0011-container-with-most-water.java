class Solution {
    public int maxArea(int[] height) {
         int m_area = 0;
          int left = 0;
          int right = height.length - 1;
          
          while (left < right) {
               int c_area = Math.min(height[left], height[right]) * (right - left);
               m_area = Math.max(m_area, c_area);

               if (height[left] < height[right]) {
                    left++;
               } else {
                    right--;
               }
          }

          return m_area;
    }
}