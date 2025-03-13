package Add_Two_Numbers;

public class ListNode {
    int val;
    ListNode next;
    
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) {this.val = val; this.next = next; }
    
    public void setValue(int val) { this.val = val; }
    public void setNextNode(ListNode next) { this.next = next; }

    public int getValue() { return val; }
    public ListNode getNextNode() { return next; }
}
