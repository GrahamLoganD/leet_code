import java.util.ArrayList;

public class Main {
    private ListNode createList(ArrayList<Integer> array_list) {
        ListNode linked_list = new ListNode(array_list.remove(0));
        ListNode node = linked_list;
        while (!array_list.isEmpty()) {
            node.next = new ListNode(array_list.remove(0));
        }
    }

    public static void main(String[] args) {
        Solution();
    }
}