import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = in.nextInt();
            }
            int size = in.nextInt();
            int i = 0;
            int j =size-1;
            int max = Integer.MIN_VALUE;

            while ( j < n){
                for(int k = i; k <=j; k++){
                    if(nums[k] >max) max = nums[k];
                }
                System.out.print(max + " ");
                if(max == nums[i]) max = Integer.MIN_VALUE;
                i++;
                j++;
            }
        }
    }
}
