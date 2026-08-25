package week2;

public class shufflecard {
   
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            result[j++] = nums[i];     // take xi
            result[j++] = nums[i + n]; // take yi
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] shuffled = shuffle(nums, n);

        System.out.print("Shuffled Array: ");
        for (int num : shuffled) {
            System.out.print(num + " ");
        }
    }
}
    

