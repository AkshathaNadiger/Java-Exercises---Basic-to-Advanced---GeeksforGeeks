import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int rem = target - num;

            if (hm.containsKey(rem)) {
                return new int[]{hm.get(rem), i};
            }
            hm.put(num, i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum s = new TwoSum();  // FIXED

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = s.twoSum(nums, target);

        if (result.length > 0) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found");
        }
    }
}
