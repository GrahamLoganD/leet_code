class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list = l1;
        int carry = 0;

        while (l1.next != null) {
            int newVal = l1.val + l2.val + carry;

            if (newVal > 9) {
                carry = 1;
                newVal -= 10;
            } else {
                carry = 0;
            }

            l1.val = newVal;
            l1 = l1.next;
            l2 = l2.next;
        }

        return list;
    }
}