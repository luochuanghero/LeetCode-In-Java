package com.finals.link.leetcode;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		return (x == reverse(x));
	}

	public int reverse(int x) {
		int ret = 0;
		while (x != 0) {
			ret = ret * 10 + x % 10;
			if (ret < Integer.MIN_VALUE)
				return 0;
			if (ret > Integer.MAX_VALUE)
				return 0;
			x /= 10;
		}
		return ret;
	}
}
