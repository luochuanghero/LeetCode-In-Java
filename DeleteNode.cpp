struct ListNode {
	int m_nValue;
	ListNode* m_pNext;
};

void DeleteNode(ListNode** pListHead, ListNode* pToBeDeleted) {
	if (!pListHead || !pToBeDeleted)
		return;
	//要删除的结点不是尾结点(O(1))
	if (pToBeDeleted->m_pNext != NULL) {
		//找到它的下一个结点
		ListNode* pNext = pToBeDeleted->m_pNext;
		//将下一个结点的内容覆盖到当前的结点
		pToBeDeleted->m_nValue = pNext->m_nValue;
		//将当前的结点指向下一个结点
		pToBeDeleted->m_pNext = pNext->m_pNext;
		delete pNext;
		pNext = NULL;
	}
	//链表中只有一个结点，删除它
	else if (*pListHead == pToBeDeleted) {
		delete pToBeDeleted;
		pToBeDeleted = NULL;
		*pListHead = NULL;
	}

	//要删除的结点是尾结点,遍历删除
	else {
		ListNode* pNode = *pListHead;
		while (pNode->m_pNext != pToBeDeleted) {
			pNode = pNode->m_pNext;
		}
		pNode->m_pNext = NULL;
		delete pToBeDeleted;
		pToBeDeleted = NULL;
	}
}
