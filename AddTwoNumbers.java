package com.finals.link.leetcode;

/**
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 ** 
 */
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null || l2 == null) {
			return null;
		}

		int sum = 0;
		ListNode sentinel = new ListNode(0);
		ListNode d = sentinel;
		while (l1 != null || l2 != null) {
			sum /= 10;
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}

			d.next = new ListNode(sum % 10);
			d = d.next;
			if (sum / 10 == 1) {
				d = new ListNode(1);
			}
		}
		return sentinel.next;
	}
}
