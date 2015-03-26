public int searchInsert(int[] A, int target) {
        if (A == null || A.length == 0)
            return -1;
        int start = 0;
        int end = A.length - 1;
        int mid = 0;

        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (A[mid] == target) {
                return mid;
            } else if (A[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (A[start] >= target) {
            return start;
        } else if (A[end] >= target) {
            return end;
        } else {
            return end + 1;
        }
}
