import java.util.*;
public class day6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        String[] nums = num.split(" ");
        int n = nums.length;
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = Integer.parseInt(nums[i]);
        }
        for(int i=0; i<n;i++){
            Boolean flag =true;
            for(int j=i+1; j<n;j++){
                if(arr[i]<arr[j]){
                    flag=false;
                    break;
                }

            }
            if(flag) System.out.print(arr[i]+ " ");
        }


    }
}
