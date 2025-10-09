package twoPointers;

import org.w3c.dom.ls.LSOutput;

public class ContainerWithMostWater {

    //This approach solves the problem but in O(n2) TC
    public static int maxArea(int[] height) {
        int maxWater = 0;
        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                int waterInCurrentContainer = (j-i) * Math.min(height[i],height[j]);
                maxWater = Math.max(maxWater,waterInCurrentContainer);
            }
        }
        return maxWater;
    }

    public static int maxAreaOptimized(int[] arr){
        int maxWater = 0;
        int left = 0;
        int right = arr.length-1;

        while(left<right){
            //waterArea = height * width
            int height = Math.min(arr[left],arr[right]);
            int width = right - left;
            int waterArea = height * width;
            maxWater = Math.max(waterArea,maxWater);

            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
//        int max = maxArea(height);
        int max = maxAreaOptimized(height);
        System.out.println("Max water contained can be : "+max);

    }
}

/**
 * 11. Container With Most Water
 * Medium
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * Return the maximum amount of water a container can store.
 * Notice that you may not slant the container.
 * Example 1:
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

 * Example 2:
 * Input: height = [1,1]
 * Output: 1
 *
 * Constraints:
 * n == height.length
 * 2 <= n <= 105
 * 0 <= height[i] <= 104
 */
