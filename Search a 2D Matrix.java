public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean found = false;
		int rows = matrix.length;
		int columns = matrix[0].length - 1;
		if (matrix != null && rows > 0 && columns >= 0) {
			int row = 0;
			while (row < rows && columns >= 0) {
				if (matrix[row][columns] == target) {
					found = true;
					break;
				} else if (matrix[row][columns] > target) {
					--columns;
				} else {
					++row;
				}
			}
		}
		return found;
    }
}
