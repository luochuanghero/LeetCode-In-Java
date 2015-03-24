package com.finals.link.leetcode;

import java.util.HashSet;

public class LongestStringWithoutRepeat {
	public static int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0)
			return 0;
		HashSet<Character> set = new HashSet<Character>();
		int max = 0, leftbound = 0;
		for (int i = 0; i < s.length(); i++) {
			if (set.contains(s.charAt(i))) {
				while ((leftbound < i) && (s.charAt(i) != s.charAt(leftbound))) {
					set.remove(s.charAt(leftbound));
					leftbound++;
				}
				leftbound++;
			} else {
				set.add(s.charAt(i));
				max = Math.max(max, i - leftbound + 1);
			}
		}
		return max;
	}
}
