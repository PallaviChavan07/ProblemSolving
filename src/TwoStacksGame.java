import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class TwoStacksGame {
    private static final Scanner scanner = new Scanner(System.in);
    static int twoStacks(int x, int[]a, int[]b){
        int givenSum = x;
        Stack<Integer> one = new Stack();
        Stack<Integer> two = new Stack();
        if(a != null){
            for(int i = a.length-1; i >= 0; i--){
                one.push(a[i]);
            }
        }
        if(b != null){
            for (int i = b.length-1; i>= 0; i--){
                two.push(b[i]);
            }
        }

        int count1 = 0;
        while (x >= 0){
            if(one.isEmpty() && !two.isEmpty()){
                x = x - two.pop();
                if(x >= 0 ){
                    count1++;
                }
            }
            if(two.isEmpty() && !one.isEmpty()){
                x = x - one.pop();
                if(x >= 0 ){
                    count1++;
                }
            }
            if(!one.isEmpty() &&  !two.isEmpty()){
                if(one.peek() <= two.peek()){
                    x = x - one.pop();
                }else {
                    x= x - two.pop();
                }
                if(x >= 0 ){
                    count1++;
                }
            }
        }
        int sum = 0;
        int countOne = 0;
        int i = 0;
        while (sum <= givenSum && i<a.length ){
            sum = sum+a[i++];
            if(sum <= givenSum){
                countOne++;
            }
        }
        int countTwo = 0;
        sum = 0;
        i = 0;
        while (sum <= givenSum && i<b.length ){
            sum = sum+b[i++];
            if(sum <= givenSum){
                countTwo++;
            }
        }

        return Math.max(count1, Math.max(countOne, countTwo));

    }
    public static void main(String[] args) throws IOException {
//        System.out.println(twoStacks(62, new int[]{7,15,12,0,5,18,17,2,10,15,4,2,9,15,13,12,16}, new int[]{12,16,6,8,16,15,18,3,11,0,17,7,6,11,14,13,15,6,18,6,16,12,16,11,16,11} ));
//        System.out.println(twoStacks(5, new int[]{4,11,16,0,18,17,9,13,7,12,16,19,2,15,5,13,1,10,0,8,0,6,16,12,15,7,1,6,19,16,2}, new int[]{15,8,11,16,6,0,5,11,7,9,8,6,3,3,4,8,17,14,9,5,15,15,1,19,10,0,12,8,11,9,11,18,17,14} ));

            //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("C://Users//jpall//Desktop//input.txt")));

            int g = Integer.parseInt(scanner.nextLine().trim());

            for (int gItr = 0; gItr < g; gItr++) {
                String[] nmx = scanner.nextLine().split(" ");

                int n = Integer.parseInt(nmx[0].trim());

                int m = Integer.parseInt(nmx[1].trim());

                int x = Integer.parseInt(nmx[2].trim());

                int[] a = new int[n];

                String[] aItems = scanner.nextLine().split(" ");

                for (int aItr = 0; aItr < n; aItr++) {
                    int aItem = Integer.parseInt(aItems[aItr].trim());
                    a[aItr] = aItem;
                }

                int[] b = new int[m];

                String[] bItems = scanner.nextLine().split(" ");

                for (int bItr = 0; bItr < m; bItr++) {
                    int bItem = Integer.parseInt(bItems[bItr].trim());
                    b[bItr] = bItem;
                }

                //System.out.println("x = "+x+" Size of a = "+a.length+" size of b = "+b.length);
                int result = twoStacks(x, a, b);
                System.out.println(result);

//                bufferedWriter.write(String.valueOf(result));
//                bufferedWriter.newLine();
            }

            //bufferedWriter.close();

    }
}
