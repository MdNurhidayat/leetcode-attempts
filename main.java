import Two_Sum.Solution_1;
import Add_Two_Numbers.*;

public class main {
    public static void main(String[] args) {
        //call_solution_one();
        call_solution_two();
    }

    public static void call_solution_one ()
    {
        int target = 9;

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 4;
        arr[2] = 6; 
        arr[3] = 4;
        arr[4] = 5;

        int[] solution = Solution_1.twoSum(arr, 9);

        System.out.println("Target Number: " + target);
        System.out.println("The array indexes that add up to " + target + " is " + solution[0] + " & " + solution[1]);
    }
    public static void call_solution_two () {
        ListNode first = new ListNode(2);
        ListNode ptrNode = first;

        first.setNextNode(new ListNode(4));
        ptrNode = ptrNode.getNextNode();

        ptrNode.setNextNode(new ListNode(9));

        ListNode second = new ListNode(5);
        ptrNode = second;

        second.setNextNode(new ListNode(6));
        ptrNode = ptrNode.getNextNode();

        ptrNode.setNextNode(new ListNode(4));
        ptrNode = ptrNode.getNextNode();

        ptrNode.setNextNode(new ListNode(9));

        ListNode solution = Solution_2.addTwoNumbers_2(first, second);
        
        System.out.println("The two values being summed are : ");

        ptrNode = first;
        while (ptrNode.getNextNode() != null)
        {
            System.out.print(ptrNode.getValue());
            ptrNode = ptrNode.getNextNode();
        }
        
        System.out.println("\n");

        ptrNode = second;
        while (ptrNode.getNextNode() != null)
        {
            System.out.print(ptrNode.getValue());
            ptrNode = ptrNode.getNextNode();
        }

        System.out.println("\n");

        System.out.print("Their sums are : ");

        ptrNode = solution;
        while (ptrNode.getNextNode() != null)
        {
            System.out.print(ptrNode.getValue());
            ptrNode = ptrNode.getNextNode();
        }
    }
}
