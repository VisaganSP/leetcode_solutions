public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));

            if (height[left] < height[right])
                left++;
            else
                right--;
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights1 = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int[] heights2 = { 1, 1 };

        System.out.println(maxArea(heights1));
        System.out.println(maxArea(heights2));
    }
}
