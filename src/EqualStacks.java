/***
 * You have three stacks of cylinders where each cylinder has the same diameter, but they may vary in height. You can change the height of a stack by removing and discarding its topmost cylinder any number of times.
 *
 * Find the maximum possible height of the stacks such that all of the stacks are exactly the same height. This means you must remove zero or more cylinders from the top of zero or more of the three stacks until they're all the same height, then print the height. The removals must be performed in such a way as to maximize the height.
 *
 * Note: An empty stack is still a stack.
 */

public class EqualStacks {

    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        int h1Len = h1.length;
        int h2Len = h2.length;
        int h3Len = h3.length;
        int h1Sum = 0;
        int h2Sum = 0;
        int h3Sum = 0;

        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        Stack stack3 = new Stack();
        int i = h1Len-1;
        while(i >= 0){
            h1Sum += h1[i];
            stack1.push(h1[i]);
            i--;
        }
        i = h2Len -1;
        while(i >= 0){
            h2Sum += h2[i];
            stack2.push(h2[i]);
            i--;
        }
        i = h3Len-1;
        while(i >= 0){
            h3Sum += h3[i];
            stack3.push(h3[i]);
            i--;
        }
        if(h1Sum == h2Sum && h1Sum == h3Sum){
            return h1Sum;
        }
        while(!(h1Sum == h2Sum && h1Sum == h3Sum) && h1Sum >= 0 && h2Sum >= 0 && h3Sum >= 0){
            int maxSum = Math.max(h1Sum, Math.max(h2Sum, h3Sum));
            if(maxSum == h1Sum){
                h1Sum = h1Sum - (int)stack1.pop();
            }else if(maxSum == h2Sum){
                h2Sum = h2Sum - (int)stack2.pop();
            }else if(maxSum == h3Sum){
                h3Sum = h3Sum - (int)stack3.pop();
            }
        }
        return h1Sum;
        /*
         * Write your code here.
         */

    }

    public static void main(String[] args) {
        int equalHeight = equalStacks(new int[]{3,2,1,1,1}, new int[]{4,3,2},new int[]{1,1,4,1} );
        System.out.println(equalHeight);
    }
}
