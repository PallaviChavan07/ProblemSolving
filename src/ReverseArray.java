public class ReverseArray {

    public static int[] reverseArray(int [] arr){
        if(arr == null){
            return arr;
        }
        int arrayLen = arr.length;
        for(int i = 0; i<arrayLen/2; i++){
            int temp = arr[i];
            arr[i] = arr[arrayLen-1-i];
            arr[arrayLen-1-i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] revereseArray = reverseArray(new int[]{1,4,3,2});
        for(int i: revereseArray){
            System.out.print(i+" ");
        }
    }
}
