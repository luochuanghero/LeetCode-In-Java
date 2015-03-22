import java.util.HashMap;

/**
 * Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
 * You may assume that each input would have exactly one solution.
 */
public class TwoSum {

	public int[] twoSum(int[] numbers, int target) {
		if (numbers == null || numbers.length < 2)
			return null;
		HashMap<Integer, Integer> values = new HashMap<>();

		for (int i = 0; i < numbers.length; i++) {
			values.put(numbers[i], i + 1);
		}

		int[] indexs = new int[2];

		for (int i = 0; i < numbers.length; i++) {
			if (values.containsKey(target - numbers[i])) {
				int index1 = i + 1;
				int index2 = values.get(target - numbers[i]);
				if (index1 == index2)
					continue;
				indexs[0] = index1;
				indexs[1] = index2;
				//should return here
				//[3,2,4] 6 -> 3, 2 unacceptable
				return indexs;
			}
		}

		return indexs;
	}
}
