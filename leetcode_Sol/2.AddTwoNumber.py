class Solution:
    def addTwoNumbers(self, l1 ,l2):
        head = ListNode(0)
        ptr = head
        c = 0

        while(l1 or l2):
            v1 = l1.val if l1 else 0
            v2 = l2.val if l2 else 0

            s  = v1 + v2 + c

            c = s // 10
            head.next = ListNode(s % 10)
            head = head.next
            
            if l1:
                l1 = l1.next
            if l2:
                l2 = l2.next
        
        if c:
            head.next = ListNode(c)

        return ptr.next
    
obj = Solution()
lst1 = [2,4,3]
lst2 = [5,6,4]

result = obj.addTwoNumbers(lst1 , lst2)
print(result)
        