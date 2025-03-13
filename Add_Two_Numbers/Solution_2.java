package Add_Two_Numbers;

public class Solution_2 {

    public static ListNode addTwoNumbers_1(ListNode l1, ListNode l2)
    {
        ListNode solution_start, ptrNode;
        
        int result = l1.val + l2.val;
        int carry_over = 0;

        if (result > 9)
        {
            result %= 10;
            carry_over = 1;
        }  

        solution_start = new ListNode(result);
        ptrNode = solution_start;

        while (l1.next != null && l2.next != null)
        {
            l1 = l1.next;
            l2 = l2.next;

            result = l1.val + l2.val + carry_over;
            carry_over = 0;
            if (result > 9)
            {
                result %= 10;
                carry_over = 1;
            }

            ptrNode.next = new ListNode(result);
            ptrNode = ptrNode.next;
        }

        if (l1.next != null)
        {
            while (l1.next != null)
            {   
                l1 = l1.next;
                result = l1.val + carry_over;
                carry_over = 0;
                if (result > 9)
                {
                    result %= 10;
                    carry_over = 1;
                }
                ptrNode.next = new ListNode(result);

                // Iterate 
                ptrNode = ptrNode.next;
            }
        }
        else // l2.next != null 
        {
            while (l2.next != null)
            {
                l2 = l2.next;
                result = l2.val + carry_over;
                carry_over = 0;
                if (result > 9)
                {
                    result %= 10;
                    carry_over = 1;
                }
                ptrNode.next = new ListNode(result);

                // Iterate 
                ptrNode = ptrNode.next;
            }
        }

        if (carry_over == 1)
            ptrNode.next = new ListNode(carry_over);

        //print_solution(l1, l2, solution_start);
        return solution_start;
       
    }

    public static ListNode addTwoNumbers_2(ListNode l1, ListNode l2)
    {
        ListNode ptr;
        int first = 0, second = 0;
        
        ptr = l1;
        for (int counter = 0; ptr.getNextNode() != null; counter++, ptr = ptr.getNextNode())
            first += (counter * 10) + ptr.getValue();

        ptr = l2;
        for (int counter = 0; ptr.getNextNode() != null; counter++, ptr = ptr.getNextNode())
            second += (counter * 10) + ptr.getValue();

        System.out.println(first);
        System.out.println(second);
        
        return null;
    }
}