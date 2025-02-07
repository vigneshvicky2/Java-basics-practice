import java.util.*;
public class permutations {
   public static void main(String[] args) {
        int[] nums ={1,2,3};
		List<List<Integer>> permutations = new ArrayList<>();
		if (nums.length == 0) {
			System.out.println(permutations);
			return;
		}

		collectPermutations(nums, 0, new ArrayList<>(), permutations);
		System.out.println(permutations);
    }

	public static void collectPermutations(int[] nums, int start, List<Integer> permutation,List<List<Integer>>  permutations) {
		
		if (permutation.size() == nums.length) {
			permutations.add(permutation);
			return;
		}

		for (int i = 0; i <= permutation.size(); i++) {
			List<Integer> newPermutation = new ArrayList<>(permutation);
			newPermutation.add(i, nums[start]);
			collectPermutations(nums, start + 1, newPermutation, permutations);
		}
	}
}