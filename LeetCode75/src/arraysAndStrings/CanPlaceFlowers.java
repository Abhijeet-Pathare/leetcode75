package arraysAndStrings;

public class CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        for(int i=0;i<flowerbed.length && n>0;i++){
            int left = i == 0 ? flowerbed[i] : flowerbed[i-1]; // for 0th index return it as left
            int right = i == length-1 ? flowerbed[i] : flowerbed[i+1];// for last index return the value as right
            if(left == 0 && right == 0 && flowerbed[i] == 0){ //check condition left,right and current element should be zero
                flowerbed[i] = 1;
                n--;
            }
        }
        return n==0 ? true : false;
    }
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
//        int[] flowerbed = {1,0,0,0,1};
//        int n = 2;
        boolean ans = canPlaceFlowers(flowerbed,n);
        System.out.println(ans);
    }
}

/**
 * 605. Can Place Flowers
 * Easy
 * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
 *
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: true
 * Example 2:
 *
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= flowerbed.length <= 2 * 104
 * flowerbed[i] is 0 or 1.
 * There are no two adjacent flowers in flowerbed.
 * 0 <= n <= flowerbed.length
 */