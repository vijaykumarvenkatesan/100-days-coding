import java.util.Scanner;

public class day2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int counter  = 0,threshold;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        threshold = input.nextInt();
        for(int i=0; i<n;i++){
            if(arr[i]%threshold!=0) counter += (arr[i]/threshold)+1;
            else counter += arr[i]/threshold;
        }
        System.out.println(counter);

    }
}
